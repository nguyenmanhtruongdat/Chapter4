package chapter_3;
import java.util.*;
public class ex5 {
    public static void main(String [] args){
        int i;
        int factorial = 1;
    	int factorialA[] = new int[10];
        for(i=1; i<=10; i++)
		{
		factorial*=i;	
		//System.out.println(factorial);
		
		factorial = factorialA[i];
		}
        	
        for (int j = factorialA.length-1; j >= 0; j--) {   
            System.out.print(factorialA[j] + " ");   
        }    
    }
        
}
