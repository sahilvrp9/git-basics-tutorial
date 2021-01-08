package strings;
/**
 * this programs shows some of the operations that can be done on strings
 * 
 * @author sharo Java version 8 JRE version 14
 */
import java.util.*;

public class StringOp {
	public static void main(String[] args) {
		// code for reversing a string
		System.out.print("Enter string to reverse:");

		Scanner str = new Scanner(System.in);
		String scan = str.nextLine();
		String reverse = "";

		for (int i = scan.length() - 1; i >= 0; i--) {
			reverse = reverse + scan.charAt(i);
		}

		System.out.print("Reversed string is:");
		System.out.println(reverse);

		// code for checking if the entered string is a palindrome or not
		String b, rev = "";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string/number to check if it is a palindrome:");
		b = in.nextLine();
		int length = b.length();
		for (int i = length - 1; i >= 0; i--)
			rev = rev + b.charAt(i);
		if (b.equals(rev))
			System.out.println("Entered string/number is a palindrome");
		else
			System.out.println("Entered string/number isn't a palindrome");

		// first and last occurrence of 'a'
		String c = "Texas Dallas";
		System.out.println(c.indexOf('a')); //first occurrence of letter a
		
		System.out.println(c.lastIndexOf('a')); //last occurrence of letter a
		
		
		
		
		
	}

}