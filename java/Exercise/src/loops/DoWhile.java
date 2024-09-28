package loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		/*
		int a = 5;
		
		do {
			System.out.println(a);
			a--;
		} while (a > 5); // here the value will get printed at least once // if the condition was a > 0 then 5 to 1 will be printed
		System.out.println("last value of a = " + a); // 4
		*/
		
		/*
		int age = 15;
		do {
			age--;
			while(age > 20) {
				age++;
			}
		} while (age < 15);
		System.out.println("age = " + age); // this code is an infinite loop and code will never reach here
		*/
		
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		char continueToCalc;
		
		do {
			System.out.println("Enter a number: ");
			int number = scanner.nextInt();
			result += number;
			System.out.println("Do you want to continue? (Y/N): ");
			continueToCalc = scanner.next().charAt(0);
		} while (continueToCalc == 'Y' || continueToCalc == 'y');
		
		System.out.println("The sum of all the numbers entered is " + result);
		scanner.close();
		
	}

}
