package math;

/**
 * this programs shows the difference between division and modulus operator
 * 
 * @author sharo Java version 8 JRE version 14
 */
public class DivMod {
	public static void main(String args[]) {
		int a = 20, b = 10;
		int c = a / b;
		System.out.println("Division of a and b gives quotient " + c);
		int d = a % b;
		System.out.println("Modulus of a and b gives remainder " + d);
	}
}
