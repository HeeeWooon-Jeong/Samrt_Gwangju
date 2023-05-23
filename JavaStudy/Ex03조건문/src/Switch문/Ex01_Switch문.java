package Switch문;

import java.util.Scanner;

public class Ex01_Switch문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		System.out.print("점수 입력 : ");
		int to = sc.nextInt();
		
		char grade = ' ';
		
		for(int i=0; i<=2;i++)
		{
		switch (to/10) {
		case 10:
		case 9:
			grade = 'A' ;
			break;
		case 8:
			grade = 'B' ;
			break;
		case 7:
			grade = 'C' ; 
			break;
		default:
			grade = 'D' ;
			break;
		}
		System.out.println(grade+"학점이다.");
		}
		
		
		
		
		
	}

}
