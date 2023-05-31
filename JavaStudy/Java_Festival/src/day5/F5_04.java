package day5;

import java.util.Scanner;

public class F5_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] starNum = new int[5];
		for (int i = 0; i < starNum.length; i++) {

			System.out.print(i + "번째 별의 수 :");
			int star = sc.nextInt();
			starNum[i] = star;
		}
		for (int j = 0; j < starNum.length; j++) {
			System.out.print(starNum[j] + ":");

			for (int k = 0; k < starNum[j]; k++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
