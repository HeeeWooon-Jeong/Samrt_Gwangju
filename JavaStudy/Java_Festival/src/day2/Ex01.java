package day2;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("현재몸무게 : ");
        int nowW = sc.nextInt();

        System.out.print("목표몸무게 : ");
        int target = sc.nextInt();

        int week = 1;

        while (true) {
        System.out.print(week+"주차 감량 몸무게 : " );
        int lo = sc.nextInt();
        int w = nowW -= lo;
        week++;

        if(w <= target) {
            System.out.println(w+"kg 달성!! 축하합니다!!");
            break;
            }
        }
	}

}
