<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
     <!-- 에러 페이지 지시자 -->
  <%@ page errorPage="error.jsp"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		아래 코드 실행
		에러 발생시, 사용자가 에러 내용이 적힌 페이지를 보게된다.
		/ by zero
		
		- 이런 상황을 방지하기 위해 에러 페이지 사용
		- 코드 노출
		
		page 지시자 - errorPage 속성 : 에러 발생시, 대신 다른 jsp파일 실행
		- 하나의 jsp 파일이 필요
		
		
	 -->
	<h1><%= 4/0 %></h1> 
	
	
	
	
</body>
</html>