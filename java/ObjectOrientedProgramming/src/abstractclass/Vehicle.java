package abstractclass;

public abstract class Vehicle {

	String type, model;
	
	// constructor
	public Vehicle(String type, String model) {
		this.type = type;
		this.model = model;
	}
	
	// non abstract void methods
	public void start() {
		System.out.println("vehicle has started");
	}
	
	public void stop() {
		System.out.println("vehicle has stopped");
	}
	
	// abstract method
	public abstract int getMaxSpeed();
	
}
