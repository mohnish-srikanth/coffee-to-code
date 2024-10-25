package interfaceclass;

public class InterfaceTest {

	public static void main(String[] args) {

		Bird bird = new Bird();
		bird.canEat();
		bird.canDrink();
		bird.canFly();
		
		People person = new People();
		person.canEat();
		person.canDrink();
	}

}
