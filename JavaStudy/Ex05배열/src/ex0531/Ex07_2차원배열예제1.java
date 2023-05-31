package ex0531;

public class Ex07_2차원배열예제1 {

	public static void main(String[] args) {
		
		int[][] num = new int[5][5];
		
		int k = 1;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				num[i][j] = k++;
				
				System.out.print(num[i][j]+"\t");
			}
		System.out.println();
		}
		
		
		
		
	}

}
