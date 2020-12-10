	package com.spring.ultimoquetoque.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ultimoquetoque.constantes.Constantes;
import com.spring.ultimoquetoque.entity.Partidos;
import com.spring.ultimoquetoque.model.JuegaModel;
import com.spring.ultimoquetoque.model.PartidosModel;
import com.spring.ultimoquetoque.service.EquipoService;
import com.spring.ultimoquetoque.service.JuegaService;
import com.spring.ultimoquetoque.service.PartidosService;




@Controller
@RequestMapping("/")
public class PartidosController {

	private static final Log LOG=LogFactory.getLog(PartidosController.class);
	
	@Autowired
	@Qualifier("partidosServiceImpl")
	private PartidosService partidosService;
	
	@Autowired
	@Qualifier("equipoServiceImpl")
	private EquipoService equipoService;
	
	@Autowired
	@Qualifier("juegaServiceImpl")
	private JuegaService juegaService;
	
	@GetMapping("/resultados")
	public ModelAndView listPartidos(JuegaModel juegamodel) {
		ModelAndView mav = new ModelAndView(Constantes.PARTIDOS_VIEW);
		//mav.addObject("clasificacion",new Clasificacion());
		LOG.info("Partido:" + juegamodel.getEquipo_local());
		mav.addObject("resultados", juegaService.listResultados());
		return mav;
		
	}
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/addPartidos")
	public String addPartidos(@ModelAttribute("partidos") PartidosModel partidosModel) {
		// Parsear la fecha para pasar de String a Date //
			Date date = new Date();
			SimpleDateFormat objSDF = new SimpleDateFormat("yyyy-MM-dd");
		// ------------------------------------------- //
		partidosModel.setFecha(objSDF.format(date));
		partidosService.addPartidos(partidosModel);		
		return "redirect:/formResultado";
		
	}	
	
	@GetMapping("/detailpartidos")
	public ModelAndView detailPartidos(@RequestParam(name="id") int id) {
        
		PartidosModel partidosModel = new PartidosModel();
		
		ModelAndView mav = new ModelAndView(Constantes.PARTIDOS_VIEW);
		for(PartidosModel pm:partidosService.listPartidos()) {
            if(pm.getId()==id) {
                partidosModel= pm;
            }
        }
		
		mav.addObject("pm", partidosModel);	
		
		return mav;
}
}
