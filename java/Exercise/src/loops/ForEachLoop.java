package loops;

public class ForEachLoop {

	public static void main(String[] args) {
		
		System.out.println("for loop");
		
		char[] letters = {'h', 'e', 'l', 'l', 'o'};
		for (int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}
		
		System.out.println("----------------");
		System.out.println("for each loop");
		
		char[] letters2 = {'h', 'e', 'l', 'l', 'o'};
		for (char alphabet : letters2) { // alphabet loops for every element in the array 
			System.out.println(alphabet);
		}
		
		System.out.println("----------------");
		
		int[] numbers = {6, 4, 3, 5};
		int sum = 0;
		
		for (int num : numbers) {
			sum += num;
			System.out.println(sum);
		}
		System.out.println("final sum = " + sum);
		
	}

}
