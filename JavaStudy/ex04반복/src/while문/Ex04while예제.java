package while문;

import java.util.Scanner;

public class Ex04while예제 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int even = 0; 
//		int odd = 0;
//		
//		while(true) {
//			
//		System.out.print("숫자 입력 :");
//		int num = sc.nextInt();  
//		if ( num == -1 ) {
//			System.out.println("종료되었습니다.");
//			break;
//		}
//		if ( num%2==0 ) {
//			even += 1;
//		} else {
//			odd += 1;
//		}
//		System.out.println("짝수개수 : "+ even);
//		System.out.println("홀수개수 : "+ odd);
//	
//		
//		
//		}

		Scanner sc = new Scanner(System.in);

		int even = 0;
		int odd = 0;
		while (true) {
			
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
	
			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			even = num % 2 == 0 ? ++even : even ;
			odd  = num % 2 != 0 ? ++odd : even ;
			
			System.out.println ("짝수개수 : " + even);
			System.out.println ("홀수개수 : " + odd);
		}

	}

}
