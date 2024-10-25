package interfaceclass;

public class People implements CanFeed {

	@Override
	public void canEat() {
		System.out.println("people can eat food");
	}

	@Override
	public void canDrink() {
		System.out.println("people can drink juice");
	}

	
	
}
