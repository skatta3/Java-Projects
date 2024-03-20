package com.training.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.spring.model.User;

@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 * 	with out View
	 */
	@ResponseBody // Returns the response  to Browser
	@RequestMapping(value = "/")
	public String home1(Locale locale, Model model) {
		return "Home Page Requested";
	}

	@RequestMapping(value = "home")
	public String home(Model model, Locale locale) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home"; //Return the web page to browse
	} 
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		return "user";
	}
}
