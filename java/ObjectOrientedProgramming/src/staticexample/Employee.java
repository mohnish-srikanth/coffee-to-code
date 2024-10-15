package staticexample;

public class Employee {
	
	public static int currentSalary = 1000;
	
	public static void showSalary(int salary) {
		System.out.println("Your salary is: " + salary);
	}
	
	public static void increaseSalary(int raise) {
		System.out.println("You received a raise: " + raise);
		currentSalary += raise;
		showSalary(currentSalary);
	}
	
}
