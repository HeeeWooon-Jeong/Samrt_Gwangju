package festival;

import java.util.Random;
import java.util.Scanner;

public class E18 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] lotto = new int[6];

		
		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = ran.nextInt(45) + 1;
			
			for (int j = 0; j < i; j++) {
				
				if (lotto[i] == lotto[j]) {
				
					i--;
				}
			}

		}
		for (int j = 0; j < lotto.length; j++) {
			System.out.println("행운의숫자 : " + lotto[j]);

		}
	}
}
