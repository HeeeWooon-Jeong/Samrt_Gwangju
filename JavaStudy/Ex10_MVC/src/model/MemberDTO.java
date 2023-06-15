package model;

public class MemberDTO {
	
	// DTO : Data Transfer Object : 계층간 데이터 전송을 위한 객체
	// 데이터를 편하게 주고받기 위해 만드는 바구니(자료형)
	
	// 필드 필요! 
	// entity 라고 지칭하기도 함!!
	// DB의 테이블과 직접적인 연관성을 가짐
	// DTO 도 1테이블 당, 1개씩 만들어야 한다.
	// 테이블의 각각의 컬럼안 데이터를 저장할 필드가 필요하다.
	
	
	// field
	// 반드시!!!!!!!!!!!  테이블의 컬럼명 == 필드명 일치
	// private도 선언
	
	private String id ;
	private String pw ;
	private int age ;
	
	
	
	// 메서드
	// 생성자
	public MemberDTO(String id, String pw, int age) {
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	
	// 기본생성자 반드시 위 메서드는 3개의 매개변수가 고정되어있기때문에
	// 유연성 있는 기본 생성자 생성
	public MemberDTO() {
		
	}
	
	
	// Getter / Setter가 반드시 필요!!
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
}
