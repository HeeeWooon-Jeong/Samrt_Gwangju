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
		// 세션에서 데이터 꺼내오기
		// 세션은 Object 타입의 데이터를 저장한다
		// == 모든 java 객체를 저장할 수 있다.
		// 모든 정보가 object타입으로 "업캐스팅"되서 저장이 된다.
		
		// 1. 세션 가져오기
		
		// 내장객체로 되어 있기 때문에 생성 안해도 됨 
		// HttpSession session = request.getSession();
	
		// 저장된 이름을 가져오기
		// .getAttribute("name") : 이름을 이용해서 데이터를 꺼내오는 메소드
		// 꺼낸 직후는 Object 타입 ==> "다운캐스팅" 필수
		// (String)session 강제형변환 다운캐스팅
		String name = (String)session.getAttribute("name");
		
		ArrayList<String> list= (ArrayList<String>)session.getAttribute("list");
		
		
	
	
	%>
	<h1><%=name %></h1>
	
	<%-- list에 있는값을 전부 출력 --%>
	
	<ul>
		
		<%-- for each문 ArrayList와 많이 사용함 --%>
	<% for( String n : list ){ %>
		
		<li><%=n %></li>
	
	<% } %>
	</ul>
	
	<a href="ex05">세션 수정 / 삭제</a>
	
</body>
</html>