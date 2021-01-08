package strings;

import java.util.ArrayList;

/**
 * this program shows how passing by reference works
 * 
 * @author sharo Java version 8, JRE version 14
 */

public class Reference {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();//this is an array list which has no fixed size
		a.add(0, "Summer");//the add method is used to insert elements into the array list a
		a.add(1, "Spring");
		System.out.println(a);
        updateString(a);//the update string method is used to update the array list a 
		
	}
/**
 * update string method is written to add a new element to the array list
 * @param a
 */
	private static void updateString(ArrayList<String> a) {
	
		a.add(2, "Fall");
		System.out.println(a);

	}
}
