package day5;

import java.util.Scanner;

public class F5_06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// String 값 스캐너로 입력
		String subInput = sc.next();
		// String oooxoo 형태를 배열로 변환
		// 스트링변수.toCharArray
		// 한글자의 문자열이아닌 char 형태로 저장
		char[] in = subInput.toCharArray();

		// 합산할 변수 sum 설정
		int sum = 0;
		// +1씩 될 변수
		int j = 1;

		// char[] 배열의 길이만큼 반복
		for (int i = 0; i < in.length; i++) {
			// 배열이 'o' 이면 +1 한후 1++
			if (in[i] == 'o') {
				sum += j++;
				// 'x' 일경우 더할값 1로 초기화
			} else {
				j = 1;
			}
		}
		System.out.println(sum);
	}

}