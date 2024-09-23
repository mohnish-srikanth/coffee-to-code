package array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] numberArray = new int[5]; // array can hold 5 elements // here declartation, instantiation and initalization is done in the same line
		
		numberArray[0] = 5;
		numberArray[1] = -4;
		numberArray[2] = 7;
		numberArray[3] = 2;
		numberArray[4] = -3;
		
		int result = numberArray[0] + numberArray[1] + numberArray[2] + numberArray[3] + numberArray[4];
		
		System.out.println(result);
		System.out.println(Arrays.toString(numberArray));
		System.out.println(numberArray.length);
		
		System.out.println("------------------");
		
		int[] numberArray2 = {5, -4, 7, -3, 2};
		System.out.println(Arrays.toString(numberArray2));
		numberArray2[3] = 8;
		System.out.println(Arrays.toString(numberArray2));
		
		System.out.println("------------------");
		
		int ages[] = new int[] {15, (int) 16.5, 17}; // need to type cast 16.5 here as it is a float
		System.out.println(Arrays.toString(ages));
		
		System.out.println("------------------");
		
		Object[] mixedArrayObjects = {3, 7.5, "test string", 's', true}; // object class is used to create an array of multiple datatypes
		System.out.println(Arrays.toString(mixedArrayObjects));
		
	}

}
