package chapter_3;
import java.util.Scanner;
public class ex6 {
	
	int temp = 0;    
	
	int [] arr = new int [] {15, 25, 68, 87, 11, 67, 199, 205, 309};
	
	
	
	public void originalArray() {
		System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }
	}
	
	public void Sort() {
		 for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] < arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }
		 
		 System.out.println();
	}
    
	public void Display() {
		
		System.out.println("Array sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }
	}
	
	
	
	public static void main(String[] args) {
	
	ex6 obj = new ex6();
	obj.originalArray();
	obj.Sort();
	obj.Display();
	
		
	
	
	
	
	}
	

}
