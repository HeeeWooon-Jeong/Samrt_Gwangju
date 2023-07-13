package ex0712;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex04")
public class Ex04Form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Post 방식 인코딩 -> 데이터 꺼내기 직전에 진행
		request.setCharacterEncoding("UTF-8");
		
		
		
		// 데이터 수집(파라미터 수집), 사용
		// 데이터가 요청에 담겨있어, request객체로부터 꺼낸다.
//				.getParameter("input name");
		String data = request.getParameter("data");

		// request.getParameter() 의 리턴이 String이기 때문에,
//		숫자로 변환해서 사용하고 싶다면 추가 작업 필요

		String number = request.getParameter("num");
		int num = Integer.parseInt(number);

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
		out.print("<p style= 'border : 1px solid black;'> 입력받은 데이터 : " + data + "</p>");
		out.print("<p style= 'border : 1px solid black;' > 입력받은 숫자 : " + number + "</p>");

		out.print("""
				</body>
				</html>
								 """);

		// 응답해주기

		// 입력받은 데이터 : ~~~~~

		// 입력받은 숫자 : ~~~~~~

	}

}
