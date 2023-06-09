package Ex0609;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03ArrayList예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// for(;;){} = 무한반복

		// 노래 이름(String)을 저장해둘 ArrayList 생성
		ArrayList<String> li = new ArrayList<String>();

		while (true) {
			System.out.print("[1]노래추가 [2]노래삭제 [3]노래조회 [4]종료 >> ");

			int in = sc.nextInt();

			
			
			if (in == 1) {
				// 노래 추가
				if (li.size() == 0) {
					System.out.println("=====현재 재생 목록=====");
					System.out.println("재생목록이 없습니다.");
					System.out.println("=====================");
				} else {
					for (int i = 0; i < li.size(); i++) {
						System.out.println(i + 1 + ". " + li.get(i));

					}
				}
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				int num = sc.nextInt();

				sc.nextLine();

				System.out.print("추가할 노래 입력 >> ");
				String addM = sc.nextLine();

				if (num == 1) {
					// 마지막 위치 추가

					li.add(addM);

				} else if (num == 2) {
					// 원하는 위치 추가
					System.out.print("추가할 위치 입력 >> ");
					int add2 = sc.nextInt();
					
					// 인덱스 범위를 초과하면 에러  ex 150번째 넣어줘 실행불가
					if( add2 < li.size() && add2 >= 0) {
					li.add(add2 - 1, addM);

				} else {
					continue;

				}

			} else if (in == 2) {
				// 노래 삭제
				
				
				if(li.size()==0) {
					System.out.println("=====현재 재생 목록=====");
					System.out.println("재생목록이 없습니다.");
					System.out.println("=====================");
					
				}else {
					System.out.println("=====현재 재생 목록=====");
					for (int i = 0; i < li.size(); i++) {
						
						System.out.println(i + 1 + ". " + li.get(i));
					}
					System.out.println("=====================");
							
				}
				
				
				
				
				
				
				
				
				
				System.out.print("삭제할 노래 번호 입력 >> ");
				int re = sc.nextInt();
				li.remove(re - 1);

			} else if (in == 3) {
				// 노래 조회

			} else if (in == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {

				System.out.println("잘못된 입력입니다.");
				continue;

			}

		}

	}

	}}
