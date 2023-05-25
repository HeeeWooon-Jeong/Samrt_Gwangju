package day2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
		
			System.out.print("A 입력 >> ");
			int A = sc.nextInt();
			
			System.out.print("B 입력 >> ");
			int B = sc.nextInt();
			int result = A-B;
			System.out.println("결과 >> "+result);
			
		if (A==0 && B==0) {
			break;
			}
		}
		
	}
}
