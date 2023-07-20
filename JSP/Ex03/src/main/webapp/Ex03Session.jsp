<%@page import="java.util.ArrayList"%>
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
		// 세션에 데이터 저장하기
		// 1. 세션 만들기(세션 가져오기)
		
		// HttpSession session = request.getSession();
	
		// session은 내장객체
		
		// session 에 Strign data 저장하기
		// .setAttribute("name", (obj)value )
		session.setAttribute("name", "정희운");
		
		// ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("오늘");
		list.add("볼링");
		list.add("가나여?");
		
		session.setAttribute("list", list );
	%>
		<a href="Ex04Session.jsp">세션 확인</a>
	
	

	
</body>
</html>