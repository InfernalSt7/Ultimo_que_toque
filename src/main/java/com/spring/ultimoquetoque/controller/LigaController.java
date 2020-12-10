package com.spring.ultimoquetoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ultimoquetoque.entity.Liga;
import com.spring.ultimoquetoque.model.LigaModel;
import com.spring.ultimoquetoque.repository.LigaJpaRepository;
import com.spring.ultimoquetoque.service.LigaService;


@Controller
@RequestMapping("/ultimo_que_toque")
public class LigaController {

	private static final String LIGA_VIEW="liga";
	private static final String CREATE_VIEW="create";
	
	@Autowired
	@Qualifier("ligaServiceImpl")
	private LigaService ligaService;
	
	
	@Autowired
	@Qualifier("ligaRepository")
	private LigaJpaRepository ligaJpaRepository;
	
	@GetMapping("/listLigas")
	public ModelAndView listLigas() {
		ModelAndView mav = new ModelAndView(LIGA_VIEW);
		mav.addObject("liga",new Liga());
		mav.addObject("ligas", ligaService.listLigas());
		return mav;
	}
	
	@PostMapping("/addLiga")
	public String addLiga(@ModelAttribute("liga") LigaModel ligaModel) {
		ligaService.addLiga(ligaModel);
		return "redirect:/ultimo_que_toque/listLigas";
		
	}
	
	
	@GetMapping("/createLiga")
	public ModelAndView createLiga(){
		ModelAndView mav=new ModelAndView(CREATE_VIEW);
		mav.addObject("liga",new Liga());
		return mav;
	}
	
	
	@PostMapping("/deleteLiga")
	public String deleteLiga(@RequestParam("id") int id) {
		ligaService.removeLiga(id);
		return "redirect:/ultimo_que_toque/listLigas";
	}
}
