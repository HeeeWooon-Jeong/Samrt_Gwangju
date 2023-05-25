package doWhile;

import java.util.Scanner;

public class Ex02dowhile문예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int w1 = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int w2 = sc.nextInt();
		
		int we = 1; // 주차 수
		//int m = w1; // 현재 몸무게를 변수로 초기화 되지 않게 고정
		do {
			System.out.print(we+"주차 감량 몸무게 : ");
			int mi = sc.nextInt(); // 뺄 몸무게
			we++;  // 주차 1 씩 추가
			w1 -= mi; 
		} while (w1 > w2 );
			System.out.println("다이어트 성공!");
		
		
		
		
		
		
		
	}

}
