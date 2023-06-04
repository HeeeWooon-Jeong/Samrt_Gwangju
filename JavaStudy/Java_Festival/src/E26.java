package festival;

import java.util.Scanner;

public class E26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 입력 >> ");
		int n1 = sc.nextInt();

		System.out.print("두 번째 숫자 입력 >> ");
		int n2 = sc.nextInt();

		int[] n2Arr = new int[3];

		for (int i = 0; i < n2Arr.length; i++) {
			n2Arr[i] = n2 % 10;
			n2 /= 10;
		}

		System.out.println(n1 * n2Arr[0]);

		System.out.println(n1 * n2Arr[1]);

		System.out.println(n1 * n2Arr[2]);

		System.out.println(n1 * n2Arr[0] + ((n1 * n2Arr[1]) * 10) + ((n1 * n2Arr[2]) * 100));

	}

}
