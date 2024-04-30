package com.suyad.Productcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.suyad.service.ProductService;

@Controller
public class ProductControllerService 
{
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public String getgreet(Model m)
	{
		String msgTxt = service.getProductNameById(100);
		m.addAttribute("msg", msgTxt);
		
		return "index";
	}
}
