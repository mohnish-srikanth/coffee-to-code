package interfaceclass;

public class Bird implements CanFeed, CanFly {

	@Override
	public void canFly() {
		System.out.println("birds can fly");
	}

	@Override
	public void canEat() {
		System.out.println("birds can eat bird feed");
	}

	@Override
	public void canDrink() {
		System.out.println("bird can drink water");
	}

	
	
}
