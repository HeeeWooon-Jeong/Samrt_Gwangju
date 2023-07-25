<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>회원관리 프로그램</h1>
	
	<ul>
	
	<%-- 회원가입 버튼을 누르면 join.jsp로 이동할 수 있게 만들어봅시다
	URLMapping : goJoin
	Controller Class 명 : GoJoinController
	 --%>
		<li> <a href="goJoin">회원가입</a> </li>
		<li> <a href="#">로그인</a> </li>
	
	</ul>
	
</body>
</html>