package 성적관리프로그램;

public class StudentMain {
	
	
	
	public static void main(String[] args) {
		
		// student 자료형을 가진 s1 객체 생성
		
		Student s1 = new Student("정ㅎㅇ", "20230607", 30, 100, 80, 0);
		// 생성자(constructor)
		// : new 객체 생성하는 순간에 사용되는 메소드
		// : 기본생성자(매개변수로 아무것도 받지않는 생성자 메소드)
		
		
//		Student s2 = new Student();
		
		System.out.println(s1.getName());
		
		s1.setName("메롱");
		
		System.out.println(s1.getName());
		
		
		
		
		
		
		
	}	

}
