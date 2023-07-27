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
 * Servlet implementation class JoinController
 */
/*@WebServlet("/update")*/
public class UpdateController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 1. 데이터수집
		
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String nick = request.getParameter("nick");
		String tel = request.getParameter("tel");
		
		
		// id ~ tell까지 nick 빼고 Member로 묶기
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		member.setGender(nick);
		member.setGender(gender);
		member.setTel(tel);
		
		
		
		
		
		// 2. 기능 실행
		// mapper부터 만들기 시작
		MemberDAO dao = new MemberDAO();
		int cnt = dao.update(member);
		
		
		
		if(cnt>0) {
			System.out.println("수정 성공");
		}else{
			System.out.println("수정 실패");
		}
		// 3. View 선택
		// 만약 회원가입이 성공했다면, main.jsp로, 실패했다면 join.jsp
		String url = ""; 
		if( cnt > 0 ) {
			// 이미 이동하는 Controller가 있는 jsp의 경우 해당 Controller로 이동
			url = "goMain";
			// session 에 있는 사용자 정보를 emeber로 수정
			HttpSession session = request.getSession();
			session.setAttribute("user", member);
			
		}else {
			url = "goUpdate";
		}
		
		response.sendRedirect(url);
		
		
		
		
		
		
	}

}
