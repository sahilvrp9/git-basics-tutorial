package arrays;
/**
 * this program shows how binary search is used to find an element in an array
 * @author sharo
 *
 */
public class BinarySearch {
//method for binary search
	public static void BSearch(int low, int high, int num, int[] values) {
		int pointer = (low + high) / 2; //calculation to find the middle of the array
		//while loop to check if the value in the low index is equal to the given number or not
		while (low <= high) {
			if (values[pointer] < num) {
				low = pointer + 1;
			} else if (values[pointer] == num) {
				System.out.println("Element found at index:" + pointer);
				break;
			} else {
				high = pointer - 1;
			}
			pointer = (low + high) / 2;
		}
		if (low > high) {
			System.out.println("Element not found");
		}
	}

	public static void main(String[] args) {
		int[] values = { 15, 29, 35, 1, 40, 55, 64, 78 };
		int num = 64;
		int high = values.length - 1;
		BSearch(0, high, num, values);//calling binary search method

	}
}
