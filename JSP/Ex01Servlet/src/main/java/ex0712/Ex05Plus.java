package ex0712;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex05Plus")
public class Ex05Plus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String num_1 = request.getParameter("num_1");

		// request.getParameter() 의 리턴이 String이기 때문에,
//		숫자로 변환해서 사용하고 싶다면 추가 작업 필요

		String num_2 = request.getParameter("num_2");
		int num1 = Integer.parseInt(num_1);
		int num2 = Integer.parseInt(num_2);
		int re = num1+num2;

//		1. 응답 형식 지정
		response.setContentType("text/html ; charset = utf-8");

//		2. out 객체 생성
		PrintWriter out = response.getWriter();

		out.println("""
								<!DOCTYPE html>
				<html lang="en">
				<head>
				  <meta charset="UTF-8">
				  <meta http-equiv="X-UA-Compatible" content="IE=edge">
				  <meta name="viewport" content="width=device-width, initial-scale=1.0">
				  <title>Document</title>
				</head>
				<body> """);
		out.print("<h1>"+num1+" + " + num2 +" = "+ re+ "</div>"); 
		

		out.print("""
				</body>
				</html>
								 """);

	}

}
