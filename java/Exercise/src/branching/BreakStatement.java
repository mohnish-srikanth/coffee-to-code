package branching;

public class BreakStatement {

	public static void main(String[] args) {
		
		/*
		int a = 0;
		switch (a) {
			case 0: {
				System.out.println("Hi!"); 
				break; // this is needed for each case as otherwise the code will run all the cases
			}
			case 1:{
				System.out.println("Hello!");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + a);
		*/
		for (int i = 0; i < 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println(i);
		}
		
	}

}
