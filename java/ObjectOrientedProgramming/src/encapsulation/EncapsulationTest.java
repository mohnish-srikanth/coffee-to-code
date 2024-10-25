package encapsulation;

public class EncapsulationTest {

	public static void main(String[] args) {

		// creating car object
		Car car = new Car("Ferrari", 320, true);
		System.out.println("model: " + car.getModel());
		System.out.println("Max speed: " + car.getMaxSpeed());
		System.out.println("is automatic: " + car.isAutomatic());
		
	}

}
