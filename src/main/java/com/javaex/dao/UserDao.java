package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {

	@Autowired 
	SqlSession sqlSession;
	
////회원가입////////////////////////////////////////////////////////////////////////////
	public int userInsert(UserVo userVo) {
		System.out.println("UserDao>userInsert");
		
		int count = sqlSession.insert("user.insert", userVo);
		
		return count;
	}
	
////로그인////////////////////////////////////////////////////////////////////////////
	public UserVo getUser(UserVo userVo) {
		System.out.println("UserDao>getUser");
		
		UserVo authUser = sqlSession.selectOne("user.getUser", userVo);
		
		return authUser;
	}
}
