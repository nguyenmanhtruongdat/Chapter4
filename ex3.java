package chapter_3;
import java.util.Scanner;
public class ex3 {

	public static int countWords(String str){

	    int wordCount = 0;

	    boolean word = false;
	    int endOfLine = str.length() - 1;

	    for (int i = 0; i < str.length(); i++) {
	        // if the char is a letter, word = true.
	        if (Character.isLetter(str.charAt(i)) && i != endOfLine) {
	            word = true;
	            // if char isn't a letter and there have been letters before,
	            // counter goes up.
	        } else if (!Character.isLetter(str.charAt(i)) && word) {
	            wordCount++;
	            word = false;
	            // last word of String; if it doesn't end with a non letter, it
	            // wouldn't count without this.
	        } else if (Character.isLetter(str.charAt(i)) && i == endOfLine) {
	            wordCount++;
	        }
	    }
	    System.out.println("String has " + wordCount + " words");
	    
	    return wordCount;
	}
	
	
	
	public static void main(String[] args) {
	String str;
	ex3 obj = new ex3();
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a string: ");
	str=scanner.nextLine();
	obj.countWords(str);
	}

}
