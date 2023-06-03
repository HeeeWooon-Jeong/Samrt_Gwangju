package festival;

import java.util.Scanner;

public class E17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int num = 0;
		int cnt = 1;
		for (int i = 0; i < 10; i++, cnt++) {

			System.out.print(cnt + "번 째 정수 입력>>");
			num = sc.nextInt();
			arr[i] = num;
		}
		System.out.print("3의 배수 : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
