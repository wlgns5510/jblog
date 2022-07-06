<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBlog</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/jblog.css">

</head>
<body>
	<div id="center-content">
		
		
		<!-- header -->
			<c:import url="/WEB-INF/views/includes/main-header.jsp"></c:import>
		<!-- //header -->
		
		
		<div id="loginForm">
			<form method="post" action="${pageContext.request.contextPath}/user/login">
	      		<table>
			      	<colgroup>
						<col style="width: 100px;">
						<col style="">
					</colgroup>
		      		<tr>
		      			<td><label for="textId">아이디</label></td>
		      			<td><input id="textId" type="text" name="id"></td>
		      		</tr>
		      		<tr>
		      			<td><label for="textPassword">패스워드</label> </td>
		      			<td><input id="textPassword" type="password" name="password"></td>   
		      			   			
		      		</tr> 
		      		<tr>
		      			<td colspan="2" id="tdMsg" colspan="2">
		      				<span>아이디 또는 비번을 확인해 주세요.</span>
		      			</td>
		      		</tr> 
		      	</table>
	      		<div id="btnArea">
					<button class="btn" type="submit" >로그인</button>
				</div>
	      		
			</form>
		
		</div>
		<div id="resultList">
			
			
		</div>
		
		<!-- footer -->
			<c:import url="/WEB-INF/views/includes/main-footer.jsp"></c:import>
		<!-- //footer -->
		
	</div>
	
	
</body>

</html>