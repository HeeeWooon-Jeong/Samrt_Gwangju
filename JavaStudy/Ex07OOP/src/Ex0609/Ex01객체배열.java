package Ex0609;

import pokemon.Pokemon;

public class Ex01객체배열 {

	public static void main(String[] args) {
		
		// 배열 : 같은 데이터 타입을 하나로 묶어서 저장하는 자료구조
		
		Pokemon[] pokes = new Pokemon[10];
		
		
		
		// 2번칸에 피카츄 집어넣기
		Pokemon pika = new Pokemon( "피카츄", "전기", "전광석화", 350, 15 );
		
		pokes[2] = pika;

		// 익명으로 선언한 방법
		pokes[2] = new Pokemon( "피카츄", "전기", "전광석화", 350, 15 );		
	

		System.out.println(pokes[2].getName());
		
		
		
	
	
	}

}
