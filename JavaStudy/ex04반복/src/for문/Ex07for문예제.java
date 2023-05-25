package for문;

import java.util.Scanner;

public class Ex07for문예제 {

	public static void main(String[] args) {
		
		
		int num1 = 0;
		int result = 0;
		for(int i = 77 ; i >= 1; i-- ) {
			num1 ++;
			result += i*num1;
			System.out.print("(" + i + "*"+num1+")+");
			

		}
		System.out.println();
		System.out.println(result);
		
		
		
	}

}
