package Ex0602;

public class Member {

	//
	String ID;
	String name;
	int age;
	
	//
	public void send() {
		
		System.out.println(ID+"가 메시지를 보냈습니다.");
	}
	
	public void login() {
		
		System.out.println(name +"님 환영합니다.");
	}
	
	public void gift() {
		
		System.out.println(name +"s님이 기프티콘을 보냈습니다.");
	}
	
}
