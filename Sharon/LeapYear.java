package controlFlow;

import java.util.Scanner;

/**
 * This program demonstrates how we find out if a given year is a leap year or not using if else statement
 * @author sharo
 *
 */
import java.util.*;

public class LeapYear {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scan.nextInt();

		if (year % 400 == 0) {
			System.out.println("It is divisible by 400 so it is a leap year");
		} else if (year % 100 == 0) {
			System.out.println("It is divisible by 100 so it is not a leap year");
		} else if (year % 4 == 0) {
			System.out.println("It is divisible by 4 so it is a leap year");
		} else {
			System.out.println("It is not a leap year");
		}
	}
}
