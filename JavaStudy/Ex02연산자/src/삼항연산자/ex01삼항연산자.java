package 삼항연산자;

import java.util.Scanner;

public class ex01삼항연산자 {

	public static void main(String[] args) {
		
		//삼항연산자
		//조건문 boolean  ? 실행문1 True : 실행문2 False
		//--> 조건문이 참 이라면 실행문 1 실행
		//--> 조건문이 거짓 이라면 실행문 2 실행
		
		int num1 = 4;
		int num2 = 7;
		
		String result = num1 < num2 ? "num2가 더 크다" : "num1 더 크다" ; 
		System.out.println(result);
		
//		Scanner sc = new Scanner( System.in );
//		int num = sc.nextInt();
//		
//		System.out.print( "정수를 입력하세요 : ");
//		System.out.println( num + "는 ");
//		
		
		
		
	}
}
