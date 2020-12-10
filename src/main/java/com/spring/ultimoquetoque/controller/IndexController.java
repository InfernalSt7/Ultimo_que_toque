package com.spring.ultimoquetoque.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ultimoquetoque.constantes.Constantes;
import com.spring.ultimoquetoque.service.JuegaService;

@Controller
@RequestMapping("/")
public class IndexController {
	
	private static final Log LOG=LogFactory.getLog(IndexController.class);
	
	@Autowired
	@Qualifier("juegaServiceImpl")
	private JuegaService juegaService;
	
	@GetMapping("/")
	public ModelAndView inicio() {
		ModelAndView mav=new ModelAndView(Constantes.INICIO_VIEW);
		LOG.info("Estamos método del inicio y nos devuelve la vista"+Constantes.INICIO_VIEW);
		mav.addObject("resultados",juegaService.listResultados());
		return mav;
	}

}
