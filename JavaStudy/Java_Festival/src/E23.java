package festival;

import java.util.Scanner;

public class E23 {

	public static void main(String[] args) {

	
		int[][] arr = new int[5][5];
		
		int a= 5;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			cnt = a;
			a--;
			for (int j = 0; j < arr.length; j++,cnt+=5) {
				arr[i][j] = cnt;
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		


	}

}
