package com.suyad.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService 
{
	public String getProductNameById(Integer id)
	{
		int i = 10/0;
		return "mouse";
	}
}
