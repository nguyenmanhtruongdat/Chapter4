package chapter4;
import java.util.Arrays;
public class ex8 {

	public static void main(String[] args) {

		 int[] array_nums = {10, 20, 30};
			System.out.println("Original Array: "+Arrays.toString(array_nums)); 
			int x = array_nums[0];
			array_nums[0] = array_nums[array_nums.length-1];
			array_nums[array_nums.length-1] = x;
			System.out.println("New array after swaping the first and last elements: "+Arrays.toString(array_nums));

	}

}
