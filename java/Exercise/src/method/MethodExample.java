package method;

import java.util.Scanner;

public class MethodExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter 2 numbers: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int sum = add(x, y);
		int min = min(x, y);
		show(sum, min);
		scanner.close();
	}
	
	
	// returns the sum of 2 numbers
	public static int add(int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}
	
	// returns min of 2 numbers
	public static int min(int num1, int num2) {
		int min = 0;
		if (num1 > num2)
			min = num2;
		else
			min = num1;
		return min;
	}
	
	// shows the numbers
	public static void show(int sum, int min) {
		System.out.println("Sum = " + sum + " and min = " + min);
	}

}
