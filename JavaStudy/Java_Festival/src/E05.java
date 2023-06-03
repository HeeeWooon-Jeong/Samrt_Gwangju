package festival;

import java.util.Scanner;

public class E05 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int cnt = sc.nextInt();
		for (int i = 1; i <= cnt; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
