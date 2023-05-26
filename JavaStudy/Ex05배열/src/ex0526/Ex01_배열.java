package ex0526;

import java.util.Arrays;

public class Ex01_배열 {

	public static void main(String[] args) {
		
//		// 배열 생성
//		// 같은 데이터 타입의 여러 변수를 하나의 묶음으로 저장
//		
//		int[] numbers = new int[5];
//		
//		System.out.println(numbers);
//		
//		// 배열 원소 접근
//		// reference 변수 [index]
//		System.out.println(numbers[2]);
//		
//		// 배열의 2번째 칸에 15라는 값을 집어 넣겠다
//		numbers[1] = 15;
//		System.out.println(numbers[1]);
//		
//		// index를 초과하면 에러 발생
//		numbers[3] = 20; 
//		System.out.println(numbers[3]);
		
		// 배열의 길이
		//  . = 가진으로 해석되기도 함
		
//		int length = numbers.length;
		
		// 배열의 각 칸을 5의 배수로 초기화
		
		int[] numbers = new int[5];
		
		
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = 5 *(i+1);
					
		}
		
		//배열의 값을 전부 출력
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print(numbers[i]+"\t");
		}
		
		// numbers 값들을 모두 출력
		String text = Arrays.toString(numbers);
		System.out.println(text);
		

		// 초기화 동시에 배열 생성
		
		int[] numbers2 = {1, 2, 3, 4 ,5};
		
		// 배열 공유
		
		int[] numbers3 = numbers2;
		
		numbers3[2] = 30;
		
		System.out.println(numbers2[2]);
		
		
		//.clone()
		
		
		
		
		
		
		
		
	}

}
