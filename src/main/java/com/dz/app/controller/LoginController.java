package com.dz.app.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dz.app.model.LoginData;

import jakarta.validation.Valid;

@Controller
public class LoginController {

	
//	server side validation
	
	
	@GetMapping("/login-form")
	public String loginFormSupport(Model model) {
		
		System.out.println("opening form");
		model.addAttribute("loginData",new LoginData());
		return "login-form";
	}
	
	//handler for processing forms
	@PostMapping("/signup")
	public String signUp(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
		
		if(result.hasErrors()) {
			
			
			System.out.println(result);
			return "login-form"; 
				/* return "redirect:/login-form"; */
		}
		System.out.println(loginData);
		return "success";
	}
	
}
