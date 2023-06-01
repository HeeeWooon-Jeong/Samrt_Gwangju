package ex0601;

import java.util.Iterator;
import java.util.Scanner;

public class Ex05완전수찾기 {

	public static boolean isDivisor(int num, int num2) {
		boolean result = false;

		if (num % num2 == 0) {
			result = true;
		}

		return result;

	}
	
	public static int getSum(int num) {
		int result = 0;
		
		for (int i = 1; i < num; i++) {
//			result = num1%i==0 ? result +=i : result; 
//			기존로직
			
		// 메소드를 호출한 로직
			// 메소드 구조 안에서 메소드를 새롭게 구현할 수는 없으나
			// 메소드 자체를 호출하여서 사용한느 것은 가능하다!
			if(isDivisor(num, i)) {
				//i가 num의 약수가 맞다면 --> true
				//i의 누적 합계
				result +=i;
			}
			
			
		
		}
		return result;
	}
	public static boolean isPerfect(int num) {
        return getSum(num) == num ? true : false;
    }
	
	
//	public static boolean isPerfect(int num) {
//		
//		for (int i = 1; i < num; i++) {
//			if(num%i==0) {
//			
//		}
//			
//		}
//	}
	

	public static void main(String[] args) {

		// 완전수
		// : 자기 자신을 제외한 약수들의 합이 자기자신과 같은수
		Scanner sc = new Scanner(System.in);
		System.out.print("num 입력 : ");
		int num = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num, num2);
		System.out.println(divisor);
		System.out.println(getSum(num));
		System.out.println(isPerfect(num));
		
		sc.close();
		
		
		
		
	}

}
