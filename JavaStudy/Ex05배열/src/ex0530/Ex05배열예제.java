package ex0530;

import java.util.Iterator;
import java.util.Scanner;

public class Ex05배열예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("====수박 게임 start~!====");
		char[] data = {'수', '박'}; 
		
		System.out.print("숫자를 입력하세요 >> ");
		int num = sc.nextInt();
		
		int re = 0;
		for (int i = 0; i < num; i++) {
			re = i%2;
			
			System.out.print(data[re]);
//			if(i%2==0) {
//				System.out.print(data[0]);
//			}else {
//				System.out.print(data[1]);
//			}

		}
	}
}
