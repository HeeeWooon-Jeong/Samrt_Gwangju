package ex0519;

import java.util.Scanner;

public class Ex06산술연산자예제3 {
	
	public static void main(String[] args) {
		
		//초를 입력받아 [시, 분 , 초] 형태로 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
		int h = totalSecond/3600;
//		int m = totalSecond/60 - h*60; 
		int m = totalSecond%3600/60 ;
//		int s = totalSecond%3600%60;
		int s = totalSecond%60;
		
//		System.out.print(h+"시"+m+"분");
		System.out.print(h+"시"+m+"분"+s+"초");
		
		
		
		
		
		
	}
}
