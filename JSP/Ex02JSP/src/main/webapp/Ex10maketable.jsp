<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1"> 
		
	<%-- 
	//2 .파라미터 수집
		post 방식이 아니라 get방식으로 했다면 인코딩 작업 필요 없음
		
		int col = Integer.parseInt(request.getParameter("column"));
  		int row = Integer.parseInt(request.getParameter("row"));
   
	  --%>
	  
	<%
   request.setCharacterEncoding("UTF-8");

   int col = Integer.parseInt(request.getParameter("column"));
   int row = Integer.parseInt(request.getParameter("row"));
   %>
   
   <%--3. 로직
    
   	
    --%>
    
   	<h1><%=col %>층</h1>
   	
	<h1><%=row %>방</h1>
	
	
	<%-- 
	
	
	for(int j = 0 ; j < floor ; j++){
		out.print("<tr></tr>");
		for(int i = 0 ; i < room ; i++) {
			out.print("<td>"+i+" </td>");	
		} 
		
	}
    --%>
    
    <%-- 
    <h1>c: for-each 해결방식 </h1>

	<table border="1">
		<tr>
			<c:forEach begin="0" end="${param.floor-1}" var="i">
				<tr>
					<c:forEach begin="0" end="${param.room-1}" var="j">
						<td>${j}</td>
					</c:forEach>
				</tr>
			</c:forEach>
		</tr>
	</table>
	
	--%>
    
    
    <%for(int i=0; i<col; i++){%>
    	<tr>
    	<%for(int j =0; j<row; j++) {%>
			<td><%= j %></td>    	
    		<%} %>
    	</tr>
    	<%} %>
		

	</table>
</body>
</html>