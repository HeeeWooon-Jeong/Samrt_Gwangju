package ex0712;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex08")
public class Ex08Multi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 파라미터 수집
		
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		
		// 2. 변환
		int s = Integer.parseInt(start);
		int e = Integer.parseInt(end);
		
//		------------------------------------
		
		// 3. 응답 작성
	    response.setContentType("text/html; charset=utf-8");
	    
        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("</head>");
        out.print("<body>");
        
            out.print("<table border=1>");
            
                    for(int i = s; i <= e; i++) {
                   	out.print("<tr>");
                    	for(int j =1; j<=9; j++) {
                        out.print("<td>"+ i + "*"+ j +"="+(i*j) +"</td>");
                    	}
                    out.print("</tr>");
                    }
                    
                    
            out.print("</table>");
        out.print("</body>");
        out.print("</html>");
		
		
		
		
	}

}
