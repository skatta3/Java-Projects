package com.springmvc.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.api.Info;

@Controller
public class TestController {
	
	Info serverInfo;
	
//		@ResponseBody
		@RequestMapping("/init")
		public String VASinit() throws FileNotFoundException {
//			System.out.println(serverInfo.getServerIp());			
//			return "Value Added Services Application";
			FileInputStream fis = new FileInputStream("D:/Test/text/txt");
			return "welcome";
		}
		

//		@ExceptionHandler(value = Exception.class)
//		public String handleIOExecption() {		
//			return "IOExceptionpage";
//		}
//
//		@ExceptionHandler(value = NullPointerException.class)
//		public String handleNullpointerException() {
//			return "error";
//		}
		

}
