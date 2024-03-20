package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//// To make this class as Spring MVC Class
//@Controller
//@ResponseBody
@RestController
public class HelloWorldController {
	
	@GetMapping("hello-world")
	public String helloworld() {
		return "Hello World!";
	}
}
