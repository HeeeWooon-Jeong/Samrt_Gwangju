package ex0712;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex03") // 실제 주소를 숨기기 위해 변경 Ex03Response
public class Ex03Response extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//	response : HttpServlet Response
//		응답에 대한 정보를 가지고 있는 객체
//		패킷의 헤더(응답 정보)를 저장하고 있고, 수정할 수 있다.
//		response로는 직접 응답내용을 작성하지 못해, 출력스트림으로 작성해야 한다.
		
//		사용자에게 HTML문서 응답하기
		
//		1.우리가 보내는 응답의 내용이 형 무엇인지? 지정
//		text/html : HTML 문서를 보낼 것이다(문서 양식)
//		charset=utf-8 : 인코딩 방식
		response.setContentType("text/html ; charset = utf-8");
		
//		2. 응답내용을 작성하기 위한 출력스트림 객체를 생성
//		출력스트림 객체를 생성하는 메서드 = getWriter();
		PrintWriter out = response.getWriter();
		
//		3. 응답할 내용을 작성
//		메일(패킷)의 본문에 누적 -> service메소드 종류후 한번에 자동 발송
//		ctrl + F11 = 실행 + 자동 요청
		
		out.print("<html>");
		out.print("<head></head>");
		out.print("<body>");
		out.print("<h1>환영합니다.</h1>");
		
		
		out.print("</body>");
		out.print("</html>");
		
	out.print("""
			
			<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <!-- 입력 양식 지정 form 태그 -->
    <!-- action : form태그 안에 있는 데이터들을 전달하는 url 지정 -->
    <form action="#">
      <h1 class="title">로그인</h1>
      <!-- placeholder      아무것도 입력하지 않았을때 띄워줄 디폴드 텍스트 -->
      <!-- value            기본적으로 입력 해놓을 값 -->
      <!-- maxlength        최대로 입력 가능한 길이를 제한함 -->
      <!-- autofocus        웹에 진입할때 바로 커서가 가있게 되는 기능 -->
      <!-- readonly         입력 불가능 읽기만 가능 -->

      <div>
        <label class="label-width" for="user-id">아이디</label>
        <input type="text" id="user-id" name="userId" />
      </div>

      <div>
        <label class="label-width" for="user-pw">비밀번호</label>
        <input type="password" id="user-pw" name="userPw" />
      </div>

      <br />
      <!-- 파일 업로드 태그 -->
      <input type="file" />
      <!-- 색깔 선택 태그 -->
      <input type="color" />
      <br />
      <!-- 날자 선택 태그 -->
      <!-- 년, 월, 일 선택 태그 -->
      <input type="date" />
      <br />
      <input type="text" />
      <!-- 시간 까지 선택 태그 -->
      <input type="datetime-local" />
      <br />
      <!-- 중복 선택이 가능할 때 사용하는 태그 -->
      초밥🍣 <input type="checkbox" /> 치킨🍗 <input type="checkbox" /> 피자🍕
      <input type="checkbox" />
      <br />
        <!-- radio버튼을 사용할 때는 중복으로 선택이 되는 것을 방지하기 위해 
        name arttribute를 사용 ** 동일한 값을 넣어주면 중복선택을 방지 -->
        <!-- value로 보낼 값을 선택 -->
      남자<input type="radio" name="gender" value="남자"/> 
      여자<input type="radio" name="gender" value="여자"/>
      
      <br>
      <!-- 범위를 설정하는 태그 -->
      <input type="range">
      <br>
      <!-- 숫자값을 입력하는 태그 -->
      <input type="number">
      <br>
      <!-- 리스트 형태로 데이터를 출력해주는 태그 -->
      <!-- 
          1) datalist 사용하는 방법
          2) select 사용하는 방법
          * datalist 입력이 가능
          * select는 입력이 불가능
       -->
      <input type="text" list="song">
      
      <datalist id="song">
        <option value="이브, 프시케 그리고 푸른수염의 아내"></option>
        <option value="너의 모든 순간"></option>
        <option value="그라데이션"></option>
      </datalist>
      <br>
      <select name="" id="">
        <option value="">Java</option>
        <option value="">DB</option>
        <option value="">Python</option>
        <option value="">정처기특강</option>
        <option value="">Html</option>
      </select>

      <!-- 적을수있는 행과 열 -->
      <textarea name="" id="" cols="30" rows="10"></textarea>
      <textarea cols="30" rows="10"></textarea>

      <br>
      <!-- 값 초기화 시키는 태그 -->
      <input type="reset"> 
      <!-- 입력한 데이터를 특정 주소로 제출하는 태그 -->
      <input type="submit">




      <!--  -->

    </form>
  </body>
</html>

			
			
			
			""");
			
			
	
	
	
	}

}
