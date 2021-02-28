package com.app.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.FlightAppUsers;
import com.app.service.IUserService;

@Controller 
@RequestMapping("/user") 
public class UserController {
	
	@Autowired
	private IUserService uService;
	
	public UserController() {
		System.out.println("in ctor of "+getClass().getName());
	}
	
	@PostConstruct
	public void anyInit() {
		System.out.println("in init of  " + getClass().getName() + " " + uService);
	}
	
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form ");
		return "/user/login";
	}
	
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String email, @RequestParam String password, Model modelMap,HttpSession hs) {
		try {
			FlightAppUsers user = uService.validateUser(email, password);
			hs.setAttribute("user_details", user);
			hs.setAttribute("message", "Hello "+user.getName());
			return "redirect:/flight/search";
		}catch(RuntimeException e) {
			System.out.println("error in "+e);
			modelMap.addAttribute("message", "Invalid Login ,Please retry!!!!");
			return "/user/login";
		}
	}
	
	@GetMapping("/register")
	public String showregisterForm() {
		System.out.println("in show register form ");
		return "/user/register";
	}
	
	@PostMapping("/register")
	public String processRegisterPage(@RequestParam String name, @RequestParam String email, @RequestParam String password, Model map) {
		try {
			System.out.println("In  process register page");
			uService.userRegister(name, email, password);
			map.addAttribute("msg", "User Registered Successfully !!!");
			return "/user/register";
		}catch(RuntimeException e) {
			map.addAttribute("msg", "invalid credentials please try again !!!");
			return "/user/register";
		}		
	}
	
	
	@PreDestroy
	public void anyDestroy() {
		System.out.println("in destroy of  " + getClass().getName() + " " + uService);
	}
}
