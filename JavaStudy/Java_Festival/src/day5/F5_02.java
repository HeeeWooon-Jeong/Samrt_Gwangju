package day5;

import java.util.Scanner;

public class F5_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];

		int k = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "번 째 정수 입력 >>");
			int in = sc.nextInt();
			num[i] = in;
		}
		System.out.print("3의 배수 : ");
		for (int j = 0; j < num.length; j++) {
			if (num[j] % 3 == 0) {
				System.out.print(num[j] + " ");
			}
		}

	}

}
