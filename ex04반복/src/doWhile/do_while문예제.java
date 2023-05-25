package doWhile;

import java.util.Random;
import java.util.Scanner;

public class do_while문예제 {

	public static void main(String[] args) {
		
		//랜덤한 숫자 생성
		Random ran = new Random();
		//랜덤한 숫자 2개 생성 (1~10)
		
		System.out.println("===Plus Game===");
		// 계속 랜덤한 숫자를 입력 받아야 하기때문에 반복
		do {
		int ranNum1 = ran.nextInt(10)+1;
		int ranNum2 = ran.nextInt(10)+1;
		
		// 스캐너 임포트
		Scanner sc = new Scanner(System.in);
		
		// 문제 출력
			System.out.print(ranNum1+"+"+ ranNum2 +"=");
		// 정답 입력
			int input = sc.nextInt();
		// 입력 받은 정답이 일치하는지 비교
			if (input == ranNum1+ranNum2) { 
				System.out.println("SUCCESS");
			}else {
		// 정답이 일치하지 않을 경우에만 계속 하시겠습니까 출력
				System.out.println("FAIL");
				System.out.println("계속 하시겠습니까? >>" );
		// 문자를 입력 받을떄는 String으로 입력
				String answer = sc.next();
		// N을 입력받으면 프로그램 종료
		// String 타입은 기본형이 아니라 .equals() 함수로 비교
		// A.equals("B") = 불리언 잘형으로 결과 출력
		// !answer.equals("N") !를 앞에 붙이면 결과 반대로
			if(answer.equals("N")||answer.equals("n")) {
				System.out.println("종료되었습니다.");
				break;
				}
			}
		}while(true); 
			
				
		
				
				
			
				
		
		
		
		
	}

}
