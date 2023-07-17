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
	// 0 순위 : 인코딩
	request.setCharacterEncoding("UTF-8");
	// 파라미터(데이터) 수집
	String name = request.getParameter("name");
	String java = request.getParameter("java");
	int java_s = Integer.parseInt(java);
	String iot = request.getParameter("iot");
	int iot_s = Integer.parseInt(iot);
	String and = request.getParameter("android");
	int and_s = Integer.parseInt(and);
	String web = request.getParameter("web");
	int web_s = Integer.parseInt(web);

	int sum = (java_s + web_s + iot_s + and_s) / 4;
	%>


	<table>
		<tr>
			<td>이름 :</td>
			<td><%=name%></td>
		</tr>

		<tr>
			<td>JAVA점수 :</td>
			<td><%=java_s%></td>
		</tr>

		<tr>
			<td>WEB점수 :</td>
			<td><%=web_s%></td>
		</tr>

		<tr>
			<td>IOT점수 :</td>
			<td>
		<%=iot_s%></td>
			</tr>
		<tr>
			<td>ANDROID점수 :</td>
			<td>
		<%=and_s%></td>
			</tr>
		<tr>
			<td>평균 :</td>
			<td><%=sum%></td>
		</tr>

		<tr>
			<%
			if (sum >= 95) {

				out.print("<td>학점 :</td><td> <strong>A+</strong></td>");

			} else if (sum >= 90) {
				out.print("<td>학점 :</td><td> <strong>A</strong></td>");

			} else if (sum >= 85) {
				out.print("<td>학점 :</td><td> <strong>B+</strong></td>");

			} else if (sum >= 80) {
				out.print("<td>학점 :</td><td> <strong>B</strong></td>");
			} else {
				out.print("<td>학점 :</td><td> <strong>F</strong></td>");
			}
			%>
		</tr>
	</table>



</body>
</html>