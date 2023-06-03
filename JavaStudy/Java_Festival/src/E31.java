package festival;

import java.util.Scanner;

public class E31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int in = sc.nextInt();
		
		int fac = 1;
		for (int i = 1; i < in+1; i++) {
			fac *= i;
		}
		
		System.out.println("출력 : " + fac);
				
	}

}
