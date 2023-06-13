package ex02추상클래스;

public class PartTimeEmplyee extends Employees {
	

	private  int workDay;
	
	public PartTimeEmplyee(String empno, String name, int pay, int workDay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}

	@Override
	public int getMoneyPay() {
		return pay*workDay;
	}

	@Override
	public String print() {
		return empno + " : " +name +  " : "+ pay;
				
	}

}
