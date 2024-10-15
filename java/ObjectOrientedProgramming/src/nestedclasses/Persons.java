package nestedclasses;

public class Persons {
	
	static String person1 = "John";
	private static String person2 = "David";
	public String person3 = "Andy";
	
	// static nested class
	static class StaticPerson{
		
		void show() {
			// System.out.println("Person1 = " + person1);
			System.out.println("Person2 = " + person2);
			// System.out.println("Person3 = " + person3); // this will be error though person3 is public
			// this is because nested classes cannot access non static variables of the outer class
		}
		
	}
	
}
