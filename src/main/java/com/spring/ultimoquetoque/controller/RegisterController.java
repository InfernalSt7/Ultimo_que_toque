package com.spring.ultimoquetoque.controller;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.ultimoquetoque.constantes.Constantes;
import com.spring.ultimoquetoque.converter.TestCrypt;
import com.spring.ultimoquetoque.entity.User;
import com.spring.ultimoquetoque.entity.User_Role;
import com.spring.ultimoquetoque.service.impl.UserRoleServiceImpl;
import com.spring.ultimoquetoque.service.impl.UserServiceImpl;



@Controller
@RequestMapping("/")
public class RegisterController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserServiceImpl userServiceImpl;

    @Autowired
    @Qualifier("userRoleServiceImpl")
    private UserRoleServiceImpl userRolServiceImpl;

    private TestCrypt enc=new TestCrypt();

    @GetMapping("/registro")
    public ModelAndView registrar() {
        ModelAndView mav =new ModelAndView(Constantes.REGISTER_VIEW);
        mav.addObject("user",new User());
        return mav;
    }
    
    @PostMapping("/addUser")
    public ModelAndView addUser(@ModelAttribute("user") User user,@RequestParam(name="role")  String role, User_Role userRole, Model model, RedirectAttributes flash) {
        ModelAndView mav = new ModelAndView();
        user.setPassword(enc.encrypt(user.getPassword()));
        userServiceImpl.addUser(user);
        userRole.setRole(role);
        userRole.setUser(user);
        userRolServiceImpl.addUser(userRole);
        mav.setViewName("redirect:/login");
        return mav;
    }
}