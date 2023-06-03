package festival;

import java.util.Scanner;

public class 보너스6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int cnt = 1;

		for (int i = 0; i < 5; i++) {
			System.out.print(cnt + "번째 수 입력 : ");
			arr[i] = sc.nextInt();
			cnt++;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// 두 요소를 교환
					int change = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = change;
				}
			}

		}
		System.out.println("정렬 후");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
}
