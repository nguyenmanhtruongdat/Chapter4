package chapter4;
import java.util.Arrays;
public class ex12 {

	
	public static void main(String[] args) {
		
		int[] numbers = {155, 251, 762, 98, 155};
		
		System.out.println("Array: " +Arrays.toString(numbers));
		
		int maxValue = numbers[0];
		int minValue = numbers[4];
	{
		for(int i=1;i < numbers.length;i++)
		  {
		    if(numbers[i] > maxValue)
		    {
		      maxValue = numbers[i];
		    }
		  }
		  
		  System.out.println("Max value of array = " +maxValue);
	} 
		  
		  
	{	  
		  for(int j=4;j>=0;j--)
		  {
		    if(numbers[j] < minValue)
		    {
		      minValue = numbers[j];
		  
		    }
		  }
		 
		  System.out.println("Min value of array = " +minValue);

	}


	}

}