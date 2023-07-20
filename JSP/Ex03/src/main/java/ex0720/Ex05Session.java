package ex0720;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Ex05Session
 */
@WebServlet("/ex05")
public class Ex05Session extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	// 1. 세션 수정
	HttpSession session = request.getSession();
	
	// 수정 == 덮어쓰기 
	// 같은 이름으로 다시 저장하면 됨
	
	session.setAttribute("name", "정희운(수정)");
	
	// 삭제
	// .removeAttribute("삭제하고싶은이름");
	session.removeAttribute("list");
	
	// session.invalidate(); : 세션 닫기
	// 세션안의 모든것을 없앰
	
	// Ex04Session.jsp로 이동
	response.sendRedirect("Ex04Session.jsp");
	
	
	
	
	// 2. 
	
	
	
	}

}
