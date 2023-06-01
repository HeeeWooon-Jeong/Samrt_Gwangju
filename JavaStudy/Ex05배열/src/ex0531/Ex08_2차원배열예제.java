package ex0531;

import java.util.Iterator;

public class Ex08_2차원배열예제 {

	public static void main(String[] args) {

		int[][] num = new int[5][5];

		int start = 21;
		int count = 4;
		int m = 0;

		for (int j = 0; j < num.length; j++) {

			if (j % 2 == 0) {
				for (int i = num[0].length - 1; i >= 0; i--) {
					num[j][i] = count++;
				}
			} else {

				for (int i = 0; i < num[0].length; i++) {
					num[j][i] = count++;
				}
			}
			
			
		}
	}

}
