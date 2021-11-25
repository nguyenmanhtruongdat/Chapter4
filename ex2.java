package chapter_3;
import java.util.Scanner;
public class ex2 {

	public static int vowelsCount(String str) {
		
			
		int count=0;
		
	      for (int i=0 ; i<str.length(); i++){
	         
	    	  char ch = str.charAt(i);
	         
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch != ' ')
	         {
	             count ++;
	         }
	      }
	      System.out.println("Number of vowels in the string is: "+count);
		
	      return count;
	}
	
	public static void main(String[] args) {
		ex2 obj = new ex2();

		String str;
		
		System.out.println("Enter a string: ");
	    Scanner sc = new Scanner(System.in);
	    str = sc.nextLine();

		
		obj.vowelsCount(str);
		
		
	
	}

}
