package festival;

import java.util.Random;
import java.util.Scanner;

public class E29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int n1 = 0;
		int n2 = 0;
		int cnt = 0;
		
		while(true) {
			
			n1 = ran.nextInt(10);
			n2 = ran.nextInt(10);
			
			System.out.print(n1+" + "+n2+" = " );
			int an = sc.nextInt();
			
			if(n1+n2==an) {
				System.out.println("SUCCESS!");
			}else {
				cnt++;
				System.out.println("Faill...");
				if(cnt == 5) {
					System.out.println("GAME OVER!");
					break;
				}
			}
			
			
			
			
			
		}
		


	}

}
