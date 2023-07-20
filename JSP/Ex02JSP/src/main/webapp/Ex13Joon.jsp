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
          //2. 수집
    String site = request.getParameter("site") ; 
          //3. 로직
          // 만약 사용자가 네이버를 선택을 했으면? >> naver url로 이동

   String url = "";
   
   if(site.equals("네이버")){
      url = "https://www.naver.com/";
      
   }else if(site.equals("다음")){
      url = "https://www.daum.net/";
   
   }else if(site.equals("구글")){
      
      url = "https://www.google.co.kr/";
   }else { 
      url = "https://www.youtube.com/";
      
   }
    response.sendRedirect(url);   
   %>
   
	
	
</body>
</html>