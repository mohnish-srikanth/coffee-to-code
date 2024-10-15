package packagetest;

import java.util.Scanner;

import packageoperation.Sum;

public class mainTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x = in.nextInt();
		System.out.println("Enter the second number: ");
		int y = in.nextInt();
		
		Sum sum = new Sum();
		System.out.println(x + " + " + y + " = " + sum.sumNumber(x, y)); // here the sum class and its method is imported from packageoperation
		
	}

}
