package nestedclasses;

import nestedclasses.Persons.StaticPerson;

public class StaticNestedClass {

	public static void main(String[] args) {
		
//		Persons.StaticPerson person = new Persons.StaticPerson(); // since show is not a static method, we have to create an object to access it
		StaticPerson person = new StaticPerson();
		person.show();
		
	}

}
