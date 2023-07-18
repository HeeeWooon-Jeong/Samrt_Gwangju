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
	
	// 2. 파라미터(데이터) 수집
	// request는 service 내에 자동으로 들어있어 만들 필요없이 사용가능
	
	// post방식 필수 인코딩 방법
	request.setCharacterEncoding("UTF-8");
	
	
	String name = request.getParameter("name");
	
	// 파싱을 하번에 하기
	
	int java = Integer.parseInt(request.getParameter("java"));
	int web = Integer.parseInt(request.getParameter("web"));
	int iot = Integer.parseInt(request.getParameter("iot"));
	int android = Integer.parseInt(request.getParameter("android"));

	
	// 3. 로직
	// 1) 성적 평균 점수 구하기

	int avg = (java + web + android + iot) / 4;
	
	
	String grade = "F";
	
	// 2) 등급을 구하기
	
	if (avg >= 95) {
		grade = "A+";
	} else if (avg >= 90) {
		grade = "A";
	} else if (avg >= 85) {
		grade = "B+";
	} else if (avg >= 80) {
		grade = "B";
	} else {
		grade = "F";
	}
	
	// 4. 응답 내용 완성
	%>

		<table>
			<tr>
				<td align="center"> 이름</td>

				<td align="center"> <%=name%></td>
			<tr>
				<td align="center"> JAVA점수 </td>
                <td align="center"> <%= java %>
				</td>
			</tr>
			<tr>
				<td align="center" > WEB점수 </td>
                <td align="center"> <%= web%>
				</td>
			</tr>
			<tr>
				<td align="center" >IOT점수 </td>
                <td align="center"> <%= iot %>
				</td>
			</tr>
			<tr>
				<td align="center" > ANDROID점수 </td> 
                <td align="center"> <%= android%>
				</td>
			</tr>
          


		</table>


	<!-- -------------------------------------------------------------------------------------------- -->
	<!--
	  <p>
		이름<%=name%></p>
	<p>
		JAVA점수<%= java %></p>
	<p>
		WEB점수<%= web%></p>
	<p>
		IOT점수<%= iot %></p>
	<p>
		ANDROID점수<%= android%></p>
	<p>
		평균<%= avg%></p>
	<p>
		학점 <strong><%=grade%></strong>
	</p>
	-->
</body>
</html>