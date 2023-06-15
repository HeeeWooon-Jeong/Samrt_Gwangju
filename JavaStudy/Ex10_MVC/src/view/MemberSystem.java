package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class MemberSystem {
	// Controller + view

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		MemberDAO dao=new MemberDAO();
		MemberDTO rdto = null;
		MemberDTO mdto = new MemberDTO();
		// 각각 흩어져 있는 기능들을 통합적으로 합치기!

		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]정보수정 [4]회원탈퇴 [5]종료 [6]전체 회원 조회>> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				// 회원가입 기능 -> insert
				System.out.print("아이디 >> ");
				String id = sc.next();
				System.out.print("비밀번호 >> ");
				String pw = sc.next();
				System.out.print("나이 >> ");
				int age = sc.nextInt();
				
				
				MemberDTO dto = new MemberDTO(id,pw,age); 
				
				
				// DAO 객체 생성
				
				int r = dao.insert(dto);
				
				if(r > 0) {
					System.out.println("회원가입 성공!");
				}
				else {
					System.out.println("회원가입 실패!");
				}
			} else if (choice == 2) {
				// 로그인 기능 -> select
				System.out.print("ID를 입력해 주세여");
				String id = sc.next();
				System.out.print("PW를 입력해 주세여");
				String pw = sc.next();
				
				
				mdto.setId(id);
				mdto.setPw(pw);
				
				rdto = mdao.select(mdto);
				
				MemberDTO rdto = dao.select(id, pw);
				
				if(rdto != null) {
					System.out.println(id+"님 환영합니다.");
				}
				else {
					System.out.println("아이디나 비밀번호가 잘못되었습니다.");
				}
				
			} else if (choice == 3) {
				// 정보수정 기능 -> update
				System.out.print("[1]비밀번호 수정 [2]나이 수정 >> ");
				int select = sc.nextInt();
				System.out.print("ID를 입력해주세요.");
				String id = sc.next();
				
				dao.update(id, select);
				
				if(dao.result > 0) {
					System.out.println("변경되었습니다.");
				}
				else {
					System.out.println("변경되지 않았습니다.");
				}
				
				
				
			} else if (choice == 4) {
				// 회원탈퇴 기능 -> delete
				System.out.print("삭제할 ID를 적어주세요 >> ");
				String id = sc.next();
				System.out.print("삭제할 PW를 적어주세요 >> ");
				String pw = sc.next();
				
				MemberDTO dto = new MemberDTO();
				
			
				
				if(dao.delete()>0) {
					System.out.println("삭제되었습니다.");
				}
				else {
					System.out.println("삭제되지 않았습니다.");
				}
			} else if (choice == 5) {
				System.out.println("감사합니다. 종료되었습니다.");
				break;
			} else if (choice == 6){
				// 회원 전체 출력
				
				// 1) SQL문 생각해보기   -- sql문을 먼저 생각해보면 어떻게 만들지 편하다
				// SELECT * FROM MEMBER
				
								
				// 2) DAO 에서 메서드 정의 
				//  --> SQL문을 실행만 하고 결과 반환만 한다
				
				ArrayList<MemberDTO>=dao.selectAll();
				
				
				
				
				// 3) 받아온 회원 목록 데이터를 출력
				System.out.println("아이디\t비밀번호\t나이");
//				for(int i = o; i < list.size() ,i++ ) {
//					
//				System.out.print(list.get(i).getId()+"\t");
//				System.out.print(list.get(i).getPw()+"\t");
//				System.out.println(list.get(i).getAge()+"\t");
//				
//				}
				
				// for-each 문 (배열과 함께 쓰는 for문)
				// : 배열 안에 있는 요소를 하나씩 뽑아서 
				// 왼쪽에 있는 공간(변수) 에 담아준다
				// 배열의 크기만큼 반복하는 구조
				
				// 오른쪽에 반복시킬 배열
				// 왼쪽에 데이터 타입
				
				for( MemberDTO m: list ) { 
				System.out.println(m.getId()+"\t");
				System.out.print(m.getPw()+"\t");
				System.out.print(m.getAge()+"\t");
				}
				
				
				
				
				
				
				
				
				
				
				// list.get(0) 을 출력하면 주소값이 나온다
				// list.get(0) = memberDTO()
				
				
				
				// 아이디 비밀번호 나이 
				// ===================
				// 
				
				//select * from member
				
				
				
				
				
				
			}
			else {
			
				System.out.println("잘못된 선택입니다...!");
			}
			
			}
		} // while끝

	// ----------------------------------------------------------------------------------------

}