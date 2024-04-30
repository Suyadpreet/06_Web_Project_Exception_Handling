package com.suyad.exceptions;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.suyad.controllers.DemoController;

@ControllerAdvice
public class AppExceptionHandler 
{
	//--------------Global Exception Handler using AOP -------------------------
	private Logger logger = LoggerFactory.getLogger(DemoController.class);
	@ExceptionHandler(value = Exception.class)
	public String handleE(Exception ex)
	{
		String msg = ex.getMessage();
		logger.error(msg);
		return "errorPage";
	}
}
