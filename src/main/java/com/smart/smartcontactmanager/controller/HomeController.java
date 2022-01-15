package com.smart.smartcontactmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.smart.smartcontactmanager.dao.UserRepository;
import com.smart.smartcontactmanager.entities.User;

@Controller
public class HomeController {

	@Autowired
	private UserRepository userRepository;
	
	
	@GetMapping("/")
	public String test(Model model) {
		model.addAttribute("tittle","Home-Smart Contact Manager");
		return "home";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("tittle","About-Smart Contact Manager");
		return "about";
	}
	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("tittle","Register-Smart Contact Manager");
		return "signup";
	}
}
