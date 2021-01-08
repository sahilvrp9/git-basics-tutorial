package controlFlow;

/**
 * This program shows how the values in two different variables are swapped
 * @author sharo
 *Java version 8, JRE version 14
 */
import java.util.*;

public class SwapValues {
	public static void main(String[] args) {
		// swapping with temporary variable
		// before swapping
		int a = 1, b = 2;
		System.out.println("Values before swapping " + a + " " + b);
		// code for swapping
		int c = a = 1;
		a = b = 2;
		b = c = 1;
		System.out.println("Values after swapping " + a + " " + b);

		// swapping with out temporary variable
		// before swapping
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value for d :");
		int d = scan.nextInt();
		System.out.print("Enter a value for e :");
		int e = scan.nextInt();

		System.out.println("Values before swapping " + d + " " + e);

		// code for swapping
		d = d + e;
		e = d - e;
		d = d - e;

		System.out.println("Values after swapping " + d + " " + e);

	}

}
