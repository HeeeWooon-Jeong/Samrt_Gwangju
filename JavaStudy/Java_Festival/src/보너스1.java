package festival;

import java.util.Scanner;

public class 보너스1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("A 입력>> ");
			int a = sc.nextInt();
			System.out.print("B 입력>> ");
			int b = sc.nextInt();
			
			if(a==0 && b==0) {
				break;
			}
			System.out.print("결과 >> " + (a - b));

			System.out.println();
		}
	
	
	
	}
	
	
}