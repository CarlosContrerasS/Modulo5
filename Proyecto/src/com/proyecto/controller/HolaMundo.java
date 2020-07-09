package com.proyecto.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller

public class HolaMundo {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hola Mundo, Spring MVC Tutorial</h3>Este mensaje es de holaMundo.java **********"
				+ "</div><br><br>";

		return new ModelAndView("welcome", "message", message);
	}

}
