package branching;

public class ContinueStatement {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if (i % 2 == 0){
				continue; // this keyword is used to skip the current iteration of the loop
			}
			System.out.println(i);
		}
		
	}

}
