package arrays;

public class SelectionSort {
public static void main(String[] args) {

	int [] sarray= {70, 56, 10, 43, 1, 90};
	System.out.println("\n Before: ");
	for(int i=0; i<sarray.length; i++) {
		System.out.print(sarray[i] + " ");
	}
	sSort(sarray);
	System.out.println("\n After: ");
	for(int i=0; i<sarray.length; i++) {
		System.out.print(sarray[i] + " ");
	}
}

public static void sSort(int [] sarray) {
	for(int i=0; i<sarray.length-1; i++) {
		
		int min=i;
		for(int j=i+1; j<sarray.length; j++) 
			if(sarray[j]<sarray[min]) 
				min=j;
				
				int temp=sarray[min];
				sarray[min]=sarray[i];
				sarray[i]=temp;
				
			}
		}
	
}
