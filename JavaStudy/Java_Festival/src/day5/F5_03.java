package day5;

import java.util.Random;

public class F5_03 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] numbers = new int[6];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
				}
			}
			System.out.println("행운의숫자 : " + numbers[i]);
		}

		// chat.gpt 풀이

		/*
		 * Random ran = new Random(); int[] numbers = ran.ints(1,
		 * 47).distinct().limit(6).toArray();
		 * 
		 * for (int number : numbers) { System.out.println("행운의 숫자: " + number); }
		 */

	}

}
