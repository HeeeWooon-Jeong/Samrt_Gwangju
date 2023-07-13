package ex0711;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02Request")
public class Ex02Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	// request = HttpSevletRequest
//				 Client가 보낸 요청에 대한 정보를 저장하는 객체
//				 Client의 요청이 들어오면, 생성되고 service 메서드의 매개변수로 들어옴
//				 Client가 응답받는 순간 메모리에서 소멸된다.
	
		
	response.setContentType("text/html ; charset = utf-8");
	PrintWriter out = response.getWriter();
		
	String ip = request.getRemoteAddr();
//		원격으로 접속한 주소  Client의 ip주소를 가져오는 메소드
	if (ip.equals("172.30.1.18")){
		out.println("선생님 안녕하세요~");
		out.print("<img src='data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBw8QEBAPEBAQDxAQEA8PDxUQEBIQEBYPFRIXFhUVFhgYHiggGBslGxUVITEhMSkrLi4uFx80OTYtOCgtLisBCgoKDg0OGhAQGi0lHiYtLTEzLS0tLS0tLS0tLS0tLy0tLS0tLS0tLS0tLS0tLi0tLy0tLi0tLS0tLS0uLS0tLf/AABEIAMIBAwMBIgACEQEDEQH/xAAbAAEAAgMBAQAAAAAAAAAAAAAABQYBAgQDB//EAD4QAAICAQEFBQQIAwcFAAAAAAABAgMEEQUSITFRBhNBcYEyUmGRByIjM0JyodFik7FTVGOSosHSFENzgsL/xAAaAQEAAgMBAAAAAAAAAAAAAAAABAUCAwYB/8QANhEAAgECAwUGBQMDBQAAAAAAAAECAxEEITESQVFxoQUTYYGR8CJSsdHhMrLBNKLxFCRCU3L/2gAMAwEAAhEDEQA/APuIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIzaO2KqXu8bLHyhDi/XoREtuZcvZrprX8bnOX6EOtj6FKWzJ58Er/hebJVLB1akdpZLi3b89C1Aqte3cqHt1V2R8e7coy09eZvtra8bsR9zJp2WQpknwnHe11TXpoYrtGjKEpReaTdnk3bh7yM1gKu3GLtZu11mlz95nVd2nx4ycYqy3Tm6ob0V6trUxkdpKVTO2t70k1BQkt2fePkmun7EXTVGEVGK0SOTaWCrEpx0VsdHF9WuOjKp9qYjPT009+JOhhMK5JNO3PXnkrJ+Gh6b2VP69mTbCb4qNb3YR+GniTXZ/aspuVFzTtrScZJaKyv3tH49SHxbnOClKLhLk01pxXB+hrkVT1jZU922t71b8PjF/BmjD4ypSqbTba3q7ft7zbWpxqp05pLg0lk/Ldx9ddbyCJ2LtivJjp7FseFlb9pPquq+JH7U7Ry3pVYsYzlHhZZL7uL6L3mdFPF0YU1VcvheniVEMJWlUdO1mtb6Jcb8OHHcWYFGnfmS4yy5p9K4RjE3o2tnVPjOGRDpNKuenwkv9yBHtqg3Zpr34MkvsyX/ABnFvhmurSXq0XYEdsrateTDfr1TT0nGXCcZdGiRLWMlKKlF3TK+cJQk4yVmgADIxAAAAAAAAAAAAAAAAAAAAAAAABxbWy+5pnZ4xXDzfBfqdpB9q19jBeDvrT8uJHxVR06M5x1SZvw1NVKsYvRsgsaprWc3vWT+tNvnq/A929OLPLIvjCO9J+XVvojmjTO761v1Yfhgv/o49vcXqW18UnZe8kbTztXu1Qdj68q16nJk7NsnrZKUVYlrFVrhquWrfMlq4KK0SSS5JcEbDZvqexrbDvTVurZ4YWSrIKS58pLpJc0e5xvElGfeVtRUmu9i/Za6rpI7DIwmo3vF5fTw96gwZAMDkycOMmpJyrsj7M63uzX7o46nbjx3ZVqda1+tVxl5ziS7NGYs3wrNR2ZZrh+fa8DmoyIWLehJSXj1XmvA3kc2VgKT3633VvvR5P8AMvE0xsxuXd2rctXL3ZLrE0yRlsJrah6b1914+qR0YNzoyarI8I2SVNq8Gpey/NMvx88yY70qYrnK+vT0er/ofQkdH2FKToyT0TyKvtNL4Hvt0Ty+3KxkAF2VYAAAAAAAAAAAAAAAAAAAAAAAAIjtLTGWNY21Hc3Zxb95PgvXl6kuVPb+T31vcr7ul6z6Ss6en7kLtCrGnQltK98kuN/tryRLwVNyrJrJLNvl99CMxanNq2xcfwR8EuvmdxgycmkW8pXfvIAwbGRgYAB6ADBk8BhmrNjVnjPTVnJnYsbI6PhJcYSXOMuqOtmrNUnY2Rbi7rUx2UrduR9q0rKI/Vj7zf8A3F+heT55bOVU4ZFft1PVr3q17UX6F8xMiNtcLIPWM4qS8mdJ2LWhKi6aVmnn433/AMehX9pwblGrueXJrVed7821uPcAFyVYAAAAAAAAAAAAAAAAAAAAAAABzZ+Qqq52P8EW15+C+ehTsNNR3nxlNuyT+LJ7tXL7BQ/tLIV+nP8AYhkjm+2Km1WjDcl1evRIt8FDZo3+Z9El/LZsZNTm2lid9TZVvOHeQlDejzWq5lWs2Sjod0VzlFeqMLIh78f8yKIvo2XjlfKn95B/RnD+8v8Akr/kS+6w/wD2/wBrMLvh1L+mnxXEyRnZ/ZKw6I0KcrN1yeslpzeuiXgiUI8rJtLNe9x6YMag1sgpJxfKSafk1ozE9IuztNgRbTy8fVcHpbF8fRnm+1Wz/wC90fzEQy+jbB9/J+C34cP9Bl/Rzgdcj+ZH/iSXHDfNL0X3PMyy4WfTfFzpshbFPRuElJJ9HpyZ7sjdg7BowoShTv6TlvSc5b0m9NESLIVXZUnsaeOpsjoaslOxmRpG3Hb17qblD/xS4r9dSLZ6bCu3M2HSyqdb84veRv7Lrd3io+OXvzPMRDbw84+F1zjn9Ll3AB2hzoAAAAAAAAAAAAAAAAAAAAAAABW+1suONHrZOXyS/cjzv7Wr6+L+exfNRI5HI9p/1dTy/ai9w6/28PP9zNzGpg0lbFc5JebRCTNliN7UbZeHju5Q35b0YQT1Ud5+L08NEzg7F9p55ytjZCMLKt16w13HGWvg22nw6k3mY1ORXKqxRsrlpvLXpxT4cnr4nlsjY+PixlGivcUmnJ6uUm1y1b4kmM6XdOLj8d9fD6mLTuSJk85zSTbaSXFtvRJEJtftbh40N92xueu6oUyjZNvTXjx0S+LNcIym7RVz1k8CpbK+kDCuluT3sZ6Np3bqg9OPtJ6L10LBgbXxr3pTfVa1zULIyfyTMp0p0/1Jo8TuRHb3bN2HiqylJTndGvea3lBNSe9py8EvU4Po72/kZkLo3/XdThuz3VHXeT1i9OGq0/Ut2RTCyLhOMZwktJRmlKLXRp8zkj/0uLBQiqseGrajCMYLXxeiNneQ7p09m8r6nsYtyy9DsZozkW2Md8O9idULFJJxaafJp6ohzhJapm1wlHVNGGeePwyMWX+Np84s9Gzzp45GMv8AGT+UWY4b+op2+ZfU9Wkv/Mv2sv4AO+OZAAAAAAAAAAAAAAAAAAAAAAAAIHtdD7GFn9nbCT8nw/YhkWzaeMrarK/ei0vPmv1SKZhWb0Fr7UfqyT56o5jtmns11P5l1X+UXOBntULfK+j06pmM+UlXJw13tPDnp4lXt159S4o83j1t6uutv8iIuFxXcpqxZUMQqSaaKjS5qS3dddeG7z1LlXroteei18zWFUY8oxXkkj0GIxHfNZWsY4iv3tsrWIDYuyI7WstyMpylh1XTpxqFJxhOVb0lbZo9ZceS+D9e/tV9H2Jk4+5i1UYt0GpVyhWoJ6fgnurVxf6PR/Aj+z22IbLstw8t93j2XWXYl7T7rSx70qpv8LT14sndq9udnUwco5FeTY/u6seautnLwilHXTXqzpsMqXdR2NLe+pRVnV716+HArPYX6NnRZK/PVNsknGqpfa1p+M5arRvovDn5Wbb3YrDyIN11QxsiPGm6iKqnCa5N7um8vgyI7Pdtp1OVO19MW2bdlM5JKmVUuPd7y4KUeXH4eJI7X7eYNcGse2ObkSWlNWO+9cp+GrjwjHqzZGUHG60MJqsp77+F7HB2W2jZkY0Z2pK6ErKbtOXe1ycZP1019SF7QYV3fTm1JxlputJySXThyJvsvs2eNiwrte9bJztua5d7ZJyl8tdPQlWcr3ypVpSpq6z9Ll/h67oyulc+fRwrnyrsflCZaOz+NZXU1YnHelqovmloTDNGa8TjJVYbFkkb62LdWOzaxozfY1W/m1L+zhOx+uiX9Gaskex1G9K7Ib4N91X+SPj8zHsql3mLj4Z+n5IVeexQnLwt5yy+l35FrAB25zoAAAAAAAAAAAAAAAAAAAAAAAAKdt7F7i/vF91e+PSNvj8+fz6FxOXPxIX1yrmtYyXqn4NfFETG4ZYik4b9Vz+z0fMk4Wv3M7v9LyfL7rXoVRA85VTpn3NvtL7uXhOvqvj8D1OQlFxbjJWa3F01wzXHiYMmDJ6Yml1UZpxnGM4vmpJST80zwxdl49T3qqKa5dYVwi/mkdQPbg0vphNbs4xnF+EoqS+TPPGwaavu6q69ee5CMP6I9wL7gDVmzNWYsIwzzkbs5sm9QXHVtvSMV7UpdEaZcDZFNuyNL96TjTD7y17sfgvGXoi87NxI01QqjyhFL1Ins3smUNci5fbWLgvCEPCKLCdX2Vgf9PTcp/ql0W5FTjsQqjVODvFb+L48lovN7wAC1IAAAAAAAAAAAAAAAAAAAAAAAAAAABxbQwK74bli1XOLXCUZdYvwZWMzDtx/bTsq8LIrkv414efIugIWLwNPEZvKXFfzx96ErD4qVL4dY8Ps9304plJhNNappp+KeqNiZzOz1M25Vt0TfFuvTcb+MHwf6EXfsrLr/DC+PWuW7P8Ayy4fqUNbs3EU9FtLwz6allTr0qmkrPhLLrp18jyB4W3Sh7dWRD81UtPmtTxW1Kff081Jf1RCknF2krc8iSqNR6Rvyz+h2g45bUoX4/0b/wBjENowl7EbZ/krk/6iK2naOfI9dCos3F+lvqdjNZM1qxsyz7vHda966Sj/AKVxJHH7LylxyLnP+Ctblf7slU+z8RV0jZcXl+ehonVpU/1zXJfE+mXq0Q3fynLcpi7rH09lfGTLDsXs+q331z7y58vdgukUS+JhVUx3a4RgvgjpLvB9mU6D23nLouS/krsRjpVI7EFaPV83w8PW4ABZkEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHlZTB84xfnFM9QLsWRzrEqXKuC/wDWJ7RilySXkbACwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB//9k='");
	}else if(ip.equals("172.30.1.96" )||ip.equals("f")) {
		out.println("현중이");
		out.println("<img src='data:image/jpeg;base64,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'>");
	}else if(ip.equals("172.30.1.76")){
		
		out.println("<img src='data:image/jpeg;base64,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'>");
	}else if(ip.equals("172.30.1.35")) {
		out.println("<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqsDDLmDLVBxUiRq8hcUuQVMH8Fvxvy2ahqA&usqp=CAU'>");
	}else {
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
	  <h1>뭘기대한거지?<h1>
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
		
	
//	IPv6
	// 0:0:0:0:0:0:0:1
//	IPv4
//	127.0.0.1
//  이 둘의 의미는 localhost 를 의미한다
	
	
	System.out.println(ip);
	
//	Client의 요청 URL 가져오기
//	Client가 요청한 uri도 가져올 수 있음
	
	String uri = request.getRequestURI();
	System.out.println(uri);
	}
	
}
