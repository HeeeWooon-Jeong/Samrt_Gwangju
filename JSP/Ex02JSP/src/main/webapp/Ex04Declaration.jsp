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
	
	
	
	<%!
	// <%! = 선언문 문법
	// 선언문 : 전역변수 선언 또는 메소드를 선언할 때 사용
	//         (필드)
	// #쓸일이 없을 것 알아만 두기
	// 표현식은 적게 쓸수록 좋음
	
	
	// mvc 중에 v 사용자에게 보여주기 때문
	
	
	// 		   스크립트릿 --> service메소드 안으로 들어감 - 메소드를 선언할 수 없음
	
	int num = 15;
	// out.write(""); - 사용불가
	
	public int sum(int a, int b){
			return a+b;
	}
	%>

	<!-- 3, 5의 합을 h1 태그 사이에 출력 -->
	
	<h1><%= sum(3, 5)  %></h1> 
	
	
	<% 
		Random ran = new Random();
		// 페이지의 맨위에 import 속성을 가진 페이지 지시자가 생성됨 
		// 
	%>


</body>
</html>