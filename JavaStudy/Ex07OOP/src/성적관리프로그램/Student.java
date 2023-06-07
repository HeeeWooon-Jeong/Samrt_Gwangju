package 성적관리프로그램;

public class Student {
	
	
	//필드
	private String name; 		//이름
	private String number;		//학번 
	private int age;			//나이
	private int scoreJava;		//Java점수
	private int scoreWeb;		//Web점수
	private int scoreAndroid;	//Android점수
	
	//메소드
	
//	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
//		
//		this.name = name;
//		this.number = number;
//		this.age = age;
//		this.scoreJava = scoreJava;
//		this.scoreWeb = scoreWeb;
//		this.scoreAndroid = scoreAndroid; 
//	}
	
	
	
	
	// 생성자 메소드의 특징
	// 1. 기본 생성자메소드 생략 가능
	// 2. 생성자도 메소드다!
	// 3. 리턴타입을 적지 않는다.
	// 4. 생성자명은 클래스명과 동일해야한다.
	// 5. 매개변수를 받는 새로운 생성자를 추가하는 순간 기본생성자는 덮어 씌어지기 때문에 사용 불가 
	// 다시 생성하면 사용 가능
	// 메소드 오버로딩 - 중복정의
	// 매개변수의 개수를 다르게 함으로써 중복으로 정의
	
	
	
	
	// public Student() { }
	public Student() {
		// 기본 생성자
	}
	
	
	
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {

		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}



	//getter 메소드
	// : 필드에 있는 데이터를 가져갈 수 있는 메소드
	
	public String getName() {
		return name;
		
	}
	
	
	
	// setter 메소드
	// : 필드에 있는 데이터를 수정할 수 있는 메소드
	
	
	public void setName(String name) {
		this.name = name;
	}




	public String getNumber() {
		return number;
	}




	public void setNumber(String number) {
		this.number = number;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public int getScoreJava() {
		return scoreJava;
	}




	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}




	public int getScoreWeb() {
		return scoreWeb;
	}




	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}




	public int getScoreAndroid() {
		return scoreAndroid;
	}




	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	
	// getter , setter 메소드 단축키
	// Alt + Shift + S
	
	
	
	
	
	
	
	
}
