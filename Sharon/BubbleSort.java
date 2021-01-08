package arrays;
/**
 * this program shows how bubble sort is used to sort an array
 * @author sharo
 *Java version 8, JRE version 14
 */
public class BubbleSort {
public static void main(String[] args) {
	int [] array= {20,9,53,17,48};
	System.out.println("\n Before: ");
	for(int i=0; i<array.length; i++) {
		System.out.print(array[i] + " ");
	}
	bSort(array);
	System.out.println("\n After: ");
	for(int i=0; i<array.length; i++) {
		System.out.print(array[i] + " ");
	}
}
//method for bubble sort
public static void bSort(int [] array) {
int len=array.length; //length variable being assigned the value array of the length 
int temp=0; //temporary variable being used to swap values
//the 1st for loop is used for iterations
for(int i=0; i<len; i++) {

	for(int j=1; j<(len-i); j++) {
	if(array[j-1]>array[j]) {
		temp=array[j-1];
		array[j-1]=array[j];
		array[j]=temp;

	}
}
}
}
}

