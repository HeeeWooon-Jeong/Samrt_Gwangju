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
	request.setCharacterEncoding("UTF-8");
	String url1 = "";
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");

	if (id.equals("smart") && pwd.equals("1234")) {
		session.setAttribute("id", id);

		url1 = "Ex14Logintrue.jsp";

	} else {
		url1 = "Ex14LoginFalse.jsp";
	}
	response.sendRedirect(url1);
	%>





</body>
</html>