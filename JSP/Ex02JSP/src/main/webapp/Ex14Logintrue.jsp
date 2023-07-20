<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	String name = (String)session.getAttribute("id");
%>
	<h1><%=name %>님 환영합니다!</h1>
	<a href="#">로그아웃</a>
	
</body>
</html>