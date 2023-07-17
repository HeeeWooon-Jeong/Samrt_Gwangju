package ex0712;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex07")
public class Ex07Post extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	// 0. 인코딩    포스트 방식이라 
    	
    	request.setCharacterEncoding("UTF-8");
    	
    	
    	// 1. 파라미터 수집
    	String file = request.getParameter("file");
    	
    	// checkbox
    	 
//    	request.getParameterValues("name")
//    	name 이름으로 전달 된 모든 데이터를 가죠옴
//    	String 배열로 리턴
    	
    	String[] food = request.getParameterValues("food");
    	
    	// color
    	String color = request.getParameter("color");
    	
    	// radio
    	String gender = request.getParameter("gender");
    	
    	// range
    	String range = request.getParameter("range");
    	
    	// datalist
    	// input이기 때문에 input안의 글자가 그대로 전달
    	String song = request.getParameter("songlist");
    	
    	// select
    	// 선택한 옵션태그의 value나 태그 사이의 값이 전달 된다.
    	String cla = request.getParameter("class");
    	
    	// textarea
    	// 입력한 값이 그대로 넘어옴
    	// enter => \n 
    	String text = request.getParameter("text"); 
    	
    	

    	// 응답
    	response.setContentType("text/html ; charset=UTF-8");
    	
    	PrintWriter out = response.getWriter();
    	
    	out.print("<html>");
    	out.print("<head></head>");
    	out.print("<body>");
    	
    	
    	out.print("<p>file : "+file+"</p>");
    	out.print("<p>checkbox : "+food+"</p>");
    		
    		// for문 forEach문
    		
    		
//    		for i in list
    		//for (꺼내서 담을 변수 선언 : 배열)
    		
    		for(String f : food) {
    			out.print(f +" ");
    		}
//    		==
    		for(int i = 0; i < food.length; i++) {
    			String f= food[i];
    		}
    		
    		for(int = 0; i<5; i++) {
    			
    		}
    		
    		
    	out.print("<p>radio : "+gender+"</p>");
    	out.print("<p>color : "+color+"</p>");
    	out.print("<p>range : "+range+"</p>");
    	out.print("<p>datalist : "+song+"</p>");
    	out.print("<p>select : "+cla+"</p>");
    	
//    	text area를 출력할 때
//    	1. textarea 태그에 그대로 넣기
//    	2. 다른태그 --> \n(enter)를 <br>로 바꾸어야 줄바꿈이 구현됨
    	
    	out.print("<p>textarea : "+text.replace("\n", "<br>")+"</p>");
    	
    	
    	
    	out.print("</body>");
    	out.print("</html>");
    }

}