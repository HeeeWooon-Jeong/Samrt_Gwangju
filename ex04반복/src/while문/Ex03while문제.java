package while문;

import java.util.Scanner;

public class Ex03while문제 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//
//		int num = 0;
//		int num2 = 0;
//		
//		while ( true ) {
//		
//			System.out.print("정수 입력 : ");
//			int num1 = sc.nextInt();
//		
//			num2 = num += num1;   
//			System.out.println("누적결과 : " + num2);
//			
//			if (num1 == -1) {
//			System.out.println("종료되었습니다.");
//				break;
//			}
//		}

		// 1. d입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		// 2. 정수입력 출력하기(줄바꿈 없이)
		int sum = 0;
		while (true) {
			System.out.print("정수 입력 : ");
		// 3. 정수 입력 받기
			int num = sc.nextInt();
		// 4. 입력받은 정수 누적하기
		// ===> 누적할 변수 하나 필요!
			//sum = sum + num;
			sum += num;          //복합 대입 연산자
			System.out.println("누적 결과 :" + sum);
		if (num == -1) {
			System.out.println("종료되었습니다.");
			break;
		}
		}
		// 5. 2~4까지 반복!
		
		// ** -1을 입력하면 종료

	}

}
