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
	
	<!-- 
		커스텀 태그 : 최근의 스크립트릿의 비중이 많이 없어지고있다
				   java의 문법을 태그화
	
		커스텀 태그 라이브러리 : 비슷한 용도의 커스텀 태그들을 묶어놓은 라이브러리
		
		taglib 지시자 : 커스텀 태그 라이브러리를 사용하기 위한 설정을 하는 지시자.
		
	
	 -->
	
	<!-- 커스텀 태그 사용하기
	
	1. jar(라이브러리) 파일 프로젝트에 가져오기(WEB-INF/lib 폴더에 집어넣기)
	
	2. taglib 지시자를 사용해서 설정 완료하기
		- uri : 어떤 라이브러리를 사용할지 결정
		- prefix : 커스텀 태그 앞에 어떤 접두사를 붙일지 >> 사용 라이브러리를 따라감
	
	3. 사용하기 
	& {}
	이렇게 html 주석안에 있으면 에러가 난다
	jsp 코드로 인식함
	
	--> 
	<table border="1">
		<tr>
			<!-- c: 씨 + 콜론  -->
			<!-- for(int i = 1; i <=10; i++) -->
			<c:forEach begin="1" end="10" var="i">
				<td>${i}</td>
			</c:forEach>
		</tr>
	</table>
	
	
	<%--
		jsp 주석 : jsp가 servlet으로 변환될 때 무시
				  얘를 기본으로 사용해야 함
				  
		크롬 개발자도구 엘리먼츠에 표시되지 않으며
		스크립트릿도 주석을 먹일수 있음
		<% %>
		
		%{}
		jsp주석 안에 있으면 에러 나지 않음
	 --%>
	
	
	
	
	
	
	
</body>
</html>