package 월급계산프로그램;

import ex02추상클래스.Employees;

public class RegularEmployee extends Employees {



	public void Regular(String empno, String name, int pay, int bonus) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;

	}

	// 급여 계산후 리턴
	public int getMoneyPay() {
		int result = (pay + bonus) / 12;
		return result;
	}

	// 사번:이름:연봉 리턴
	public String print() {
		String result = empno + " : " + name + " : " + pay;
		return result;
	}
	
	

}
