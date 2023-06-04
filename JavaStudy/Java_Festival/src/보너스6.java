package festival;

import java.util.Scanner;

public class 보너스6 {

	public static void main(String[] args) {

		int base = 2;
		int n = 0;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);

	}

	public static int powerN(int a, int b) {
	    int result = a;

	    if(b == 1) {
	    	result = a;
	    	
	    } else if(b==0) {
	    	result = 1;
	    
	    } else {
	        for (int i = 1; i < b; i++) {
	            result *= a;
	        }
	    }

	    return result;
	}

}
