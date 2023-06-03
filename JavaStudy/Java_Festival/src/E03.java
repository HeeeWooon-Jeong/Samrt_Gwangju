package festival;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		
//		for (int i = 1; i <= 100; i++) {
//		    if (i % 2 == 0) {
//		        i *= -1;
//		        System.out.print(i + " ");
//		    } else {
//		        System.out.print(i + " ");
//		    }
//		}
		int a= 0;
		for (int i = 1; i <= 100; i++) {
		    if (i % 2 == 0) {
		        System.out.print(-i + " ");
		        a+=-i;
		    } else {
		        System.out.print(i + " ");
		        a+=i;
		    }
		    
		}
		System.out.println();
		System.out.println("결과 : " + a);
		
		
		
		
	}

}
