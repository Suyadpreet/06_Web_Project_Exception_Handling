package com.suyad.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController 
{
	//private Logger logger = LoggerFactory.getLogger(DemoController.class);
	@GetMapping("/wish")
	public String getMsg(Model m)
	{
		String msgTxt = "Good Morning";
		m.addAttribute("msg", msgTxt);
		int i = 10/0;
		return "index";
	}
	
	@GetMapping("/greet")
	public String getgreet(Model m)
	{
		String msgTxt = "Welcome to web portel";
		m.addAttribute("msg", msgTxt);
		
		return "index";
	}
	/*
	 * ----------------Local Exception Handler--------------------
	@ExceptionHandler(value = ArithmeticException.class)
	public String handleAE(ArithmeticException ex)
	{
		String msg = ex.getMessage();
		logger.error(msg);
		return "errorPage";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String handleE(Exception ex)
	{
		String msg = ex.getMessage();
		logger.error(msg);
		return "errorPage";
	}*/
}
