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
		// JSP 내장객체 영역
		// scope : 객체가 유지되는 영역/시간
		//		   객체바인딩 : 메모리 영여겡 java 객체를 잠시 저장해뒀다가
		//				     페이지 이동 후에 다시 꺼내서 사용하는 기술
		// 파일끼리 데이터를 공유하려고 메모리에 올려뒀다가 꺼내 쓰자 라는 용도
		// 공통 메서드가 존재함
		// 데이터 저장 : .setAttribute(name, value);
		// 데이터 꺼내기 : .getAttribute(name);
		// 데이터 삭제 : .removeAttribute(name);
		
		
		// jsp에서 벗어나면 없어져버림
		// 1. page scope : 하나의 jsp 안에서만
		//				   JSTL/EL을 사용할 때, 지역변수 선언용으로 사용함
		//			page를 사용하려면  pageContext라는 이름으로 호출 
		//
		pageContext.setAttribute("page", "page scope");
		
		// 2. request scope : 한번의 요청 - 응답 동안 유지되는 영역
		// 					  Controller에서 View로 데이터를 전달할 때 사용
		//					  request
		request.setAttribute("req", "request scope");
		
		// 3. session scope : 하나의 브라우저 안에서 유지되는 영역
		// 					  사용자의 로그인 정보나, 개인정보를 유지하는데 사용
		//					  session
		session.setAttribute("sess", "session scope");
		
		// 4. application : 하나의 웹 어플리케이션 안에서 유지되는 여역
		//					- 우리 프로젝트가 Tomcat에서 실행되는 동안 내내 
		//					- 모든 사용자가 하나의 영역을 공유
		//					재난문자 등 모든 사용자에게 동일한 내용을 보여줄 때
		//					application
		application.setAttribute("app","application scpoe");
		
		
	%>
	
	<%
		// scope에서 데이터 꺼내기
		String p = (String)pageContext.getAttribute("page");
		String req = (String)request.getAttribute("req");
		String sess = (String)session.getAttribute("sess");
		String app = (String)application.getAttribute("app");
	%>
	
	<p><%=p%></p>
	<p><%=req%></p>
	<p><%=sess%></p>
	<p><%=app%></p>
	
	<a href="Ex05showScope.jsp">show!!</a>
<%
	// response.sendRedirect("Ex05showScope.jsp");
	

	// 2. Forward
	// request를 잃지 않는 법
	// 네비게이션 역할 필요 : ~~파일로 이동해야 하는지 알려줄 객체
	String url = "WEB-INF/Ex05showScope.jsp";
	
	// .getRequestDispatcher(url); 매개변수에 어디로 이동할지 url을 넣어줘야함
	
	RequestDispatcher rd = request.getRequestDispatcher(url);
	// 이동
	rd.forward(request, response);
	
	//염병하네
	
	//request와 forward는 같이 사용됨
	
	
	
	
	



%>	
	
	
</body>
</html>