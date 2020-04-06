package com.example.MyFirstSpringBootProject;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean ValidateUser(String Userid, String Password)
	{
		
	return	Userid.equalsIgnoreCase("Aviraj") && Password.equalsIgnoreCase("Aviraj2410");
			
			
	}

}
