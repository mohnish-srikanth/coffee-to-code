package loops;

import java.util.Iterator;

public class LabeledLoops {

	public static void main(String[] args) {
		
		/*
		String[] animals = {"cat", "dog", "lion", "cow", "rabbit"};
		int index = 0;
		String animal = null;
		
		animalsLoop:
		while(index < animals.length) {
			animal = animals[index];
			
			if (animal == "cow") {
					System.out.println(animal);
					break animalsLoop;
			}
			
			index++;
		}
		*/
		
		outerLoop:
		for(int i = 1; i <= 3; i++) {
			innerLoop:
			for(int j = 1; j <= 3; j++) {
				System.out.println("Outer loop: " + i + ", Inner loop: " + j);
				if(i == 2 && j == 2) {
					break outerLoop; // if this is not mentioned only the inner loop will be terminated
				}
			}
		}
		
	}

}
