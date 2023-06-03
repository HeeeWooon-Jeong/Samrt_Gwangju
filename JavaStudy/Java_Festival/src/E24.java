package festival;

import java.util.Scanner;

public class E24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();

		int[] ten = new int[10];

		for (int i = 0; i < ten.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >>");
			ten[i] = sc.nextInt();

		}

		System.out.print("결과 >> ");
		for (int i = 0; i < ten.length; i++) {
			if (ten[i] < x) {
				System.out.print(ten[i] + " ");
			}
		}

	}

}
