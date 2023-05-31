package day5;

import java.util.Arrays;

public class F5_05 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int[] result = new int[2];
		int min = 100;

		for (int i = 0; i < point.length - 1; i++)
			for (int j = i + 1; j < point.length; j++)
				
				// math.abs(모든 수) = 절대값 추출
				if (Math.abs(point[i] - point[j]) < min) {
					min = Math.abs(point[i] - point[j]);
					result[0] = i;
					result[1] = j;
				}
		System.out.print(Arrays.toString(result));

		
//		int[] point = {92, 32, 52, 9, 81, 2, 68};
//		int[] result = new int[2];
//		int minDistance = Integer.MAX_VALUE;
//
//		for (int i = 0; i < point.length - 1; i++)
//		    for (int j = i + 1; j < point.length; j++)
//		        if (Math.abs(point[i] - point[j]) < minDistance) {
//		            minDistance = Math.abs(point[i] - point[j]);
//		            result[0] = i;
//		            result[1] = j;
//		        }
	}

}

