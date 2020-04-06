package com.example.MyFirstSpringBootProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String ShowLoginpage( ModelMap model)
	{
		//model.put("Name", Name);
		return "login";
	}
		
		
		@RequestMapping(value="/login", method=RequestMethod.POST) 
		
		public String ShowWelcomePage(ModelMap model, @RequestParam String Name, @RequestParam String Password)
		{
			
		boolean IsValidUser = service.ValidateUser(Name, Password);
		
		if(!IsValidUser)
		{
			
			model.put("ErrorMessage", "Invalid Credentials Please Try Again");
			
			return "login";
		}
		
			model.put("Name", Name);
			
			model.put("Password", Password);
			
			return "Welcome";
		}
		
	}
