package ex02추상클래스;

public abstract class Employees {
	
	
	// public : 같은 프로젝트 내
	// protected : 패키지 내에서 공유가 가능 // 상속관계에 있는경우 자식에게 
	// default : 패키지 내
	// private : 하나의 파일 내에서만 
	
	
	
	protected String empno;
	protected String name;
	protected int pay;
	protected int bonus;
	

	
	public abstract int getMoneyPay();
	
	public abstract String print() ;
	
	
	
	
	
	
	
	
	
	
	
	
}
