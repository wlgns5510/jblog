package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	UserService userService;
	
////회원가입폼/////////////////////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping(value="/joinForm", method = {RequestMethod.GET, RequestMethod.POST})
	public String joinForm() {
		System.out.println("UserController>joinForm");
		
		return "user/joinForm";
	}
////회원가입/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
////로그인폼/////////////////////////////////////////////////////////////////////////////////////////////////////
	@RequestMapping(value="/loginForm", method = {RequestMethod.GET, RequestMethod.POST})
	public String loginForm() {
		System.out.println("UserController>loginForm");
		
		return "user/loginForm";
	}
	
	
}
