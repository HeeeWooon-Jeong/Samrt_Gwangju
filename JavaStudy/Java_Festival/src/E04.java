package festival;

import java.util.Scanner;

public class E04 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();
		
		int[] chan = new int[5];
		
		
		
		
		System.out.println("잔돈 : " + money );
		System.out.println("10000원 : " +chan[0] +"개");
		System.out.println("5000원 : " + chan[1]+"개");
		System.out.println("1000원 : " + chan[2]+"개");
		System.out.println("500원 : " + chan[3]+"개");
		System.out.println("100원 : " + chan[4]+"개");
		
		
	}

}
