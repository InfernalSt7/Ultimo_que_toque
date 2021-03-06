package com.spring.ultimoquetoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ultimoquetoque.constantes.Constantes;
import com.spring.ultimoquetoque.entity.Entrenador;
import com.spring.ultimoquetoque.model.EntrenadorModel;
import com.spring.ultimoquetoque.repository.EntrenadorJpaRepository;
import com.spring.ultimoquetoque.service.EntrenadorService;


@Controller
@RequestMapping("/")
public class EntrenadorController {
	
	@Autowired
	@Qualifier("entrenadorServiceImpl")
	private EntrenadorService entrenadorService;
	
	
	@Autowired
	@Qualifier("entrenadorRepository")
	private EntrenadorJpaRepository entrenadorJpaRepository;
	
	@GetMapping("/listEntrenadores")
	public ModelAndView listEntrenadores() {
		ModelAndView mav = new ModelAndView(Constantes.ENTRENADOR_VIEW);
		mav.addObject("entrenadores", entrenadorService.listEntrenadores());
		return mav;
	}
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@PostMapping("/anadirEntrenador")
	public String anadirEntrenador(@ModelAttribute("entrenador") EntrenadorModel entrenadorModel) {
		entrenadorService.addEntrenador(entrenadorModel);
		return "redirect:/formEquipo?id=-1";
		
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@PostMapping("/updateEntrenador")
	public String updateEntrenador(@ModelAttribute("entrenador") EntrenadorModel entrenadorModel) {
		entrenadorService.addEntrenador(entrenadorModel);
		return "redirect:/clasificacion";
		
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/createEntrenador")
	public ModelAndView createEntrenador(){
		ModelAndView mav = new ModelAndView(Constantes.FORMENTRENADOR_VIEW);
		mav.addObject("entrenador", new Entrenador());
		return mav;
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/editEntrenador")
	public ModelAndView editEntrenador(@RequestParam(name="id") int id, Model model){
		ModelAndView mav = new ModelAndView(Constantes.UPDATEENTRENADOR_VIEW);
		if (id ==0) {
			mav.addObject("entrenador", new EntrenadorModel());
		} else {
			mav.addObject("entrenador", entrenadorService.updateEntrenador(id));
		}
		return mav;
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/deleteEntrenador")
	public String deleteEntrenador(@RequestParam("id_entrenador") int id_entrenador) {
		EntrenadorModel entrenadorModel = new EntrenadorModel();
		entrenadorModel.setNombre(null);
		entrenadorService.removeEntrenador(id_entrenador);
		return "redirect:/clasificacion";
	}
}
