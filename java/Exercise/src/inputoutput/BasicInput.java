package inputoutput;

import java.util.Scanner;

public class BasicInput {

	public static void main(String[] args) {
		
		Scanner inputNumber = new Scanner(System.in);
		System.out.println("Please enter a number: ");
//		int number = inputNumber.nextInt();
		System.out.println("You entered: " + inputNumber.nextInt());
		inputNumber.close();
		
//		Scanner inputText = new Scanner(System.in);
//		System.out.println("Enter your name: ");
//		String text = inputText.next();
//		System.out.println("Your name is " + text);
//		inputText.close();
	}

}
