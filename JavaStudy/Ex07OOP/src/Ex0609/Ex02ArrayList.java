package Ex0609;

import java.util.ArrayList;

import pokemon.Pokemon;

public class Ex02ArrayList {

	

	public static void main(String[] args) {
		
		// 제네릭을 사용하는 클래스
		
		Car<String, Integer> c = new Car<String, Integer>();
		
		// ArrayList 클래스
		// 가변 배열
		// 레퍼런스 변수들만 가질 수 있다.
		
		// 1. 비어있는 ArrayList 생성
		//	  ArrayList<배열 안에 담고싶은 자료형>
		
		ArrayList<String> list =  new ArrayList<String>();
		
		// 2. 데이터 넣기
		//    .add( 데이터 );
		//    제네릭에 써준 자료형에 맞게끔 넣어주어야 한다.
		
		list.add("안현진");		
		list.add("정희운");		
		list.add("김래정");		
		
		
		
		// 3. 데이터 꺼내기
		// .get( index );
		
		String name = list.get(2);
		// list.length ---- 불가
		
		
		
		// 4. 배열의 길이
		// 변수.size()
		int length = list.size();
		
		// ex 반복문으로 ArrayList 내용물 출력
		
		for (int i = 0; i < length; i++) {
			System.out.println(list.get(i));
		}
		
		
		
		// 5. 배열 안의 요소를 삭제
		// arr = [ 1, 2, 3, 4, 5]
		
		list.remove(0);
		
		
		
		
		System.out.println("========================");
		
		// 1. 포켓몬 데이터를 저장할 수 있는 ArrayList 선언
		
		ArrayList<Pokemon> pl = new ArrayList<Pokemon>();
		
		
		Pokemon pika = new Pokemon( "피카츄", "전기", "전광석화", 350, 15 );
		Pokemon pairi = new Pokemon( "파이리", "불", "바보", 350, 15 );
		Pokemon ggobu = new Pokemon( "꼬북이", "물대포", "멍청이", 350, 15 );
		
		// 2. 포켓몬 데이터를 3개 넣기
	
		
		pl.add(pika);
		pl.add(pairi);
		
		
		// 넣어주고 싶은 인덱스에 데이터를 넣을 수 있음 
		pl.add(2, ggobu);
		
		// 익명으로 객체 생성후 바로 대입 가능
		
		// pl.add(new Pokemon( "피카츄", "전기", "전광석화", 350, 15 ))
		
		
		
		
		
		
		
		// 3. 각 포켓몬 정보 출력
		
		for (int i = 0; i < pl.size(); i++) {
			
			//이름과 스킬
			
			
			Pokemon p = pl.get(i);
			
			String pname = p.getName();
			String pskill = p.getSkill();
			
			System.out.println("이름 "+ pname +"  스킬 "+ pskill );
		
		}
		
		
		
	}

}
