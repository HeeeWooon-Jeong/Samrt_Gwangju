package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GoMainController
 */
@WebServlet("/goMain")
public class GoMainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
		// MVC 디자인 패턴
		// Mdoel : 스스로 실행 X, 기능을 메서드 형태로 정의해놓은 Class를 모델
		// View : 사용자 눈에 보여지는 페이지(jsp/html), 데이터 처리 관련 로직이 들어 있으면 안된다.
		// Controller : 요청이 들어왔을 때, 요청을 처리하는 주체 
		// 				마지막에 view를 선택
		
		// Client --요청--> Controller(Servlet) --> View
		// 				   로직에 따라 Model을 사용
		
		// 1. 데이터(파라미터) 수집
		
		// 2. 기능(로직) 실행
		
		// 3. View를 선택(jsp 또는 servlet으로 이동)
		
		//		servlet(c) --> jsp(v) : forward
		//		servlet(c) --> servlet(c) : redirect
		
		String url = "WEB-INF/views/main.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
		
		
		// response.redirect 사용 불가 INF 로 갈꺼기 때문에 보안폴더는 접근 불가
		
		
		
	
	
	
	
	}

}
