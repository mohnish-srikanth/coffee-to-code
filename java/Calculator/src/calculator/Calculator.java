package calculator;

import java.lang.classfile.constantpool.DoubleEntry;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Calculator");
		System.out.println("Please enter 2 numbers");
		int number1, number2;
		number1 = inputScanner.nextInt();
		number2 = inputScanner.nextInt();
		System.out.println("Choose an operation: ");
		char operation = inputScanner.next().charAt(0); // used for taking a char input
		double result = 0.0;
		
		switch (operation) {
		case '+': {
			result = number1 + number2;
			break;
		}
		case '-': {
			result = number1 - number2;
			break;
		}
		case '*': {
			result = number1 * number2;
			break;
		}
		case '/': {
			result = number1 / number2;
			break;
		}
		case '%': {
			result = number1 % number2;
			break;	// this is used to exit a switch case statement
		}
		default:
			System.out.println("invalid operation");
			return;  // this is added to exit the current method
		}
		
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println("operation = " + operation);
		System.out.println("result = " + result);
		
		inputScanner.close();
	}

}
