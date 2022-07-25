<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
	request : <%=request.getAttribute("test") %><br>
	el : ${ test }<br>
	<hr>
	<c:forEach var="s"	items="${str }">
		<b>${s }</b> <br>
	</c:forEach>
	
	<h3>로그인 페이지 입니다</h3>
	<a href="/mvc/logout">로그아웃페이지</a>
	<a href="index">기본페이지</a>
	<!-- 
	<a href="http://localhost:8085/mvc/logout">로그아웃페이지</a>
	<a href="http://localhost:8085/mvc/index">기본페이지</a> 
	또는 상대 경로 이용시 value명만 절대 경로시 /mvc/value명
	상대경로는 제일 끝에있는 벨류명만 변경됨 사용시 주의
	-->
</body>
</html>