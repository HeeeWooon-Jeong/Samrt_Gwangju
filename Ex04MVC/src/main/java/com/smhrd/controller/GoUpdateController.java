package com.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GoUpdateController
 */
@WebServlet("/goUpdate")
public class GoUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 2. 수집
		
		// 3. 기능 실행
		
		// 4. view 선택
		String url = "WEB-INF/views/update.jsp";
		
		// 포워드 방식
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
		// 리다이렉트 방식으로 보내는 법은 보안 취약
		
		
		
		
		
		
		
		
		
		
	}

}
