package methodoverriding;

public class Vehicle {

	public void start() {
		System.out.println("the vehicle has started");
	}
	
	public void accelerate(int speed) {
		System.out.println("the vehicle accelerates according to the given speed " + speed);
	}
	
	public void stop() {
		System.out.println("the vehicle has stopped");
	}
	
}
