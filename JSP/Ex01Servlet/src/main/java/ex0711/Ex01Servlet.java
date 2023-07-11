package ex0711;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet("/ex01") // URLMapping 지정
public class Ex01Servlet extends HttpServlet{
	// Servlet : 요청받았을 때 server상에서 실행되는 java 프로그램
	// 			 HttpSevlet 클래스를 상속 받아서 구현 
	//			 통일성 / 생산성을 위해 상속 사용
	//			 상속받은 메소드를 구현하는 형식으로, Sevlet을 구현
	
	// HttpServlet이 가진 메소드
		
	// Servlet을 실행하려면
//	--> url을 통해서 요청 필요 !
//	http://localhost:8081/Ex01Servlet/WEB-INF/classes/ex0711/Ex01Servlet
//	http://localhost:8081/Ex01Servlet - 톰캣이 만든것
//	http://localhost:8081/Ex01Servlet/WEB-INF/classes/ex0711/Ex01Servlet - 실제 내 컴퓨터 안에 파일
//	경로에 WEB-INF 이 들어가서 실행 불가능
	
//  URLMapping 해야함
//  URLMapping : Servlet을 실행하기 위해서, 요청할 수 있는 별명 지정
//	문자열에 연결해서, 대신 사용
	
	
//	http:// --> 통신 프로토콜
//	localhost:8081 --> 누구 컴퓨터로 갈지
//				localhost : 내 컴퓨터 ip를 의미 ip로 대체 가능
//				:8081 : port 번호 Apachi Tomcat서버로 들어오겠다
//	******* Ex01Servlet : Context path(교재 69) *********
	
//	http://localhost:8081 = C:\Users\smhrd\Desktop\JSP\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps
	
	
	
	
	
	@Override
	public void init() throws ServletException {
		// web Container(WAS) 메모리 안에 Servlet이 생성 됬을 때 실행
		// 서버 실행 후 처음 한번의 요청에만 실행되는 메서드
		// 보통 환경설정에 쓰임
		
		System.out.println("서블릿 생성됨!!");
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청이 들어왔을 때 실행되는 메서드
		// Servlet의 main이라고 생각 하면됨 
		
		System.out.println("service 메서드 실행됨!");
		
		
	}
	
	// do 시리즈 
	
	
}
