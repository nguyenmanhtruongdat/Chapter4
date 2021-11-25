package chapter4;
import java.util.Arrays;
public class ex11 {

	public static void main(String[] args) {
		
		int[] array1= {1, 3, 5, 7, 9};
	
		int[] array2= new int[5];
		
		array2[0]=array1[0];
		array2[1]=array1[1];
		array2[2]=array1[2];
		array2[3]=array1[3];
		array2[4]=array1[4];

		System.out.println("Array1: " +Arrays.toString(array1));
		System.out.println("Array2 created: " +Arrays.toString(array2));
		
	}

}
