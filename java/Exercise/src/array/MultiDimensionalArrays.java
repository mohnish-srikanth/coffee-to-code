package array;

import java.util.Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		// 2d array
		int[][] twoDimArray = new int[3][3]; // 3 rows and 3 columns 
		twoDimArray[0][0] = 0;
		twoDimArray[0][1] = 1;
		twoDimArray[0][2] = 2;
		twoDimArray[1][0] = 3;
		twoDimArray[1][1] = 4;
		twoDimArray[1][2] = 5;
		twoDimArray[2][0] = 6;
		twoDimArray[2][1] = 7;
		twoDimArray[2][2] = 8;
		
		System.out.println(Arrays.toString(twoDimArray)); // [[I@5ca881b5, [I@24d46ca6, [I@4517d9a3]
		System.out.println(Arrays.toString(twoDimArray[0])); // elements of the first 1d array
		System.out.println(Arrays.toString(twoDimArray[1])); // elements of the second 1d array
		System.out.println(Arrays.toString(twoDimArray[2])); // elements of the third 1d array
		
		System.out.println("---------------------");
		
		int[][] ages = {
				{1, 2, 3},
				{5, 6, 7, 8},
				{9, 10}
		};
		System.out.println(Arrays.toString(ages));
		System.out.println(Arrays.toString(ages[0]));
		System.out.println(Arrays.toString(ages[1]));
		System.out.println(Arrays.toString(ages[2]));
		
		// 3d arrays
		
		System.out.println("---------------------");
		
		int[][][] threeDimArray = {
				{
					{1, 2, 3, 4},
					{5, 6, 7, 8}
				},
				{
					{9, 10, 11, 12},
					{13, 14, 15, 16}
				}
		};
		System.out.println(Arrays.toString(threeDimArray)); // [[[I@5305068a, [[I@1f32e575]
		System.out.println(Arrays.toString(threeDimArray[0])); // [[I@279f2327, [I@2ff4acd0] // first 2d array in the 3d array
		System.out.println(Arrays.toString(threeDimArray[1])); // [[I@54bedef2, [I@5caf905d] // second 2d array in the 3d array
		System.out.println(Arrays.toString(threeDimArray[0][0])); // [1, 2, 3, 4] // first 1d array in the first 2d array in the 3d array
		System.out.println(Arrays.toString(threeDimArray[0][1])); // [5, 6, 7, 8] // second 1d array in the first 2d array in the 3d array
		System.out.println(Arrays.toString(threeDimArray[1][0])); // [9, 10, 11, 12] // first 1d array in the second 2d array in the 3d array
		System.out.println(Arrays.toString(threeDimArray[1][1])); // [13, 14, 15, 16] // second 1d array in the second 2d array in the 3d array
		
	}

}
