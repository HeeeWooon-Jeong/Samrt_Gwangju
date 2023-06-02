package festival;

import java.util.Iterator;
import java.util.Scanner;

import java.util.Iterator;

public class E11 {

	public static boolean isDivide(int num, int num2) {

		return num % num2 == 0;
	}

	public static void main(String[] args) {

		int num = 10;
		int num2 = 2;
		boolean result = isDivide(num, num2);
		System.out.println("결과 확인 : " + result);


	}
}