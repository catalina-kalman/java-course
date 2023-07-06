package com.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.service.FactorialService;

@Controller
public class FactorialController {
	@Autowired
	private FactorialService service;
	
	@RequestMapping("/")
	public ModelAndView mainPageController() {
		return new ModelAndView("InputPage");
	}
	
	@RequestMapping("/factorial")
	public ModelAndView factorialController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		
		String number = request.getParameter("nr");
		
		modelAndView.addObject("result", service.calculateFactorial(Integer.parseInt(number)));
		modelAndView.setViewName("DisplayFactorial");
		
		return modelAndView;		
				
	}
}
