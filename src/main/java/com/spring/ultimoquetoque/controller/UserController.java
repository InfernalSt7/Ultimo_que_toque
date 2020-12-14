package com.spring.ultimoquetoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ultimoquetoque.constantes.Constantes;
import com.spring.ultimoquetoque.model.EquipoModel;
import com.spring.ultimoquetoque.model.UserModel;
import com.spring.ultimoquetoque.service.JuegaService;
import com.spring.ultimoquetoque.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	@Autowired
	@Qualifier("juegaServiceImpl")
	private JuegaService juegaService;
	
	@GetMapping("/listUsers")
	public ModelAndView listUsers() {
		ModelAndView mav = new ModelAndView(Constantes.USER_VIEW);
		mav.addObject("users", userService.listUsers());
		mav.addObject("resultados",juegaService.listResultados());
		return mav;
	}	
	
	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam("id") int id) {
		userService.deleteUser(id);
		return "redirect:/registro";
	}
	
	@GetMapping("/updateUser")
	public String updateUser(@RequestParam(name="id") int id, Model model) {
		UserModel userModel=new UserModel();
		if(id!=-1) {
			List<UserModel> list=userService.listUsers();
			for(UserModel um:list) {
				if(um.getId()==id) {
					userModel=um;
				}
			}
		}
		model.addAttribute("user",userModel);

		return Constantes.FORMUSER_VIEW;
	}
}
