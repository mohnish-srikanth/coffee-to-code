package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		
		double num = 7.6;
		boolean isCheck = true;
		
		System.out.println("+num = " + +num);
		System.out.println("-num = " + -num);
		System.out.println("++num = " + ++num);
		System.out.println("--num = " + --num);
		System.out.println("!isCheck = " + !isCheck);
		
		System.out.println("---------------");
		
		double result = 4.7;
		System.out.println(result++); // result will be increase only after this is run, so this print will just return the number
		System.out.println(result);
		System.out.println(++result); // however here it will print the incremented number
		System.out.println(result);
		
	}

}
