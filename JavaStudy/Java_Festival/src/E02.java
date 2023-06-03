package festival;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int wt = sc.nextInt();
		int pay = (wt>8) ? 8*5000+((wt-8)*(int)(5000*1.5)) : wt*8;  
	
		System.out.print("총 임금은 "+pay+"원 입니다.");
		
		
		
		
	}

}



// 파이썬
//for i in range(1, 101):
//    if i % 2 == 1:
//        c += i
//        print(i, end=" ")
//    else:
//        c -= i
//        print(-i, end=" ")
//
//print("\n결과:", c)