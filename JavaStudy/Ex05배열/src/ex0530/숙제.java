package ex0530;

import java.util.Iterator;

public class 숙제 {

	public static void main(String[] args) {
		
		
		
		// 3      12
		// 6      15
		// 9      18
		
		int[][] num = new int[3][2];
		
		int cnt = 1;
		for (int i = 0; i < num.length; i++) {
			
			for (int j = 0; j < num.length; j++) {
				num[j][i] = 3*cnt++; 
			}
			for (int k = 0; k < num.length; k++) {
				num[k][1] = 3*cnt++;
			}
			System.out.print(num[i][0]+"\t"+num[i][1]);
			System.out.println();
			}	
		}
		
		
	}


