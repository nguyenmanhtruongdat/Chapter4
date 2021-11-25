package chapter4;

import java.util.Arrays;

public class ex9 {

	public static void main(String[] args) {
		
		int[] array1 = {2, 3, 4, -5};
		int[] array2 = {1, 2, -5, 3};
		
		System.out.println("Array1: " + Arrays.toString(array1));
		System.out.println("Array2: " +Arrays.toString(array2));
		System.out.print("Result: ");
		
		System.out.print(array1[0]*array2[0]);
		System.out.print("  ");
		System.out.print(array1[1]*array2[1]);
		System.out.print("  ");
		System.out.print(array1[2]*array2[2]);
		System.out.print("  ");
		System.out.print(array1[3]*array2[3]);
	}

}
