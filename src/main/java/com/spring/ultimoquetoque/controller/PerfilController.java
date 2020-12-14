	package com.spring.ultimoquetoque.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ultimoquetoque.constantes.Constantes;
import com.spring.ultimoquetoque.model.JugadorModel;
import com.spring.ultimoquetoque.model.UserModel;
import com.spring.ultimoquetoque.service.JuegaService;
import com.spring.ultimoquetoque.service.UserService;

@Controller
@RequestMapping("/")
public class PerfilController {

private static final Log LOG=LogFactory.getLog(PerfilController.class);

	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	@Autowired
	@Qualifier("juegaServiceImpl")
	private JuegaService juegaService;

	@GetMapping("/perfil")
	public ModelAndView perfil(Authentication auth, UserModel userModel) {
		ModelAndView mav=new ModelAndView(Constantes.PERFIL_VIEW);
		LOG.info("Estamos método del perfil y nos devuelve la vista"+Constantes.PERFIL_VIEW);
		List<UserModel> userlist = userService.listUsers();
		for(UserModel um:userlist) {   	
            if(um.getUsername().equals(auth.getName())) {
                userModel = um;
                
            }
        }
		mav.addObject("resultados",juegaService.listResultados());
		mav.addObject("user", userModel);
		return mav;
	}
}
