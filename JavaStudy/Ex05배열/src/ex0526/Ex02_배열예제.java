package ex0526;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Random;

public class Ex02_배열예제 {

	public static void main(String[] args) {

		int[] array = new int[5];

		Random ran = new Random();
				
		System.out.print("array에 들어있는 홀수는 ");
		int[] array2 = new int[5];
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			int ran1 = ran.nextInt(100) + 1;
			array[i] = ran1;
			
			if (array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
				num++;
			}

		}

		
	}

}
