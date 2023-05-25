package 이중for문;

public class Ex04별찍기 {

	public static void main(String[] args) {

//		
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.println();
//		
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();		

		for (int j = 1; j < 6; j++) {
			for (int i = 0; i < 5-j; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
/////////////////////////////////////////////////			
//		for(int i =0; i < 3; i++) {
//			System.out.print(" ");
//		}
//			for(int i= 0; i < 2; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
////////////////////////////////////////////////

	}

}
