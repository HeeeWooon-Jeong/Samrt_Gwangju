package animal;

public class Main {

	public static void main(String[] args) {
		Animal ani1 = new Animal();
		Mammalia animal2 = new Mammalia();
		Whale whale = new Whale();
		Snake snake= new Snake();
		
		ani1.show();
		
		animal2.show();
		
		
		
		System.out.println(snake.bite("벌레"));
		
		
		
		
	}

}
