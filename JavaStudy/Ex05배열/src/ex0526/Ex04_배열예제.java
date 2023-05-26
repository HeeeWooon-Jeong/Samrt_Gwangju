package ex0526;

import java.util.Iterator;
import java.util.Random;

public class Ex04_배열예제 {

	public static void main(String[] args) {

		// 로또
		
		int[] array = new int[5];
		Random ran = new Random();

		System.out.println("=====로또타임=====");
		System.out.println("이번주 출력번호");

		int j = 0;
		
		do {
		for (int i = 0; i < array.length ; i++) {
			int ran1 = ran.nextInt(10) + 1;
			array[i] = ran1;
		} while (array[i] == array[i-1]);
		

		}
		}
}