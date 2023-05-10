import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
//1번
		//		Scanner scan = new Scanner(System.in);
		//		int x = scan.nextInt();
		//		
		//		System.out.println("정수 입력 >> " + x);
		//		System.out.println("입력받은 정수는 " + x + " 입니다 .");
//2번		
		//		System.out.println("변수 num1의 값은 16");
		//		int num1 = 16;;
		//		System.out.println("변수 num2의 값은 10");
		//		int num2 = 10;;
		//		System.out.println("합계 : " + (num1+num2));
		//		System.out.println("평균 : " + ((num1 + num2) / 2));
//3번
//		Scanner scan = new Scanner(System.in);
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		System.out.println("첫번째 정수 입력 >> " + num1);
//		System.out.println("두번째 정수 입력 >> " + num2);
//		System.out.println("합계 : " + (num1+num2));
//		System.out.println("평균 : " + ((num1 + num2) / 2));
//4번
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int number = scan.nextInt();
		System.out.println((number%2)==0? number + "는(은) 짝수입니다.":  number + "는(은) 홀수입니다.");
		

	}

}