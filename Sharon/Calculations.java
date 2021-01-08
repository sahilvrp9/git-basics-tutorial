package math;

/**
 * To demonstrate usage of arithmetic operations 
 * @author sharo
 * Java version 8, JRE version 14 
 */
import java.util.*;

/**
 * This main method shows the calculations done using different operators
 * 
 * @author sharo the input numbers are integers output numbers are integers
 *         operators used are +,*,/
 */
public class Calculations {
	
	public static void main(String args[]) {
		int a = -62, b = 90;
		int avg = (-62 + 90) / 2;
		System.out.println("Average is " + avg);
		int c = 35;
		int square = c * c;
		System.out.println("Square of 35 is " + square);
		int s = 5, h = 10;
		int ar = (s * h / 2);
		System.out.println("Area is " + ar);
		int w = 5, l = 10;
		int arr = w * l;
		System.out.println("Area is " + arr);

		// scanner class helps read the user input
		Scanner i = new Scanner(System.in);
		System.out.print("Enter the value for d:");
		int d = i.nextInt();
		int e = 5;
		int bill = d * e;
		System.out.println("Bill is " + bill);

	}

	/**
	 * this class is used to calculate the average of two numbers
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int average(int a, int b) {
		int avg;
		avg = (a + b) / 2;
		return avg;
	}

	/**
	 * this class is used to calculate the square of a number
	 * 
	 * @param c
	 * @return
	 */

	public int sq(int c) {

		int square;
		square = c * c;
		return square;
	}

	/**
	 * this class is used to calculate the area of a triangle
	 * 
	 * @param s
	 * @param h
	 * @return
	 */
	public int area(int s, int h) {

		int ar;
		ar = (s * h) / 2;
		return ar;
	}

	/**
	 * this class is used to calculate the area of a rectangle
	 * 
	 * @param w
	 * @param l
	 * @return
	 */

	public int arear(int w, int l) {

		int arr;
		arr = w * l;
		return arr;
	}

	/**
	 * this class is used to calculate the total electricity bill by taking user
	 * input
	 * 
	 * @param d
	 * @param e
	 * @return
	 */
	public int electricity(int d, int e) {

		int bill;
		bill = d * e;
		return bill;
	}

}
