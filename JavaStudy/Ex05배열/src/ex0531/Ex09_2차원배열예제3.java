package ex0531;

import java.util.Iterator;

public class Ex09_2차원배열예제3 {

	public static void main(String[] args) {

//		int[][] dia = new int[5][5];
//		
//		int a = 2;
//		int count = 1;
//		//math.abs()
//		for (int i = 0; i < dia.length; i++) {
//			for (int j = 0; j < dia.length; j++) {
//				System.out.println(count);
//			}
//				
//		

		int[][] array = new int[5][5];

		int num = 1;
		int start = 2;
		int end = 3;

		for (int j = 0; j < array.length; j++) {
			for (int i = start; i < end; i++) {
				array[j][i] = num++;
			}
			if (j < 2) {
				start--;
				end++;
			} else {
				start++;
				end--;
			}
		}
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + "\t");
			}

			System.out.println();
		}
	}
}
