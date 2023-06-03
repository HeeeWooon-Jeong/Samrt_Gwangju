package festival;

import java.util.Scanner;

public class E13 {

	public static void main(String[] args) {

//		String score = "A,A,B,C,D,A,C,D,D,D,F";
//		String[] strArr = score.split(",");
//
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int d = 0;
//		int f = 0;
//
//		for (int i = 0; i < strArr.length; i++) {
//			if (strArr[i].equals("A")) {
//				a++;
//			} else if (strArr[i].equals("B")) {
//				b++;
//			}else if (strArr[i].equals("C")) {
//				c++;
//			}else if (strArr[i].equals("D")) {
//				d++;
//			}else if (strArr[i].equals("F")) {
//				f++;
//			}
//		}
//		
//			System.out.println("A : "+ a+"명" );
//			System.out.println("B : "+ b+"명" );
//			System.out.println("C : "+ c+"명" );
//			System.out.println("D : "+ d+"명" );
//			System.out.println("F : "+ f+"명" );
//			
//		

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] strArr = score.split(",");

		int[] count = new int[5]; // 인덱스 0부터 A부터 F까지 학점 개수를 저장하는 배열

		for (String grade : strArr) {
			switch (grade) {
			case "A":
				count[0]++;
				break;
			case "B":
				count[1]++;
				break;
			case "C":
				count[2]++;
				break;
			case "D":
				count[3]++;
				break;
			case "F":
				count[4]++;
				break;
			}
		}

		String[] grades = { "A", "B", "C", "D", "F" };
		for (int i = 0; i < count.length; i++) {
			System.out.println(grades[i] + " : " + count[i] + "명");
		}

	}

}
