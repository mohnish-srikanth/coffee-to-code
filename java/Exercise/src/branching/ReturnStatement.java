package branching;

public class ReturnStatement {

	public static void main(String[] args) {
		
		/*
		int k = 2;
		switch (k) {
		case 1: {
			System.out.println("1");
			break;
		}
		case 2: {
			System.out.println("2");
			return; // this exits the method
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + k);
		}
		System.out.println("Welcome!");
		*/
		
		boolean bool = true;
		System.out.println("Before the return");
		if (bool){
			return; // compiler ignored every statement after this
		}
		System.out.println("Will not be executed");
		
	}

}
