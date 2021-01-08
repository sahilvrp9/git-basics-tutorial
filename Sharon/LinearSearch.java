package arrays;

/**
 * this program how linear search is done on an array to find a particular
 * element in an array
 * 
 * @author sharo Java version 8, JRE version 14
 */

public class LinearSearch {

	public static void main(String[] args) {
		int[] random = { 2, 4, 6, 8, 10 }; // initialized the values for the array
		int num = 1; // the number to be found in the array
		boolean flag = false; // a flag variable to indicate if the number is found or not
		// for loop to check each element in the array
		for (int i = 0; i < random.length; i++) {
			// if condition to check whether the number to be found is equal to the number
			// at a particular index
			if (num == random[i]) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println("Found");
		else
			System.out.println("Not found");
	}
}
