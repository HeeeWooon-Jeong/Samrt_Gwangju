package ex0601;

import java.util.Iterator;

public class Ex02메소드예제1 {

		public static int add(int a , int b) {
//			return a + b;
			//
			int result = a + b;
			System.out.println(result);
			return result;
		}
		public static void sub(int a , int b) {
			int result =  a - b;
			System.out.println(result);
		}
		public static int mul(int a , int b) {
			return a * b;
		}
		public static int div(int a , int b) {
			return a / b;
		}
		public static void main(String[] args) {
		
			
			sub(3,5);
//		String[] method = { "add", "sub", "mul", "div"};
//		
//		for (int i = 0; i < method.length; i++) {
//			
//		}
//		System.out.println(add(3, 5)+"\n"+sub(3, 5)+"\n"+mul(3, 5)+"\n"+div(3, 5)+"\n");
		
		
	}

}
