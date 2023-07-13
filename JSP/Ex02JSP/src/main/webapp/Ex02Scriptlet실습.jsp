<%@page import="java.util.stream.IntStream"%>
<%@page import="java.lang.reflect.Array"%>
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

<!--  
	JSP 파일의 동작원리

        .jsp >> .java(Servlet) >(컴파일)> .class >(실행) > HTML 문서

        jsp에 작성한 내용은 Servlet의 service메소드 안으로 들어감

        HTML 코드 >> out.write() 메소드 안으로 들어갔고

        스크립트릿 안 java 코드 >> 형태 그대로 ~ 들어갔다.

        표현식 >> out.print(값); 로 변환이 되었다.
	
	 -->

  <%
  // 1~100 까지의 합 구하기
  int p=0;	
  for(int i=1; i<101;i++){
  		p+=i;
  	}
   
  %>
  
  <!-- 구한 결과를 h1 태그 사이에 출력 -->
  <h1><%=p %>
  </h1>
  
  
</body>
</html>