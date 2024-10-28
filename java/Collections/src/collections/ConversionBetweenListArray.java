package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionBetweenListArray {

	public static void main(String[] args) {

		// list to array
		ArrayList<String> animalsList = new ArrayList<String>();
		animalsList.add("cat");
		animalsList.add("dog");
		animalsList.add("cow");
		animalsList.add("lion");
		
		/*
		// for loop
		String[] animalsArray = new String[animalsList.size()];
		for(int i = 0; i < animalsList.size(); i++) {
			animalsArray[i] = animalsList.get(i);
		}
		
		System.out.println("animalsList: " + animalsList);
		System.out.println("animalsArray: " + Arrays.toString(animalsArray));
		*/
		
		// Object[] animalsArray = animalsList.toArray(); // this converts list to array
		
		// String[] animalsArray = new String[animalsList.size()];
		String[] animalsArray = animalsList.toArray(new String[animalsList.size()]); // best way to convert list to array
		animalsList.add("ant"); // new element gets added to the list
		System.out.println("animalsList: " + animalsList);
		System.out.println("animalsArray: " + Arrays.toString(animalsArray));
		
		// array to list
		String[] carsArray = new String[] {"Ferrari", "BMW", "Ford"};
		
		List<String> carsList = Arrays.asList(carsArray);
		
		System.out.println("carsArray = " + Arrays.toString(carsArray));
		System.out.println("carsList = " + carsList);
		
	}

}
