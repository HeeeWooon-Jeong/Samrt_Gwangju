package 보충수업;

public class Main {

	public static void main(String[] args) {
		
		// 객체 생성하는 방법
		// 데이터타입 변수명 = new 클래스명();ㅣ
		Restaurant resA = new Restaurant();
		Restaurant resB = new Restaurant();
		
		
		// .으로 해당 클래스 내의 필드 또는 메서드에 접근이 가능
		
		resA.address = "광주 광역시 남구 123 번지" ;
		resA.money = 1000000;
		resA.brand = "bugerking";
		
		resA.address = "광주 광역시 남구 124 번지" ;
		resA.money = 1000000;
		resA.brand = "맘스터치";
		
		// =========================객체 생성
		
		System.out.println(resA.money); 
		resA.calculate(500000);
		System.out.println(resA.money); 
		
		// =========================
		
		
		// 생성자
		
		Restaurant bugerRest = new Restaurant();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
