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
		int num = Integer.parseInt(request.getParameter("num"));
		
		
		
		
		// 3. 로직
		
		
		// 4. 응답 완성
		
	
	%>
	
	<h4>랜덤당첨작성</h4>
	
	<form action="">
	
		주제: <input type="text" name="sub"> <br>
		<% for(int i =1; i<=num; i++){ %>
		<!-- name을 item이라는 이름으로 한번에 보낸다 -->
		아이템<%=i %> : <input type="text" name="item"><br>
		
		<%} %>
		
		<input type="submit" value="시작"> <br>
	
	</form>
	
</body>
</html>