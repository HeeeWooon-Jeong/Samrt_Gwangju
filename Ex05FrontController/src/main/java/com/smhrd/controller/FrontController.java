package com.smhrd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.dao.MemberDAO;
import com.smhrd.entity.Member;

// FrontController 디자인패턴
// 단 한개의 서블릿(FrontController)만사용
// = 모든 요청을 단 하나의 서블릿으로 처리
// *.do : .do로 끝나는 모든 요청을 받겠다
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 요청을 구분하기 위해서, 어떤 요청인지 알아내기
		// /Ex04/main.do
		String uri = request.getRequestURI();
		// /Ex04 
		String cpath = request.getContextPath();
		
		// 슬라이싱
		String mapping = uri.substring(cpath.length());
		
		System.out.println(mapping);
		
		// 2. 요청을 구분해서 알맞는 코드를 실행
		if(mapping.equals("/goMain.do")) {
			String url = "WEB-INF/views/main.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
			
		}else if(mapping.equals("/goLogin.do")) {
			String url = "WEB-INF/views/login.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		}else if(mapping.equals("/Login.do")) {
			
			// 2. 데이터 수집
			request.setCharacterEncoding("UTF-8");
			
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			Member member = new Member();
			member.setId(id);
			member.setPw(pw);
			
			// 3. 기능 실행
			// id pw 가 일치하는지 MEMBER 테이블을 조회하는 기능
			MemberDAO dao = new MemberDAO();
			Member result = dao.login(member);
			
			if(result != null) {
				System.out.println("로그인 성공");
				// 사용자의 정보를 유지할 수 있게끔 저장 >> session에 정보저장
				HttpSession session = request.getSession();
				session.setAttribute("user", result);
			}else {
				System.out.println("로그인 실패");
			}
			String url = "goMain.do";
			response.sendRedirect(url);
			
		}else if(mapping.equals("/list.do")) {
			MemberDAO dao = new MemberDAO();
			
			List<Member> list = dao.list();
			
			request.setAttribute("list", list);
			
			String url = "WEB-INF/views/list.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		}
		
		
		// 3. ....
	}

}
