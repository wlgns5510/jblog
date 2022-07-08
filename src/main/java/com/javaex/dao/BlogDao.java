package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.BlogVo;

@Repository
public class BlogDao {

	@Autowired
	SqlSession sqlSession;
	
////블로그 메인페이지(id)/////////////////////////////////////////////////////////////////////////////////////
	public BlogVo getBlog(String id) {
		System.out.println("BlogDao>getBlog");
		
		return sqlSession.selectOne("blog.getBlog", id);
	}
	
////내 블로그 가져오기(id)/////////////////////////////////////////////////////////////////////////////////////
	public BlogVo getMyBlog(String id) {
		System.out.println("BlogDao>getMyBlog");
		
		return sqlSession.selectOne("blog.getMyBlog", id);
	}
}
