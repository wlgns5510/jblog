package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.BlogService;
import com.javaex.vo.BlogVo;

@Controller
public class BlogController {


	 @Autowired
	 BlogService blogService;
	
	 
////블로그 메인페이지(id)//////////////////////////////////////////////////////////////////////
	@RequestMapping(value="/{id}", method = {RequestMethod.GET, RequestMethod.POST})
	public String getBlog(@PathVariable("id")String id, Model model) {
		System.out.println("BlogController>showBlog");
		
		BlogVo blogVo = blogService.getBlog(id);	//id가져오기
		System.out.println("블로그 id : " + id);
		System.out.println("블로그 : " + blogVo);
		
		model.addAttribute("blogVo", blogVo);
		
		return "blog/blog-main";
	}
	
////내 블로그 관리
	@RequestMapping(value="/blog-admin-basic", method = {RequestMethod.GET, RequestMethod.POST})
	public String myBlog() {
		System.out.println("BlogController>myBlog");
		
		
		return "blog/admin/blog-admin-basic";
	}
}
