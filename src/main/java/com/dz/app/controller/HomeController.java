package com.dz.app.controller;

import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

	
	//http://localhost:8081/home
	@GetMapping("home")
	public String home(Model model) {
		System.out.println("Inside home page handler..");
		
		model.addAttribute("topic1","Welcome to home page...!");
		model.addAttribute("currentdate",new Date().toLocaleString());
		
		model.addAttribute("friends",Arrays.asList("kundan","sachin","manish","ganu"));
		
		model.addAttribute("isActive",false);
		model.addAttribute("gender","F");
		
		model.addAttribute("mlist",Arrays.asList(10));
		
		model.addAttribute("brief","Just Chill & Relax and Do what you want in your life...");
		model.addAttribute("mobile","(+91) 99999999");
		model.addAttribute("email","testme@gmail.com");
		
		return "home";
		//view name --> home.html
	}
	
	@GetMapping("/about")
	public String inheritanceTest(Model model) {
		
		model.addAttribute("brief","Just Chill & Relax and Do what you want in your life...");
		model.addAttribute("mobile","(+91) 99999999");
		model.addAttribute("email","testme@gmail.com");
		return "about";
	}
	
	@GetMapping("/service")
	public String inheritanceTest1(Model model) {
		
		model.addAttribute("brief","Just Chill & Relax and Do what you want in your life...");
		model.addAttribute("mobile","(+91) 99999999");
		model.addAttribute("email","testme@gmail.com");
		return "service";
	}
	
}
