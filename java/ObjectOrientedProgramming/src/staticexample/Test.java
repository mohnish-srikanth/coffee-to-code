package staticexample;

import static staticexample.Employee.showSalary;
import static staticexample.Employee.increaseSalary;
import static java.lang.Math.*;

public class Test {

	public static void main(String[] args) {
		/* STATIC KEYWORD
		Car.speedUp(60);
		Car.speedUp(160);
		Car.speedDown(50);
		Car.stop();
		
		Car obj = new Car();
		obj.speedUp(50); // The static method speedUp(int) from the type Car should be accessed in a static way
		*/
		
		// STATIC IMPORT
		showSalary(Employee.currentSalary);
		increaseSalary(500);
		
		// math class
		System.out.println(min(20, 30)); // since this method is statically imported we dont need Math.min
		System.out.println(pow(10, 2)); // since this method is statically imported we dont need Math.pow
	}

}
