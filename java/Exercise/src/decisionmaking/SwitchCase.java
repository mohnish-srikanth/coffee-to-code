package decisionmaking;

import java.util.Scanner;

public class SwitchCase {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner numberScanner = new Scanner(System.in);
		System.out.println("Please enter a day number of week: ");
		int dayNumber = numberScanner.nextInt();
		String day;
		switch (dayNumber) {
		case 1: {
			day = "monday";
			break;
		}
		case 2: {
			day = "tuesday";
			break;
		}
		case 3: {
			day = "wednesday";
			break;
		}
		case 4: {
			day = "thursday";
			break;
		}
		case 5: {
			day = "friday";
			break;
		}
		case 6: {
			day = "saturday";
			break;
		}
		case 7: {
			day = "sunday";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + dayNumber);
		}
		
		System.out.println("the day is " + day);
		numberScanner.close();
		
	}

}
