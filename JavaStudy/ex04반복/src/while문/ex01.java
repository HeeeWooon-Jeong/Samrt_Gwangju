package while문;

public class ex01 {

	public static void main(String[] args) {
		//while문 구조!!
		//hello world! 5번 출력하는 코드 작성
		System.out.println("hello");
		//반복횟수 카운트 할 0인 변수 설정
		int num = 0;
		while(num<5) {
			System.out.println("hello world");
			num++;
		}

		//무한반복문
		System.out.println("현재 num의 값 : " + num);
		while(true) {
			System.out.println("Hello world222222!");
			num++;
			if(num>9);{
				break;
			}
		}
		
	}

}
