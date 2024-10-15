package methodoverriding;

public class Car extends Vehicle{

	public void start() {
		System.out.println("the car has started");
	}
	
	public void accelerate(int speed) {
		System.out.println("the car accelerates according to the given speed " + speed);
	}
	
	public void stop() {
		System.out.println("the car has stopped");
	}
	
}
