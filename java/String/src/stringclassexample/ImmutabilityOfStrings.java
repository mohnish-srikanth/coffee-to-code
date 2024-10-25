package stringclassexample;

import java.awt.datatransfer.StringSelection;

public class ImmutabilityOfStrings {

	public static void main(String[] args) {

		int age = 20;
		age++;
		System.out.println(age); // this shows us that integers are mutable/can be changed // output for this is 21
		
		String messageString = "Hello";
		messageString.concat(" World"); // however this can be assigned to a variable and that will be stored in the string pool in the memory heap
		System.out.println(messageString); // but this does not change the string as strings are immutable/cannot be changed
		
		String s = "android";
		String s2 = s.toUpperCase();
		System.out.println(s); // the uppercase will not work on this as strings cannot be changed no matter what
		System.out.println(s2); // this will print in upper case as this is a new variable
		
	}

}
