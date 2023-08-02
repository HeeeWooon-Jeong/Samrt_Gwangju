package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.dao.MemberDAO;
import com.smhrd.entity.Member;

/**
 * Servlet implementation class JoinController
 */
@WebServlet("/join")
public class JoinController extends HttpServlet {
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
		
		// id ~ tell까지 Member로 묶기
		Member member = new Member(id, pw, gender, nick, tel);
		
		// 2. 기능 실행
		// 입력받은 정보를 DB-MEMBER 테이블에 저장 >> DAO
		// DAO의 기능을 실행
		MemberDAO dao = new MemberDAO();
		int cnt = dao.join(member);
		
		
		// 3. View 선택
		// 만약 회원가입이 성공했다면, main.jsp로, 실패했다면 join.jsp
		String url = ""; 
		if( cnt > 0 ) {
			// 이미 이동하는 Controller가 있는 jsp의 경우 해당 Controller로 이동
			url = "goMain";
		}else {
			url = "goJoin";
		}
		
		response.sendRedirect(url);
		
		
		
		
		
		
	}

}
