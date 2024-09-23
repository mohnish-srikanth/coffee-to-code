package decisionmaking;

import java.util.Scanner;

public class IfLaddedNestedIf {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int number1, number2, number3, largestNumber;
		number1 = number.nextInt();
		number2 = number.nextInt();
		number3 = number.nextInt();
		
		if (number1 >= number2) {
			if (number1 >= number3) {
				largestNumber = number1;
			} else {
				largestNumber = number3;
			}
		} else {
			if (number2 >= number3) {
				largestNumber = number2;
			} else {
				largestNumber = number3;
			}
		}
		
		System.out.println("Largest number: " + largestNumber);
		number.close();
		
		/*
		Scanner inputAge = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = inputAge.nextInt();
		
		if(age < 13) {
			System.out.println("You are a child");
		} else if (age < 19) {
			System.out.println("You are a teenager");
		} else {
			if(age < 65) {
				System.out.println("You are an adult");
			} else {
				System.out.println("You are a senior");
			}
		}
		*/
	}

}
