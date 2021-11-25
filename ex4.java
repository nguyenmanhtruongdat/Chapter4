package chapter_3;
import java.util.Scanner;
public class ex4 {

	public static int Sum(long a) {
		int sum=0;
		
		while(a > 0) {
			sum +=a % 10;
			a=a/ 10;
		}
		
		System.out.println("The sum of the digits in an integer = " + sum);
		
		return sum;
		
				
	}
	
	public static void main(String[] args) {
		long a;
		
		ex4 obj = new ex4();
		
		System.out.println("Enter a integer number: ");
		Scanner scanner = new Scanner(System.in);
		a= scanner.nextInt();
		
		obj.Sum(a);
	}

}
