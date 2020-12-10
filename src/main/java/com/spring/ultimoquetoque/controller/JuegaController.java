	package com.spring.ultimoquetoque.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ultimoquetoque.constantes.Constantes;
import com.spring.ultimoquetoque.model.EquipoModel;
import com.spring.ultimoquetoque.model.JuegaModel;
import com.spring.ultimoquetoque.model.PartidosModel;
import com.spring.ultimoquetoque.service.EquipoService;
import com.spring.ultimoquetoque.service.JuegaService;
import com.spring.ultimoquetoque.service.PartidosService;

@Controller
@RequestMapping("/")
public class JuegaController {

private static final Log LOG=LogFactory.getLog(JuegaController.class);

	@Autowired
	@Qualifier("juegaServiceImpl")
	private JuegaService juegaService;
	
	@Autowired
	@Qualifier("equipoServiceImpl")
	private EquipoService equipoService;
	
	@Autowired
	@Qualifier("partidosServiceImpl")
	private PartidosService partidosService;

	@GetMapping("/formResultado")
	public String formResultado(Model model)  {
		JuegaModel juegaModel=new JuegaModel();
		
		
		model.addAttribute("resultados",juegaModel);
		model.addAttribute("equipos", equipoService.listEquipos());
		model.addAttribute("partidos", partidosService.listPartidos());
		return Constantes.FORMRESULTADOS_VIEW;
	}
	
	@PostMapping("/addResultado")
	public ModelAndView addResultado(@RequestParam(name="id_partido") int id_partido, @RequestParam(name="local") int local, 
			@RequestParam(name="visitante") int visitante, @ModelAttribute("resultados") JuegaModel juegaModel) {
		ModelAndView mav = new ModelAndView();
		PartidosModel partidosModel = new PartidosModel();
		List<PartidosModel> plist = partidosService.listPartidos();
		
		for (PartidosModel pm: plist) {
			if (pm.getId()==id_partido) {
				partidosModel=pm;
			}
		}
		
		EquipoModel emodelloc = new EquipoModel();
		List <EquipoModel> elist = equipoService.listEquipos();
		for (EquipoModel emloc: elist) {
			if (emloc.getId() == local) {
				emodelloc = emloc;
			}
		}
		EquipoModel emodelvis = new EquipoModel();
		List<EquipoModel> elistvis = equipoService.listEquipos();
		for (EquipoModel emvis: elistvis) {
			if (emvis.getId()==visitante) {
				emodelvis=emvis;
			}
		}
		juegaModel.setFk_partido(partidosModel);
		juegaModel.setEquipo_local(emodelloc);
		juegaModel.setEquipo_visitante(emodelvis);
		juegaService.addResultados(juegaModel);
		mav.setViewName(Constantes.PARTIDOS_VIEW);
		return mav;
		
	}
}
