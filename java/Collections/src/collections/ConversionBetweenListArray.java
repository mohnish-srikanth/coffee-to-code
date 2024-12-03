package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		
		// List<String> carsList = Arrays.asList(carsArray); // this will give the output of the Array even if the array is modified later in the code
		ArrayList<String> carsList = new ArrayList<String>();
		for(String carString : carsArray) { // for each loop to convert Array to List
			carsList.add(carString);
		}
		// Collections.addAll(carsList, carsArray); // this addAll function is used to add all elements of carsArray to carsList
		
		System.out.println("carsArray = " + Arrays.toString(carsArray));
		System.out.println("carsList = " + carsList);
		
	}

}
