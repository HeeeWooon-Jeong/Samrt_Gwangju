package for문;

import java.util.Scanner;

public class Ex06약수구하기 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int in = sc.nextInt();
			
		for (int i = 1; i <= in; i++) {
			if(in%i==0) {
			
				System.out.print(i+" ");
			
			}
		}
		
		
		
		
	}

}




