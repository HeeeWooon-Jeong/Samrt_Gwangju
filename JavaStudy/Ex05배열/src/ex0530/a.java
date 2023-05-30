package ex0530;

public class a {

	public static void main(String[] args) {
		
		int[][] array = {
				{5, 12, 6},
				{10, 2, 8},
	            {3, 9, 7}
				
		};

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int[] row : array) {
			for(int num : row) {
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
			}
		}
		
		System.out.println("큰 값" + max);
		System.out.println("작은 값" + min);
		
	}

}
