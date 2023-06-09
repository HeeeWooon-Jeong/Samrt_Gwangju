package pokemon;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 실행하는 공간
		
		// 1. 포켓몬 2마리 생성
		// 피카츄 , 공격력 : 15 , hp : 350 
		// 스킬 : 백만볼트 , 타입 : 전기  
		
		Pokemon pika = new Pokemon( "피카츄", "전기", "전광석화", 350, 15 );
		
		
		
		
		
		
		// 파이리 , 공격력 : 30 , hp : 400
		// 스킬 : 화염방사, 타입 : 불
		
		Pokemon pairi = new Pokemon( "파이리", "불", "지옥불꽃", 400, 30 );
		
		
		System.out.println("=== 포켓몬을 선택하세요 ===");
		System.out.println("[1] 피카츄 \n[2] 파이리");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			// 피카츄를 선택
			// 피카츄가 파이리를 공격
			// 1) 일반공격, 스킬공격 선택
			System.out.println("=== 야생의 " + pairi.getName() +"가 나타났다");
			
			while(pairi.getHp()>0) {
				System.out.println("효과는 미미했다");
			System.out.println("[1] 일반공격 [2] 스킬공격 >> ");
			int choiceAtk = sc.nextInt();
			if(choiceAtk == 1) {
				// 일반공격 , 파이리의 hp를 피카츄의 공격력만큼 감소
				// 파이리의 현재 hp = 파이리 hp - 피카츄 atk
				// 두마리 포켓몬의 hp 출력
				
				
				System.err.println("피카츄의 일반공격! "+ pika.getAtk()+" damage");
				pairi.setHp(pairi.getHp()-pika.getAtk());
				
				
			}else {
				// 피카츄 공격력 1.5배
				// 피카츄의 스킬 출력
				System.out.println("피카츄의 "+pika.getSkill()+" !");
				pairi.setHp((int)(pairi.getHp()-pika.getAtk()*1.5));
			}
			
			System.out.println("파이리 HP = "+(pairi.getHp()-pika.getAtk()));
			System.out.println("피카츄의 HP = "+ pika.getHp());
			System.out.println();
			}
			System.out.println("피카츄 승!");
			
		}else if(choice == 2) {
			// 파이리 선택
			// 파이리가 피카츄를 공격
			// 
			System.out.println("=== 야생의 " +pika.getName()+"가 나타났다");
			while(pika.getHp() > 0) {
			System.out.println("효과는 미미했다");
				
			System.out.println("[1] 일반공격 [2] 스킬공격 >> ");
			int choiceAtk = sc.nextInt();
			if(choiceAtk == 1) {
				// 일반공격
				// 피카츄의 hp - 파이리의 atk
				// 두 포켓몬의 hp 출력
				System.out.println("파이리의 일반공격 ! "+ pairi.getAtk()+" damage");
				pika.setHp(pika.getHp()-pairi.getAtk());
				
				
			}else {
				// 스킬공격
				// 피카츄의 hp가 파이리의 atk 1.5배 만큼 감소
				// 파이리의 스킬 출력
				// 두포켓몬의 hp 출력
				System.out.println("파이리의 "+ pairi.getSkill()+"! damage");
				pika.setHp((int)(pika.getHp()-(pairi.getAtk()*1.5)));
				
			}
			System.out.println("피카츄 HP = "+(pika.getHp()-pairi.getAtk()));
			System.out.println("파이리의 HP = "+pairi.getHp());
			System.out.println();
			
			}
			System.out.println("파이리 승!");
		}else {
			System.out.println("잘못된 숫자를 입력하였습니다.");
		}
		
		// 4. 둘중 한마리의 포켓몬의 hp 가 0일때 프로그램 종료
		
		
		// 5. 승자가 누구인지 출력!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
