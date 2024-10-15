package abstractclass;

public class Car extends Vehicle{

	public Car(String type, String model) {
		super(type, model);
	}

	@Override // override annotation is included while overriding a method of the super class
	public int getMaxSpeed() {
		final int MAX_CAR_SPEED = 320; // upper case with underscores is used for final variable names
		System.out.println("max speed of car is " + MAX_CAR_SPEED);
		return MAX_CAR_SPEED;
	}
	
	@Override
	public void start() {
		System.out.println("car has started");
	}
	
	@Override
	public void stop() {
		System.out.println("car has stopped");
	}

}
