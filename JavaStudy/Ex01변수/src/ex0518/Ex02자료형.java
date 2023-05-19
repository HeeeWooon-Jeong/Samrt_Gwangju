package ex0518;

public class Ex02자료형 {

	public static void main(String[] args) {
		
		// =======  기본 자료형 ========
		// 논리 자료형
		boolean bool;
		bool = true; // or  false
		
		// char == 캐릭터
		// 문자 자료형
		char c;    char = 문자이기도 숫자이기도 함  
		c = 'A' + 1; == 98 //97 Ascii  // 'ABC' 불가, 작은따옴표 사용  아스키코드를 사용하여 저장하기 때문
		 // - 음수 저장 불가 그래서 short 가 필요
		
		// 정수 자료형
		byte b = 100; // 130 불가 // 1byte : -128 ~ 127 까지만 저장 가능하다
		short s = 2023; // 2byte  
		int i = 10000000; // 4byte   자바에서 기본으로 설정되어있다.
		long l = 70_000_000_000l; //8byte int로 기본반응하여 빨간 밑줄 생성  숫자뒤에 l(대문자 가능) 을 붙여주어야 함
		
		
		// 실수형 4byte
		float f = 3.14f;  // double 이 기본값이라 f를 붙여한다 
		// 기본  8byte 
		double d = 3.14; // 더블을 선호 
		
		reference = 참조자료형
		// 문자열
		String str = "Hello World"; // "" 로 값을 저장 
		
		
		
	}

}
