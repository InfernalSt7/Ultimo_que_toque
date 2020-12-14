package com.spring.ultimoquetoque.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
import com.spring.ultimoquetoque.model.ClasificacionModel;
import com.spring.ultimoquetoque.model.EntrenadorModel;
import com.spring.ultimoquetoque.model.EquipoModel;
import com.spring.ultimoquetoque.model.JugadorModel;
import com.spring.ultimoquetoque.model.LigaModel;
import com.spring.ultimoquetoque.service.ClasificacionService;
import com.spring.ultimoquetoque.service.EntrenadorService;
import com.spring.ultimoquetoque.service.EquipoService;
import com.spring.ultimoquetoque.service.JuegaService;
import com.spring.ultimoquetoque.service.JugadorService;
import com.spring.ultimoquetoque.service.LigaService;


@Controller
@RequestMapping("/")
public class EquipoController {

	private static final Log LOG=LogFactory.getLog(EquipoController.class);
	
	@Autowired
	@Qualifier("equipoServiceImpl")
	private EquipoService equipoService;
	
	@Autowired
	@Qualifier("entrenadorServiceImpl")
	private EntrenadorService entrenadorService;
	
	@Autowired
	@Qualifier("clasificacionServiceImpl")
	private ClasificacionService clasificacionService;
	
	@Autowired
	@Qualifier("ligaServiceImpl")
	private LigaService ligaService;
	
	@Autowired
	@Qualifier("jugadorServiceImpl")
	private JugadorService jugadorService;

	
	@GetMapping("/listEquipos")
	public ModelAndView listEquipos() {
		ModelAndView mav = new ModelAndView(Constantes.EQUIPO_VIEW);
		mav.addObject("equipos", equipoService.listEquipos());
		return mav;
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@PostMapping("/addEquipo")
    public ModelAndView addEquipo(@RequestParam(name="nombreE") String nombreE, @ModelAttribute("imagen") MultipartFile img, @Valid @ModelAttribute("equipos") EquipoModel equipoModel, BindingResult result,
            RedirectAttributes flash, Model model) {
		
			ModelAndView mav = new ModelAndView();
			
			EntrenadorModel entrenadorModel= new EntrenadorModel();
			List<EntrenadorModel> list=entrenadorService.listEntrenadores();
			
			LigaModel ligaModel = new LigaModel();
			List <LigaModel> listL = ligaService.listLigas();
			LOG.info("entrenador" + entrenadorService.listEntrenadores().get(0).getNombre());
			
			for(EntrenadorModel em:list) {
				if(em.getNombre().equals(nombreE)) {
					entrenadorModel=em;
				}
				
			}
			
			for (LigaModel lm: listL) {
				if(lm.getId_liga() == 1) {
					ligaModel = lm;
				}
			}
			
            if (result.hasErrors()) {
            	model.addAttribute("entrenadores", entrenadorService.listEntrenadores());
            	mav.setViewName("redirect:/formEquipo?id=-1");
            }else {
                if(!img.isEmpty()) {
                    Path directory=Paths.get(".\\src\\main\\resources\\static\\img");
                    String ruta=directory.toFile().getAbsolutePath();
                    LOG.info("ruta"+ruta);
                    try {
                        byte[] bytes=img.getBytes();
                        Path rutaCompleta=Paths.get(ruta+"\\"+equipoModel.getId()+equipoModel.getNombre()+".png");
                        LOG.info("test"+rutaCompleta);
                        Files.write(rutaCompleta,bytes);
                        equipoModel.setFoto("/img/"+equipoModel.getId() + equipoModel.getNombre()+".png");
                    }catch(IOException e) {
                        e.printStackTrace();
                    }
                }else {
                    
                	equipoModel.setFoto("/img/real_madrid.png");
                    LOG.info("/images/0Pikachu.png");
                }
                
                equipoModel.setId_liga(ligaModel);
                equipoModel.setEntrenador(entrenadorModel);
                LOG.info("Campos: " + equipoModel.getEstadio()+ " " + equipoModel.getFoto() + " " + equipoModel.getNombre() + equipoModel.getPresidente() + equipoModel.getPresupuesto() + equipoModel.getTitulos() + equipoModel.getEntrenador().getNombre() + equipoModel.getId_liga().getNombre());
                EquipoModel equipo = equipoService.addEquipo(equipoModel);
                int puesto = equipoService.listEquipos().size();
                
                ClasificacionModel clasificacionModel = new ClasificacionModel(Integer.toString(puesto), 0, 0, 0, 0, 0, 0, 0,
            			equipoModel);
                LOG.info("por aquí paso");
                clasificacionModel.setPuesto(Integer.toString(puesto));
                clasificacionModel.setEquipo(equipo);
                clasificacionService.addClasificacion(clasificacionModel);
                //
                LOG.info("por aquí no paso");
                mav.setViewName("redirect:/clasificacion");
                LOG.info("mav " + mav);
                //
            }
            LOG.info("Después del mav");
            return mav;
        } 
	
	/*@PostMapping("/addEquipo")
	public String addEquipo(@ModelAttribute("equipo") EquipoModel equipoModel) {
		equipoService.addEquipo(equipoModel);
		return "redirect:/equipo/listEquipos";
		
	}*/
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/formEquipo")
	public String formEquipo(@RequestParam(name="id") int id, Model model){
		EquipoModel equipoModel=new EquipoModel();
	if(id!=-1) {
		List<EquipoModel> list=equipoService.listEquipos();
		for(EquipoModel em:list) {
			if(em.getId()==id) {
				equipoModel=em;
			}
		}
	}
	model.addAttribute("equipo",equipoModel);
	model.addAttribute("entrenadores", entrenadorService.listEntrenadores());

	return Constantes.FORMEQUIPO_VIEW;
	}	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/deleteEquipo")
	public String deleteEquipo(@RequestParam("id") int id) {
		clasificacionService.removeClasificacion(id);
		equipoService.removeEquipo(id);
		return "redirect:/clasificacion";
	}
	
	@GetMapping("/detailjugador")
    public ModelAndView detailJugador(@RequestParam(name="id") int id, JugadorModel jugadorModel) {
        ModelAndView mav = new ModelAndView();
		List<JugadorModel> jlist = jugadorService.detailjugador(id);
        mav.addObject("jm", jlist);
        
        return mav;
    }
	
	@GetMapping("/detailequipo")
    public ModelAndView detailEquipo(@RequestParam(name="id") int id, EquipoModel equipomodel) {
		ModelAndView mav = new ModelAndView(Constantes.DETAILEQUIPO_VIEW);
        EquipoModel equipoModel=new EquipoModel();
        
            for(EquipoModel em:equipoService.listEquipos()) {
                if(em.getId()==id) {
                    equipoModel=em;
                }

                
            }
        mav.addObject("em", equipoModel);
        
        return mav;
	}
}
