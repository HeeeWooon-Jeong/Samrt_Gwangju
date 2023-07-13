package ex0712;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex06Table")
public class Ex06Table extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String num1 = request.getParameter("room");
		int num = Integer.parseInt(num1);
		response.setContentType("text/html ; charset = utf-8");
		PrintWriter out = response.getWriter();
		
		
		out.print("<table border 1px  style='background-color: antiquewhite;'>"+ 
				"<tr>");
		for (int i = 1; i <= num; i++) {
		     
		    out.print("<td>"+i+"</td>");  
		    
		}
		out.print("  </tr>"
				+ "		    </table> ");
		

		

	

	}

}
