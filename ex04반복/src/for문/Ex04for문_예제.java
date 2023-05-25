package for문;

import java.util.Scanner;

public class Ex04for문_예제 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.print("단 입력 : ");
//		int num = sc.nextInt();
//
//		for (int i = 1; i < 10; i++) {
//			System.out.println(num + "*" + i + "=" + num * i);
//		}
//
//		sc.close();

		for(int i=2; i<10; i++) {
		    for(int j=1; j<10; j++) {
		        System.out.print(i*j+" ");
		    }
		    System.out.println("");  // 줄을 바꾸어 출력하는 역할을 한다.
		}

	}
	}

