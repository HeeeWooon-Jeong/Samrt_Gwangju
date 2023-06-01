package ex0601;

public class Ex01메소드 {
	
//	public class Sample {
//		int sum(int a, int b) {
//			return a + b;
//		}
//	}
	public static int addNumber(int num1 , int num2) {
		System.out.println("두 수를 더하는 메소드 실행");
		int result =  num1 + num2;
		return result;
	}

	public static void main(String[] args) {
		
		
		int result = addNumber(10, 1);
		System.out.println(result);
		
		
		
		
		
		
//		int a = 3;
//		int b = 4;
//		
//		Sample sample = new Sample();
//		int c = sample.sum(a, b);
//		
//		System.out.println(c);
//		
		
		
	}

}
