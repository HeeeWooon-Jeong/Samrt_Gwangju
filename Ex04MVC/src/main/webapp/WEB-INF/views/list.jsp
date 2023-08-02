<%@page import="java.util.ArrayList"%>
<%@page import="com.smhrd.entity.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- request에게 맡겨둔 list 가져와서 안에 있는 데이터를 table 형태로 출력 --%>
	<%
	ArrayList<Member> user = (ArrayList<Member>) session.getAttribute("user");


	%>

	<table>
		<tr>

			<td>ID</td>
			<td>NICK</td>
			<td>GENDER</td>
			<td>TEL</td>

		</tr>

<%for(int i = 0; i < user.size() ; i++) {%>
		<tr>
			<td><%=user.get(i).getId()%></td>
			<td><%=user.get(i).getNick()%></td>
			<td><%=user.get(i).getGender()%></td>
			<td><%=user.get(i).getTel()%></td>

		</tr>
		<%} %>

<c:forEach var="user" items="${user}">
	<tr>
		<td>${user.id}</td>
		<td>${user.nick}</td>
		<td>${user.gender}</td>
		<td>${user.tel}</td>
		
	</tr>

</c:forEach>
    

	</table>










</body>
</html>