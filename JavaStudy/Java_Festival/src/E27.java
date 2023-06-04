package festival;

import java.util.Scanner;

public class E27 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	        System.out.println("==== 채점하기 ====");

	        String input = sc.next();
	        int sum = 0;
	        int cnt = 1;
	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) == 'o') {
	                sum += cnt++;
	            } else {
	                cnt = 1;
	            }
	        }
	        System.out.println(sum);
	}

}
