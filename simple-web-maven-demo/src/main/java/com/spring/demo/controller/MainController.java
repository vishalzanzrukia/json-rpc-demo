package com.spring.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author VishalZanzrukia
 *
 */
@Controller
@RequestMapping(value = "main")
public class MainController {

	/**
	 * This method is called when the GET request has been made to the controller
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String loadMainPage(Model model, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Inside the main controller");
		model.addAttribute("msg", "Hello From Spring..!");
		return "home";
	}
	
}
