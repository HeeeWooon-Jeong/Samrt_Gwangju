package while문;

import java.util.Scanner;

public class Ex02while {

	public static void main(String[] args) {
		
		// 입력도구 꺼내기
		Scanner sc = new Scanner(System.in);
		while(true) {
		// 정수입력 출력하기
		System.out.println("정수 입력 : ");
		// 정수 입력 받기
		int num = sc.nextInt();
		if ( num > 10 ) {
			// 10보다 큰수를 입력하면 종료!
			System.out.println("종료되었습니다.");
			break;
			}
		}
		//
		
		
		
		
	}

}
