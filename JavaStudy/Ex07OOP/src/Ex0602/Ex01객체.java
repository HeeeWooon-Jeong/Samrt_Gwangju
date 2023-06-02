package Ex0602;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01객체 {

	
	
	
	
	
	public static void main(String[] args) {
		
		
		// Scanner를 만드는 방법
		Scanner sc = new Scanner(System.in);
		
		// 객체 생성
		// new 클래스이름();
		// 클래스 == 내가 만드는 자료형
		// 생성하고자 하는 클래스와 ==> 자료형
		Person p = new Person();
		System.out.println(p);
		Member m = new Member();
		
		//객체 안에 데이터 채우기
		// 세모 조그만 네모 요소 동그라미 메소드
		// 레퍼런스변수명.필드명 =  
		p.name = "ㅎㅎ";
		p.age = 30;
		p.height = 180.5;
		
		System.out.println(p.age);
		
		// 객체가 가진 기능(메소드) 실행
		p.walk();
		//sc.nextInt();
		
		Person p2 = new Person();
		
		p2.name = "히운";
		
		
		
		////////////////////////////////
		
		
		// "test" --> "es"
		// String이 가진 기능만 허용
		String smhrd = "스마트 인재 개발원";
		
		// 1. split( Stirng );
		// 문자열을 매개변수를 기준으로 나누어 줌
		String[] spl = smhrd.split(" ");
		System.out.println ( spl[1] );
		// 인재
		
		
		// 2 - 1. substring ( int );
		// 슬라이싱
		smhrd.substring(3);
		// 인재 개발원  / index 3 ~ 끝까지
		
		// 2 - 2. substring ( int, int );
		smhrd.substring(3, 6);
		// 인재  / index 3 ~ 6-1 까지 출력
		
		// 3. contain( "문자열" ); 
		smhrd.contains("스마트");
		// ture    /  포함하고 있는지 확인
		
		// equals("문자열");
		
		smhrd.equals("스마트"); 
		// false  / 문자열 비교 String은 == 호환 안되기 때문
		
		
		//각 기본 자료형은 대응하는 참조자료형(클래스)가 존재
		//int <--> Integer
		
		String num = "123";
		int n = Integer.parseInt(num);
		System.out.println(n);
		
		Integer a = 10;
		int number = a;
		
				
				
				
				
//		사용불가
//		Math 
//		Arrays
//		
		
	
		
		
	}

}
