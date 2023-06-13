package ex02추상클래스;

import 월급계산프로그램.RegularEmployee;

public class TempEmployee extends Employees {
	

	
	
	public TempEmployee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	public int getMoneyPay() {
		return pay / 12;
	}
	public int getMoneyPayTemp() {
		return pay + bonus / 12;
	}
	
	public String print( ) {
		return empno + " : " + name + " : " + pay;
	}
	
	
	
}
