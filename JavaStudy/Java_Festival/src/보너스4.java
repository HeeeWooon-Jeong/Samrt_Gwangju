package festival;

import java.util.Scanner;

public class 보너스4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print(i + "번째 별의 수 : ");
			int star = sc.nextInt();
			arr[i] = star;
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + ":");
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}