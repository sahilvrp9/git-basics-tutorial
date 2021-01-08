package arrays;
/**
 * this programs demonstrates the creation, initialization of an array and also finding the largest element in an array
 * @author sharo
 *Java version 8, JRE version 14
 */
public class Array {
public static void main(String[] args) {
	
	int [] randomNum = {1, 5, 9, 2, 10, 15, 6};//creation, initialization of an array
	int largest = randomNum[0];
	//for loop for finding the largest element in the given array
	for(int i=0; i<randomNum.length; i++) {
		if (randomNum[i]>largest) {
			largest=randomNum[i];
		}
	}
	System.out.println(largest);
}
}
