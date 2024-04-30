package com.suyad.Usercontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController 
{
	@GetMapping("/user")
	public String getMsg(Model m)
	{
		String msgTxt = "Good Morning";
		m.addAttribute("msg", msgTxt);
		int i = 10/0;
		return "index";
	}
}
