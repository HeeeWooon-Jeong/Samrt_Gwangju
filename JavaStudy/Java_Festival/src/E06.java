package festival;

import java.util.Scanner;

public class E06 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int sum=0;
		
			for (int j = 1; j < 78; j++) {
				sum+= (78-j)*j;
			}
		
		System.out.println(sum);
	}

}
