package methodoverriding;

public class OverrideTest {

	public static void main(String[] args) {
		
		// creating vehicle object
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		vehicle.accelerate(80);
		vehicle.stop();
		
		// creating car object
		Car car = new Car();
		car.start();
		car.accelerate(100);
		car.stop();
		// here it will still print with regards to the vehicle before overriding
		// after overriding it will print with regards to car
		
	}
	
}
