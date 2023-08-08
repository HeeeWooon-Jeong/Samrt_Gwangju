<%@page import="com.smhrd.entity.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>회원목록</h1>
	
	<%-- request에게 맡겨둔 list 가져와서 안에 있는 데이터를 table 형태로 출력 --%>
	<%--
	
		// 1. request에서 list 꺼내기
		List<Member> list = (List<Member>)request.getAttribute("list");
	
	--%>
	<table border="1">
		<tr>
			<td>ID</td>	
			<td>NICK</td>	
			<td>GENDER</td>	
			<td>TEL</td>	
		</tr>
		
		
		<%-- <% for(Member member : list) { --%>
		<c:forEach var="member" items="${list}">
		<tr>
			<td>${member.id}</td>
			<td>${member.nick}</td>
			<td>${member.gender}</td>
			<td>${member.tel}</td>
		
		<%--<td><%=member.getId() %></td>
			<td><%=member.getNick() %></td>
			<td><%=member.getGender() %></td>
			<td><%=member.getTel() %></td>--%>
		</tr>
		<%-- <% } --%>	
		</c:forEach>
	</table> 

</body>
</html>