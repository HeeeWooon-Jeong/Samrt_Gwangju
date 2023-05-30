package ex0530;

import java.util.Iterator;

public class Ex06_2차원배열 {

	public static void main(String[] args) {
		
		// String을 저장하는, 3행 3열의 이차원배열을 생성
		// new 자료형[행][열];
		String[][] array = new String[3][3];
		
//		System.out.println(array[1][1]);
		
		// 레퍼런스변수[행][열];
		array[1][1] = "희운";
		array[2][1] = "둘";
		
		
		//==========================================
		
		
		// 2차원 배열의 길이
		// 행의 길이를 호출
		int rows = array.length ; 
		// 2행의 열의 길이를 호출
		int col  = array[0].length;

//		계단식 2차원 배열도 있음
	

		int[][] numArr = new int[2][3];
		
		int cnt = 1;
		for(int j = 0; j < numArr.length; j++) {
		
			for (int i = 0; i < numArr[0].length; i++) {
				numArr[j][i] = 3*cnt++;
				System.out.print(numArr[j][i]+ "\t");
								
			}
			System.out.println();
		}
			
//		
		
		// 배열 안의 요소를 전부 출력
		
		
		
		
	}

}
