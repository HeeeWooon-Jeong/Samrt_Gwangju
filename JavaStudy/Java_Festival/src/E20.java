package festival;

import java.util.Scanner;

public class E20 {

	public static void main(String[] args) {

		System.out.println("숫자입력>>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String two = "";

		while (num > 0) {
			int remain = num % 2;
			two = remain+" " + two;
			num = num / 2;
		}
		
//	    0,1,2,3,4,5,6,7,8,9 
//		10개의 수를 사용하여 숫자를 표현 하는것을 10진법
//		
//		10을 2로 계속하여 나누면 2진법을 만들수 있다
//		2/10=5 %=0 계산 할때마다 나오는 나머지를 역순으로 나열하면 2진법
//		2/5 =2 %=1	
//		2/2 =1 %=0
//		!!마지막 몫1도 포함 한다
//		밑에서부터 역순으로 정리하면 1 . 0 . 1 . 0
		
		System.out.println(two);
	}

}
