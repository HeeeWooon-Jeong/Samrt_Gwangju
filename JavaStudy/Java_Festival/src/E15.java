package festival;

import java.util.Scanner;

public class E15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("n 입력 : ");

		int n = sc.nextInt();
		int a = 1;
		for (int i = 0; i < n; i++) {

			System.out.print(a + i + " ");
			a += i;
		}

	}

}
