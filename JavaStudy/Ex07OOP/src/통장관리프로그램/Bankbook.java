package 통장관리프로그램;

public class Bankbook {

	// 통장 자료형의 설계도
	// 1. field 생성
	private int money;
	//private ---> 외부 클래스에서 접근 불가능하게 하는 접근제한자!!
	// --> 캡슐화(정보은닉)

	// 2. method 생성
	// 입금
	public void deposit(int money) {
		//같은 변수명으로 설정했을때 구분 키워드 this
		//현재 내 클래스 자체를 의미하는 키워드
		this.money += money ;

	}
	// 출금

	public void withdraw(int num) {

		this.money -= num;

	}
	// 잔액보기
	
	public void showMoney() {
		
		System.out.println("잔액 : "+money+" 원");
		
	}

}
