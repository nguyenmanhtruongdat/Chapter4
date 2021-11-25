package chapter_3;
import java.util.*;
public class ex1 {

	public void Compare(int num1, int num2, int num3) {
		
		if(num1<num2) {
            if(num1<num3) {
            	System.out.println(num1 + " is the smallest number");
            } else {
            	System.out.println(num3 + " is the smallest number");
            }
        } else {
            if(num2<num3) {
            	System.out.println(num2 + " is the smallest number");
            } else {
            	System.out.println(num3 + " is the smallest number");
            }
        }
}
		
		
		
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int num1, num2, num3;
		
		ex1 obj = new ex1();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		num1=scanner.nextInt();
		System.out.println("Enter second number : ");
		num2=scanner.nextInt();
		System.out.println("Enter third number: ");
		num3=scanner.nextInt();
		
		obj.Compare(num1, num2, num3);
		
		
	}

}
