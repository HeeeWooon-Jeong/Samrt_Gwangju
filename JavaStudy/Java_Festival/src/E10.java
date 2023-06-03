package festival;

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
	

			System.out.print("배열에 있는 모든 값 : ");
			int[] arr = new int[] { 10, 56, 21, 57, 35, 54, 14, 26 };

			int max = arr[0];

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}

			System.out.println(max);
		
		
		
	}

}
