package com.springmvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(value = Exception.class)
	public String handleAnyException() {
		return "exception";
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullpointerException() {
		return "error";
	}
	
	

}
