package festival;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] arr = new int[a][b];

		int p = 1;
		for (int i = 1; i <= arr.length; i++) {
			p = i;
			for (int j = 0; j < arr.length; j++, p+=5) {
				arr[i - 1][j] = p;
				System.out.print(arr[i - 1][j] + "\t");
				
			}
			System.out.println();
		}

	}

}
