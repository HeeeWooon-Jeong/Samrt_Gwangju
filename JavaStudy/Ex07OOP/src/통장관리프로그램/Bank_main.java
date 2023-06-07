package 통장관리프로그램;

import java.util.Scanner;

public class Bank_main {

	public static void main(String[] args) {
		//메인 밑 실행공간
		//BankBook 자료형 b1
		//1. BankBook class를 기반으로 b1 생성
		//자료형 객체명 = new
		//자료형  ----> class명
		Bankbook b1 = new Bankbook();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입금할 금액 입력 >> ");
		int input = sc.nextInt();
		
		//2. b1에 입금
		b1.deposit(input);
		
		//3. 현재 잔액 출력
		b1.showMoney();
		
		//4. b1에 인출
		System.out.print("인출할 금액 입력 >> ");
		int out = sc.nextInt();
		b1.withdraw(out);
		
		//5. 현재 잔액 출력
		b1.showMoney();
		
		
		
		b1.deposit(sc.nextInt());
		
		
		sc.close();
	}
}
