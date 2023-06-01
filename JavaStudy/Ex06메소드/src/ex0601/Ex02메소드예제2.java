
//스위치 케이스
package ex0601;

import java.util.Scanner;

public class Ex02메소드예제2 {
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
        System.out.print("정수1 입력 :");
        int num1 = sc.nextInt();

        System.out.print("정수2 입력 :");
        int num2 = sc.nextInt();
        // char 자료형 스캐너 방법
        char op = sc.next().charAt(0);

        System.out.println(cal(num1, num2, op));

    }

}