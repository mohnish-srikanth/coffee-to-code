package nestedclasses;

import java.util.Scanner;

public class LocalInnerClassExample {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = scanner.nextInt();
		checkNumber(input);
		scanner.close();
		
	}
	
	public static void checkNumber(int enteredNumber) {
		
		int result = 0;
		
		// local inner class
		class NumberChecker{
			
			boolean check;
			
			// constructor
			public NumberChecker(int number) {
				check = number % 2 == result ? true : false;
			}
			
			// method
			public void printNumber() {
				System.out.println("You entered: " + enteredNumber);
			}
			
		}
		
		NumberChecker checker = new NumberChecker(enteredNumber);
		checker.printNumber();
		
		if (checker.check) {
			System.out.println(enteredNumber + " is even");
		} else {
			System.out.println(enteredNumber + " is odd");
		}
		
	}
	
}
