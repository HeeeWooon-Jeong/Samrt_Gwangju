package day5;

import java.util.Arrays;
import java.util.Scanner;

public class F5_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] Arr = new int[5];

		int count = 1;
		for (int i = 0; i < Arr.length; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");
			int a = sc.nextInt();
			Arr[i] = a;
		}
		// 배열 오름차순 정렬 Arrays.sort(배열변수)
		Arrays.sort(Arr);
		System.out.println("정렬 후");
		for (int i = 0; i < Arr.length; i++) {
			System.out.print(Arr[i] + " ");

		}

	}

}
