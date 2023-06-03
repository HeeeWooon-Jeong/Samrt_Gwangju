package festival;

import java.util.Scanner;

public class E08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		if (num % 10 >= 5) {
			num += 10;
			while (num % 10 != 0) {
				num -= 1;
			}

		} else {
			while (num % 10 != 0) {
				num -= 1;
			}
		}

		System.out.print("반올림 수 : " + num);

	}

}
