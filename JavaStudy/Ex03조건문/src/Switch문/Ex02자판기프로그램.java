package Switch문;

import java.util.Scanner;

public class Ex02자판기프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요 >> ");
		int money = sc.nextInt();
		System.out.println("메뉴를 고르세요.\n1.이구동성(700원) 2.썬칩(1000) 3.뽀빠이(500) >> ");
		int menu = sc.nextInt();
		
		int change = ' ';
		int exchange = ' ';
		
		// 1번
		switch(menu) {
		case 1: 
			change = money - 700;
			break;
		case 2 :
			change = money - 1000;
			break;
		case 3 : 
			change = money - 600;
			break;
		default :
			break;
		}
		// 2번
//		if( change < 0) {
//			System.out.println("돈이 부족해요ㅠㅠ\n잔돈 : " + money +"원");
//		}else {	
//		System.out.println("잔돈 : " + change +"원"); 
//		}
		
		// 3번
 		if(change >= 1000) {
 			exchange = change/1000; 
 			System.out.println("잔돈 : "+change+ "원");
 			System.out.print("천원 : "+exchange+ "개");
 		}
		
		
		
		
		
		
		
		
		
	}

}
