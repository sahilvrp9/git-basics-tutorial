package arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] iarray = { 10, 1, 26, 78, 2, 9, 15 };

		iSort(iarray);

		for (int i = 0; i < iarray.length; i++)
			System.out.print(iarray[i] + " ");

	}

	public static void iSort(int[] iarray) {

		for (int i = 1; i < iarray.length; i++) {
			int a = iarray[i];
			int j = i - 1;

			while (j >= 0 && iarray[j] > a) {
				iarray[j + 1] = iarray[j];
				j--;
			}
			iarray[j + 1] = a;
		}
	}
}
