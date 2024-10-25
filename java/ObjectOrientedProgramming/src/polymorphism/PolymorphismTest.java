package polymorphism;

public class PolymorphismTest {

	public static void main(String[] args) {

		Vehicle vehicle  = new Car(); // this works because Car is a subclass of vehicle 
		Vehicle vehicle1 = new MotorCycle(); // this works because motorcycle is a subclass of vehicle 
		
		vehicle.accelerate();
		vehicle1.accelerate();
		
	}

}
