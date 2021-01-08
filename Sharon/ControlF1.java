package controlFlow;

/**
 * This programs shows how the control flow statements work
 * @author sharo
 *Java version 8 JRE version 14
 */
import java.util.*;

/**
 * Class controlF1 shows how if and else statements work and how to use ternary
 * operator
 * 
 * @author sharo
 *
 */
public class ControlF1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value for a: ");
		int a = scan.nextInt();
		// finding out if a number is odd or even with if else
		if (a % 2 == 0) {
			System.out.println("The value of a is an even number");
		} else {
			System.out.println("The value of a is an odd number");
		}
		// using ternary operator to find out if a number is odd or even

		System.out.println(a % 2 == 0 ? "It's an even number" : "It's an odd number");
	}
}
