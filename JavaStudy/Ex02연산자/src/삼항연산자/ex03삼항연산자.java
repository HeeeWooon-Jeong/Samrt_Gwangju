package 삼항연산자;

import java.util.Scanner;

public class ex03삼항연산자 {

	public static void main(String[] args) {
		
//		Scanner sc1 = new Scanner( System.in );
//		System.out.print("첫 번째 정수 입력 : ");
//		int num1 = sc1.nextInt();
//		
//		Scanner sc2 = new Scanner( System.in );
//		System.out.print("두 번째 정수 입력 : ");
//		int num2 = sc2.nextInt();
//		
//		int result = (num1 < num2) ? num2 - num1 : num1 - num2 ; 
//		System.out.println( "두수의 차 : " + result ); 
		
		// 입력도구
		Scanner sc = new Scanner(System.in);
		// 첫번째 정수
		System.out.print("num1 : ");
		// 정수입력
		int num1 = sc.nextInt();
		
		System.out.print("num2 : ");
		int num2 = sc.nextInt();
		
		//4. num1과 num2 둘중에 더 큰수에서 작은수를 빼기!
		int result = num1 > num2 ? 
					 num1 - num2 : 
					 num2 - num1 ;
		
		// 결과 출 력
		System.out.println("두수의 차 : " + result);
	
		
	}

}
