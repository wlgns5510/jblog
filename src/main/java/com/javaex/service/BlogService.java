package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BlogDao;
import com.javaex.vo.BlogVo;

@Service
public class BlogService {

	
	 @Autowired BlogDao blogDao;
	 
	
////블로그 메인페이지(id)/////////////////////////////////////////////////////////////////////////////////////
	
	 public BlogVo getBlog(String id) { 
		 System.out.println("BlogService>getBlog");
	 
		 BlogVo blogVo = blogDao.getBlog(id);
		 System.out.println("blogService: " + blogVo);
	 
	 	 return blogVo; 
	 }
	 

}