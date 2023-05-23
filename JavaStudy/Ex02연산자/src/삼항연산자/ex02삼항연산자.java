package 삼항연산자;

import java.util.Scanner;

public class ex02삼항연산자 {

	public static void main(String[] args) {
		
		//1. 입력 도구 꺼내오기(Scanner)
		//2. 정수를 입력하세요. 출력하기(개행없이)
		//3. 정수 입력받기
		//4. 입력 받은 정수가 홀수인지 짝수인지 판별하기
		//--> 머리속에서 홀짝을 판별할떄 어떻게 하는지 생각해보기
		//5. 결과 출력하기
		
		Scanner sc = new Scanner( System.in );
		System.out.print( "정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		String result = (num%2) == 0 ?  num + "는(은) 짝수입니다" : num + "는(은) 홀수입니다."; 
		System.out.println(result);
		
		
		
	}

}
