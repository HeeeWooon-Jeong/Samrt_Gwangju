package festival;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int a = sc.nextInt();

		System.out.print("목표몸무게 : ");
		int b = sc.nextInt();

		int cnt = 1;
		while (a > b) {
			System.out.print(cnt + "주차 감량 몸무게 : ");
			int sub = sc.nextInt();
			a -= sub;
		}
		System.out.println(a+"kg 달성!! 축하합니다!");
	}
}