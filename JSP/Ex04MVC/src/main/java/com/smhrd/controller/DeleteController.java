package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.dao.MemberDAO;
import com.smhrd.entity.Member;

/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		session.getAttribute("user");
		Member g = (Member)session.getAttribute("user");
		
		String id = g.getId();
		String pw = request.getParameter("pw");
		
		Member member = new Member();
		
		member.setId(id);
		member.setPw(pw);
		
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.delete(member);
		
		
		String url = ""; 
		if( cnt > 0 ) {
			// 이미 이동하는 Controller가 있는 jsp의 경우 해당 Controller로 이동
			url = "goMain";
			// session 에 있는 사용자 정보를 emeber로 수정
			
			session.setAttribute("user", member);
			
		}else {
			url = "goDelete";
		}
		
		response.sendRedirect(url);
		
		
		
	}

}
