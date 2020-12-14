	package com.spring.ultimoquetoque.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.ultimoquetoque.constantes.Constantes;
import com.spring.ultimoquetoque.model.ClasificacionModel;
import com.spring.ultimoquetoque.model.EquipoModel;
import com.spring.ultimoquetoque.model.JuegaModel;
import com.spring.ultimoquetoque.model.PartidosModel;
import com.spring.ultimoquetoque.service.ClasificacionService;
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
	
	@Autowired
	@Qualifier("clasificacionServiceImpl")
	private ClasificacionService clasificacionService;

	@GetMapping("/formResultado")
	public String formResultado(Model model)  {
		JuegaModel juegaModel=new JuegaModel();
		
		
		model.addAttribute("resultados",juegaModel);
		model.addAttribute("equipos", equipoService.listEquipos());
		model.addAttribute("partidos", partidosService.listPartidos());
		return Constantes.FORMRESULTADOS_VIEW;
	}

	
	@PostMapping("/addResultado")
	public ModelAndView addResultado(@RequestParam(name="id_partido") int id_partido, @RequestParam(name="local") int local, @RequestParam(name="visitante") int visitante, @Valid @ModelAttribute("resultados") JuegaModel juegaModel,  BindingResult result, 
			RedirectAttributes flash, Model model, EquipoModel equipoModel) {
		
		ModelAndView mav=new ModelAndView();
		PartidosModel partidosModel=new PartidosModel();
		List<PartidosModel> listP=partidosService.listPartidos();
		for(PartidosModel pm:listP) {
			if(pm.getId()==id_partido) {
				partidosModel=pm;
			}
			
		}
		
		EquipoModel modellocal=new EquipoModel();

		List<EquipoModel> listEloc= equipoService.listEquipos();
		for(EquipoModel elocal:listEloc) {
			if(elocal.getId() == local) {
				modellocal=elocal;
			}
			
		}
		
		EquipoModel modelvis=new EquipoModel();

		List<EquipoModel> listEvis= equipoService.listEquipos();
		for(EquipoModel evis:listEvis) {
			if(evis.getId() == visitante) {
				modelvis=evis;
			}
			
		}
		
		if(result.hasErrors()) {
			
			mav.setViewName(Constantes.FORMPARTIDOS_VIEW);
			model.addAttribute("equipos", equipoService.listEquipos());
			model.addAttribute("partidos", partidosService.listPartidos());
			
		}else {
			juegaModel.setEquipo_local(modellocal);
			LOG.info("ID equipo " + modellocal.getId() + " Nombre equipo: " + modellocal.getNombre());
			
			juegaModel.setEquipo_visitante(modelvis);
			juegaModel.setFk_partido(partidosModel);
			juegaService.addResultados(juegaModel);

			clasificacionService.modificarClasificacion(juegaModel);
            
			mav.setViewName("redirect:/resultados");
			
		
		}
		return mav;
	}
}
