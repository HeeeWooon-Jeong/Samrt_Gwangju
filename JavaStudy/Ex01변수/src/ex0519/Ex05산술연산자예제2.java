package ex0519;

import java.util.Scanner;

public class Ex05산술연산자예제2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner( System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		int a1 = num % 100; 
		
		System.out.print("결과 값 : "+ (num-a1));
		sc.close();
			
		
		
	}

}
