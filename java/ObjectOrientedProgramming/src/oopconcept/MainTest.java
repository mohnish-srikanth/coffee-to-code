package oopconcept;

public class MainTest {

	public static void main(String[] args) {
		
		Person person = new Person("moni", 75); // this calls the 2 parameter person constructor
		
		System.out.println(person); // oopconcept.Person@24d46ca6 // this prints an ID to the console
		
		person.wakeUp();
		person.showWeight();
		person.eat();
		person.showWeight();
		person.doExercise();
		person.showWeight();
		
		Person person2 = new Person("john", 65, 21, 20000); // this calls the 4 parameter person constructor
		
		System.out.println(person2); // Name: john Age: 21 Weight: 65.0 Salary: $20000 // this prints the output properly as java automatically calls the toString method when it is defined
	}

}
