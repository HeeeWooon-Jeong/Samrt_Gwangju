package ex02추상클래스;

import 월급계산프로그램.RegularEmployee;

public class Main {

	public static void main(String[] args) {
		
		// 1. 생성자를 이용해서 regular 객체 만들기
		RegularEmployee regular = new RegularEmployee();
		
		
		
		regular.Regular("SMHRD001", "홍길동", 4000, 400);
		
		
		// 2. 사번 : 이름 : 연봉을 출력
		
		System.out.println(regular.print());
		
		System.out.println(regular.getMoneyPay() + "만원");
		
		
		
		
		TempEmployee temp = new TempEmployee("SMHRD002", "박0수", 3000);
		
		System.out.println(temp.print());
		
		System.out.println(temp.getMoneyPay() + "만원");
		
		
		
		PartTimeEmplyee part = new PartTimeEmplyee("SMHRD003", "임0훈", 10, 2);
		
		System.out.println(part.print());
		
		System.out.println(part.getMoneyPay() + "만원");
		
		
		
		
	}

}
