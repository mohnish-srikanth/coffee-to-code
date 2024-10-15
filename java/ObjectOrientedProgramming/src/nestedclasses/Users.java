package nestedclasses;

public class Users {
	
	static String person1 = "John";
	private static String person2 = "David";
	public String person3 = "Andy";
	
	// Inner class (non-static nested class)
	class InnerUser{
		
		void show() {
			System.out.println("Person1 = " + person1);
			System.out.println("Person2 = " + person2);
			System.out.println("Person3 = " + person3); // this can be accessed here as non static nested class can access non static variables from the outer variables
		}
		
	}
	
}
