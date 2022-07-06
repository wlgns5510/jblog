package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	//메인폼
	@RequestMapping(value="/", method = {RequestMethod.GET, RequestMethod.POST})
	public String main() {
		System.out.println("MainController>main");
		
		return "main/index";
	}
}