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
	
	String page1 = request.getParameter("page");
	
	String naver = "https://www.naver.com/";
	String daum = "https://www.daum.net/";
	String google = "https://www.google.co.kr/?hl=ko";
	
	
			
	
	if (page1.equals("naver")){
		response.sendRedirect(naver);

	} else if((page1.equals("daum"))){
		response.sendRedirect(daum);

	}else if(page1.equals("google")){
		response.sendRedirect(google);

	}
		
	%>
	
</body>
</html>