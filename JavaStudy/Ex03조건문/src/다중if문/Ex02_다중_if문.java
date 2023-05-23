package 다중if문;

import java.util.Scanner;

public class Ex02_다중_if문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		
		char grade = ' ';
		if (totalScore >= 90) {
			grade = 'A';
		} else if (totalScore >=80 && totalScore > 90) {
			grade = 'B';
		} else if (totalScore >=70 && totalScore > 80) {
			grade = 'c';
		} else {
			grade = 'D';
		}
		sc.close();
		System.out.println(grade + "학점입니다!");
		
		
		
		
		
	}

}
