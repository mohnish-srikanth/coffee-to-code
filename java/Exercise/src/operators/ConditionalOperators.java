package operators;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int num1 = 5, num2 = 8, num3 = 12;
		boolean result;
		
		//conditional and
		result = (num1 > num2) && (num2 > num3);
		System.out.println("result = " + result);
		
		//conditional or
		result = (num1 > num2) || (num3 > num2);
		System.out.println("result = " + result);
		
		//ternary operator
		result = num1 < num2 ? true : false; // if num1 < num2 then true else false
		System.out.println("result = " + result);
		
		
	}

}
