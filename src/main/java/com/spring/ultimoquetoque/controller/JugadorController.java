package com.spring.ultimoquetoque.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.ultimoquetoque.constantes.Constantes;
import com.spring.ultimoquetoque.entity.Jugador;
import com.spring.ultimoquetoque.model.EntrenadorModel;
import com.spring.ultimoquetoque.model.EquipoModel;
import com.spring.ultimoquetoque.model.JugadorModel;
import com.spring.ultimoquetoque.repository.JugadorJpaRepository;
import com.spring.ultimoquetoque.service.EquipoService;
import com.spring.ultimoquetoque.service.JugadorService;


@Controller
@RequestMapping("/")
public class JugadorController {
	
	private static final Log LOG=LogFactory.getLog(JugadorController.class);
	
	@Autowired
	@Qualifier("jugadorServiceImpl")
	private JugadorService jugadorService;
	
	@Autowired
	@Qualifier("equipoServiceImpl")
	private EquipoService equipoService;
	
	@Autowired
	@Qualifier("jugadorRepository")
	private JugadorJpaRepository jugadorJpaRepository;
	
	@GetMapping("/listJugadores")
	public ModelAndView listJugadores() {
		ModelAndView mav = new ModelAndView(Constantes.JUGADOR_VIEW);
		mav.addObject("jugador",new Jugador());
		mav.addObject("jugadores", jugadorService.listJugadores());
		return mav;
	}
	
	/*@PostMapping("/addJugador")
	public String addJugador(@ModelAttribute("jugador") JugadorModel jugadorModel) {
		jugadorService.addJugador(jugadorModel);
		return "redirect:/clasificacion";
		
	}*/
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@PostMapping("/addJugador")
    public ModelAndView addJugador(@RequestParam(name="id") int id, @ModelAttribute("imagen") MultipartFile img, @Valid @ModelAttribute("jugadores") JugadorModel jugadorModel, BindingResult result,
            RedirectAttributes flash, Model model) {
			ModelAndView mav = new ModelAndView();
			
			// Parsear la fecha para pasar de String a Date //
			Date date = new Date();
			SimpleDateFormat objSDF = new SimpleDateFormat("yyyy-MM-dd");
			// ------------------------------------------- //
			EquipoModel equipoModel = equipoService.filtrarEquipo(id);
			
            if (result.hasErrors()) {
            	LOG.info("Result error: " + result);
            	mav.setViewName("redirect:/createJugador");
            }else {
                if(!img.isEmpty()) {
                    Path directory=Paths.get(".\\src\\main\\resources\\static\\img");
                    String ruta=directory.toFile().getAbsolutePath();
                    LOG.info("ruta"+ruta);
                    try {
                        byte[] bytes=img.getBytes();
                        Path rutaCompleta=Paths.get(ruta+"\\"+jugadorModel.getId()+jugadorModel.getNombre()+".png");
                        LOG.info("test"+rutaCompleta);
                        Files.write(rutaCompleta,bytes);
                        jugadorModel.setFoto("/img/"+jugadorModel.getId() + jugadorModel.getNombre()+".png");
                    }catch(IOException e) {
                        e.printStackTrace();
                    }
                }else {
                	jugadorModel.setFoto("/img/mariano.png");
                }
                System.out.println(equipoModel.getNombre());
                jugadorModel.setFecha_nacimiento(objSDF.format(date));
                jugadorModel.setId_Equipo(equipoModel);
                jugadorService.addJugador(jugadorModel);
                
                
                mav.setViewName("redirect:/clasificacion");
                
            }
            return mav;
        } 
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/formJugador")
	public String formJugador(@RequestParam(name="id") int id, Model model){
		JugadorModel jugadorModel=new JugadorModel();
		if(id!=-1) {
			List<JugadorModel> list=jugadorService.listJugadores();
			for(JugadorModel jm:list) {
				if(jm.getId()==id) {
					jugadorModel=jm;
				}
			}
		}
		model.addAttribute("jugador",jugadorModel);
		

		return Constantes.FORMJUGADOR_VIEW;
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@PostMapping("/deletejugador")
	public String deleteJugador(@RequestParam("id") int id) {
		jugadorService.removeJugador(id);
		return "redirect:/clasificacion";
	}
}
