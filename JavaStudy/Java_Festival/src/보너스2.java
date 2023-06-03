package festival;

import java.util.Scanner;

public class 보너스2 {

	public static void getMiddle(String a) {
		int var = 0;
		int var2 = 0;
		String[] s = a.split("");
		if (s.length % 2 == 0) {
			var = s.length / 2 - 1;
			var2 = s.length / 2;
			System.out.print(s[var] + s[var2]);
		} else {
			var = s.length / 2;
			System.out.println(s[var]);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		getMiddle(str);
	}

}