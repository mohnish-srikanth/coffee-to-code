package loops;

public class ForLoop {

	public static void main(String[] args) {
		
		int i;
		for (i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		
		int sum = 0;
		for (int k = 0; k <= 5; k++) {
			sum += k;
		}
		System.out.println("sum of numbers = " + sum);
		
		System.out.println("-----------------");
		
		int sumEven = 0;
		for (int k = 0; k <= 10; k += 2) { // the increment is done by 2 as we need only even numbers here 
			sumEven += k;
		}
		System.out.println("sum of even numbers = " + sumEven);
	}

}
