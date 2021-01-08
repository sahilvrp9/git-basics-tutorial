package arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] marray = { 2, 5, 4, 3, 1, 10, 9, 7, 6, 8 };
		int len = marray.length / 2;
		mSort(marray);
		for (int i = 0; i < len; i++)
			System.out.println(marray[i]);
		mSort2(marray);
		int len2 = marray.length;
		for (int k = 5; k < len2; k++)
			System.out.println(marray[k]);
	}

	public static void mSort(int[] marray) {
		int len = marray.length / 2, temp = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 1; j < len - i; j++) {
				if (marray[j - 1] > marray[j]) {
					temp = marray[j - 1];
					marray[j - 1] = marray[j];
					marray[j] = temp;
				}

			}

		}
	}

	public static void mSort2(int[] marray) {
		int len = marray.length / 2;
		int len2 = marray.length;
		int temp2=0;
		for (int k = 5; k < len2; k++) {
			for (int l = 6; l < len2; l++) {
				if (marray[l - 1] > marray[l]) {
					temp2 = marray[l - 1];
					marray[l - 1] = marray[l];
					marray[l] = temp2;
				}

			}

		}
	}
	
	public static void merge(int mSort, int mSort2) {
		
	}
}
