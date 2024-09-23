package array;

import java.util.Arrays;

public class SearchingArray {

	public static void main(String[] args) {
		
		int[] numbers= {0, 2, 4, 6, 8, 10};
		int indexofEight = Arrays.binarySearch(numbers, 8);
		System.out.println("Index of 8 in the array is " + indexofEight); // 4
		
		int indexofSeven = Arrays.binarySearch(numbers, 7);
		System.out.println("Index of 7 in the array is " + indexofSeven); // -5
		
		String[] animals = {"cat", "cow", "dog", "elephant", "lion", "monkey"};
		Arrays.sort(animals);
		int indexofDog = Arrays.binarySearch(animals, "dog");
		System.out.println("Index of dog in the animals array is " + indexofDog); // 2
		
	}

}
