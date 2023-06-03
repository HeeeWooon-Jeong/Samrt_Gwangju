package festival;

import java.util.Scanner;

public class E07 {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
	        System.out.print("행 개수 : ");
	        int cnt = sc.nextInt();
	        for (int i = 1; i <= cnt; i++) {
	            for (int j = cnt; j > i; j--) {
	                System.out.print("*");

	            }
	            System.out.println();
	        }
	}

}
