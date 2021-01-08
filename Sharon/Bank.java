package math;

/**
 * Continuing the demonstration of arithmetic operators 
 * @author sharo
 *Java version 8, JRE version 14
 */
import java.util.*;

/**
 * the bank class takes user input to withdraw and deposit money 
 * the input values are double
 * the output values are double
 * @author sharo
 *
 */
public class Bank {
	public static void main(String args[]) {
		
		final double balance = 5000.00;
		Scanner draw = new Scanner(System.in);
		System.out.print("Enter the amount you want to withdraw: ");
		double d = draw.nextDouble();
		double e = balance - d;
		System.out.println("Available balance is " + e);

		Scanner dep = new Scanner(System.in);
		System.out.print("Enter the amount you want to deposit: ");
		double f = dep.nextDouble();
		double g = e + f;
		System.out.println("Available balance is " + g);
	}
/**
 * the withdraw method subtracts the user input value from the balance value which is constant
 * @param draw
 * @param d
 * @return
 */
	public static double withdraw(double draw, double d) {
		final double balance = 5000.00;
		double e = balance - d;
		return e;
	}
/**
 * the deposit method adds the user input value to the available balance value returned by the withdraw method
 * @param dep
 * @param e
 * @param f
 * @return
 */
	public static double deposit(double dep, double e, double f) {
		final double balance = 5000.00;
		double g = e + f;
		return g;
	}

}
