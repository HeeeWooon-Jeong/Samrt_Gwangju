package for문;

import java.util.Scanner;

public class Ex05for문_예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int num = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int num2 = sc.nextInt();
		
		for (int i = 1; i <= num2; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}

		sc.close();
		
		
		
	}

}
