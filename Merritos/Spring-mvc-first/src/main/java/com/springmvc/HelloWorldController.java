package com.springmvc;

import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String sayHello() {
		return "Welcome to Spring Web MVC";
	}
	
	@RequestMapping(value= "date")  //Relative Path
	public String getDate(Locale locale,Model model) {
		Date currentDate = new Date();
		model.addAttribute("curDate", currentDate);
		return "date";		
	}
	

}
