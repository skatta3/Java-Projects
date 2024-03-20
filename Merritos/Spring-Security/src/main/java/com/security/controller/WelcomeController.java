package com.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.security.api.UserRegistrationDTO;

@Controller
public class WelcomeController {
		
		@GetMapping("/welcome")
		public String welcome() {
			return "welcome";
		}
		
		
		@GetMapping("/register")
		public String registration(@ModelAttribute("userReg") UserRegistrationDTO dto) {
			return "user-register";
		}
}
