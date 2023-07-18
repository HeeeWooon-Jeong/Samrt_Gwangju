<%@page import="java.util.Random"%>
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
	// 2. 수집
	String sub = request.getParameter("sub");
	
	String[] items = request.getParameterValues("item");
	
	%>
	
	<%!
	// 3. 로직
	// items 중에서 랜덤한 인덱스를 뽑겠다.
	
	Random ran = new Random(); 
	
	%>
	
	
	<% 
	
	// 0 ~ 배열의 길이 -1
	int idx =ran.nextInt(items.length);
	
	// items에서 랜덤한 값을 뽑기
	String item = items[idx];
	
	// 4. 응답
	
	%>
	<h4>오늘의 점심 메뉴는?</h4>
	<h3><%=item %></h3>
	
	
	
</body>
</html>