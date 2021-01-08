package controlFlow;

/**
 * This program shows how the largest number among three number is selected using control flow statements
 * @author sharo
 *Java version 8 JRE version 14
 */
import java.util.*;

public class LargestNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value for 'a': ");
		int a = scan.nextInt();
		System.out.print("Enter a value for 'b': ");
		int b = scan.nextInt();
		System.out.print("Enter a value for 'c': ");
		int c = scan.nextInt();
		// this 'if' statement checks if the value stored in 'a' is greater than the
		// values in 'b' and 'c'
		if (a > b && a > c) {
			System.out.println(a + " is the largest number");
		}
		// this 'else if' statement checks if the value stored in 'b' is greater than
		// the values in 'a' and 'c'
		else if (b > a && b > c) {
			System.out.println(b + " is the largest number");
		} else {
			System.out.println(c + " is the largest number");
		}
	}

}
