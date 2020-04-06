package com.example.MyFirstSpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringBootProjectApplication {
	
	private int ComputerNumber = 101;
	private String ComputerName = "AviGamer";
	private String GameName = "Red Dead Redemption 2";

	public static void main(String[] args) {
		
MyFirstSpringBootProjectApplication  tuktuk = new MyFirstSpringBootProjectApplication();

System.out.println(tuktuk.ComputerNumber);
System.out.println(tuktuk.ComputerName);
System.out.println(tuktuk.GameName);
	
		
   SpringApplication.run(MyFirstSpringBootProjectApplication.class, args);
	}
}
