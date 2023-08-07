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

	<%-- JSTL : 자바 코드를 HTML 태그 형식으로 압축해 놓은 커스텀태그라이브러리
			    for(){} --> <c:forEach></c:forEach>
			    
		 1. JSTL jar 파일을 프로젝트에 적용 >> dependency 추가
		 
		 2. taglib 지시자로 설정
		  	uri --> 어떤 라이브러리를 사용할지
		  	prefix --> 다른 태그랑 구분할 수 있게 앞에 붙이는 글자 --%>

	<%-- 1. set : scope에 값을 저장 (page)
				  ~~~~.setAttribute(var, value);
				  value : 저장하고 싶은 값
				  var 	: 이름(name)
				  scope : 저장할 scope 지정, 기본 값은 pageScope --%>
	<c:set var="age" value="15" scope="request"></c:set>
	<h1>${age}</h1>
	
	<%-- 2. if : 조건문(단순 if문) 
				 test : 조건식, EL 안에서 조건식을 적어야 정상적으로 반영 된다. --%>
	<c:if test="${5 > 3}">
		<h1>참</h1>
	</c:if>
	
	<%-- 만약에 나이가 20살 이상이라면 성인입니다. 아니라면 어린이입니다. --%>
	<c:if test="${age >= 20}">
		<p>성인입니다.</p>
	</c:if>

	<%-- <c:if test="${!(age >= 20)}"> --%>
	<c:if test="${age < 20}">
		<p>어린이입니다.</p>
	</c:if>
	
	<%-- 3. forEach : for문을 태그화 
					  var : 변수 이름 선언
					  begin : 시작 값
					  end : 끝 값
					  step : 몇 씩 증감 할건지 --%>
	<%-- for(int i = 0; i <= 10; i += 3) --%>
	<c:forEach var="i" begin="0" end="10" step="3">
		<span>${i}</span>
	</c:forEach>
	<br>
	<br>
	
	<table border="1">
		<tr>
			<c:forEach var="i" begin="1" end="10">
				<td>${i}</td>
			</c:forEach>	
		</tr>	
	</table>
	
	<%
		String[] arr = new String[5];
		arr[0] = "이우석";
		arr[1] = "김동영";
		arr[2] = "김유성";
		arr[3] = "김래정";
		arr[4] = "강진구";
		
		pageContext.setAttribute("arr", arr);
	%>
	
	<br>
	
	<table border="1">
		<c:forEach var="name" items="${arr}">
		<tr>
			<td>${name}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>