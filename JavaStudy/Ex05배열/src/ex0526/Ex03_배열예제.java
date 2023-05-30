package ex0526;


import java.util.Arrays;
import java.util.Random;


public class Ex03_배열예제 {

	public static void main(String[] args) {
		
		// 가장 큰 수 찾기
		
		int[] array = new int[5];
		Random ran = new Random();
		
		System.out.print("배열 안에 들어있는 값 : ");
		
		int a = 0;
		
		for (int i = 0; i < array.length; i++) {
			int ran1 = ran.nextInt(10)+1; 
			array[i] = ran1;
			
			if (array[i]>a) {
				a = array[i];
			
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.print("가장 큰 값은 "+ a +"입니다.");
		
		
	//
//		 int[] array = new int[5];
//	        Random ran = new Random();
//
//	        System.out.print("배열 안에 들어있는 값: ");
//
//	        int max = Integer.MIN_VALUE;
//	        for (int i = 0; i < array.length; i++) {
//	            int randomNumber = ran.nextInt(10) + 1;
//	            array[i] = randomNumber;
//				max = Math.max(max, array[i]);
//			}
//
//			System.out.println(Arrays.toString(array));
//			System.out.print("가장 큰 값은 " + max + "입니다.");
//		
		
	}
}
