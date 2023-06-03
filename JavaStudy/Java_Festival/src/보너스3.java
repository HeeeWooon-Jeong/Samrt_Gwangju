package festival;

import java.util.Scanner;

public class 보너스3 {
	public static int cal(int num1, int num2, char op) {
		int result = 0;
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 > num2 ? num1 - num2 : num2 - num1;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char op = sc.next().charAt(0);
		int num1 = 50;
		int num2 = 15;

		System.out.println(cal(num1, num2, op));

	}

}