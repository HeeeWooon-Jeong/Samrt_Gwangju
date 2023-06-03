package festival;

import java.util.Scanner;

public class E22 {

	public static void main(String[] args) {

		int a = 4;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				String star = (j < a) ? " " : "*" ; 
				System.out.print(star);
			}
			a--;
			System.out.println();
		}
	}

}
