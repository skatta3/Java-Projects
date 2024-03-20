package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.api.Info;
import com.springmvc.api.UserRegistrationDTO;
import com.springmvc.dao.RegistrationDAOImpl;
import com.springmvc.dao.RegistrationDao;
import com.springmvc.serviceimpl.EmailServiceImpl;


@Controller
public class RegistrationController {

	Info serverInfo;
//		@ResponseBody
		@RequestMapping("/register")
		public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto) {
			System.out.println(serverInfo.getServerIp());			
//			dto.setName("Srinivas Katta");
			return "user-register";
		}
		
		@RequestMapping("/saveRegistration")
		public String processUserRegistration(@Valid @ModelAttribute("userReg") UserRegistrationDTO dto, BindingResult result) {
//			System.out.println("Form Validations" + dto.getName().length() + result.hasErrors());
			
			if(result.hasErrors()) {
				System.out.println("My Form has Errors");
				return "user-register";
			}
			
			System.out.println("Saving the Data into DB");
			RegistrationDao regDao = new RegistrationDAOImpl();
			regDao.insert(dto);
			System.out.println("Saved the Data into DB");
			
			EmailServiceImpl emailService = new EmailServiceImpl();
			emailService.sendEmail(dto.getUserEmail(),dto.getUserName(),dto.getPassword());
			return "registration-success";
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
