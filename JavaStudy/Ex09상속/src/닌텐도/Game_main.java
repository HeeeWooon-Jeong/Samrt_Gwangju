package 닌텐도;

public class Game_main {

	public static void main(String[] args) {
		
		
		
		// 게임 칩과 게임기를 연결할 수 있는 메소드 생성!
		// -> insert() 
		
		// 포켓몬고 게임 칩 생성!
		Pokemon poke = new Pokemon();
		insert(poke);
		
		// 게임을 진행할 수 있는 insert()에 생성된 게임 칩 연결!
		Mario ma = new Mario();
		insert(ma);
		
		Animal ani = new Animal();
		insert(ani);
		
	}
	
	
	// insert() 하나만 만들어 놓고
	// 다양한 타입의 게임칩이 들어오도록 수정!
	
	public static void insert(Game game) {
		
		game.start();
		
	}
//	public static void insert(Mario mari) {
//		
//		mari.start();
//		
//	}
//	public static void insert(Animal ani) {
//		
//		ani.start();
//		
//	}

}
