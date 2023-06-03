package festival;

import java.util.Scanner;

public class E14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int in2 = sc.nextInt();

		int[][] arr = new int[in][in2];

		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = cnt++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i % 2 == 1 && i != 0) {
					System.out.print(arr[i][4 - j] + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");

				}
			}
			System.out.println();
		}

	}

}
