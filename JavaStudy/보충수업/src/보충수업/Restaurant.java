package 보충수업;

public class Restaurant {
	
	// class : 객체를 만들기 위한 설계도, 분류	
	
	//field : 객체의 상태나 속성
	//method : 객체의 행동 
	
	double area; 
	
	String address;
	
	String brand;
	
	int money;
	
	
	public void makeHamburger(String stuff) {
		System.out.println(stuff+"햄버거 만들기");
	}
	
	public void calculate(int pay) {
		money+=pay;
		System.out.println(pay+"원 계산하기");
	}
	
	
	
	
	
	
	
	
}
