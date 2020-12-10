package com.spring.ultimoquetoque.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ultimoquetoque.constantes.Constantes;
import com.spring.ultimoquetoque.model.EquipoModel;
import com.spring.ultimoquetoque.model.JuegaModel;
import com.spring.ultimoquetoque.repository.ClasificacionJpaRepository;
import com.spring.ultimoquetoque.service.ClasificacionService;
import com.spring.ultimoquetoque.service.EquipoService;
import com.spring.ultimoquetoque.service.JuegaService;


@Controller
@RequestMapping("/")
public class ClasificacionController {
	
	private static final Log LOG=LogFactory.getLog(ClasificacionController.class);
	
	@Autowired
	@Qualifier("clasificacionServiceImpl")
	private ClasificacionService clasificacionService;
	
	@Autowired
	@Qualifier("juegaServiceImpl")
	private JuegaService juegaService;
	
	@Autowired
	@Qualifier("equipoServiceImpl")
	private EquipoService equipoService;
	
	
	@Autowired
	@Qualifier("clasificacionRepository")
	private ClasificacionJpaRepository clasificacionJpaRepository;
	
	@GetMapping("/clasificacion")
	public ModelAndView listClasificacion() {
		ModelAndView mav = new ModelAndView(Constantes.CLASIFICACION_VIEW);
		//mav.addObject("clasificacion",new Clasificacion());		
		mav.addObject("clasificaciones", clasificacionService.listClasificacion());
		return mav;
	}
}
