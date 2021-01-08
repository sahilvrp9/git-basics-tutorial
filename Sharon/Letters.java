package controlFlow;

/**
 * This program demonstrates if & else and switch statement
 * 
 * @author sharo
 *Java version 8, JRE version 14
 */
public class Letters {
	public static void main(String[] args) {
		// finding out if the given character is a vowel or a consonant using switch
		// statement
		char v = 'c';
		switch (v) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("it is a vowel");
			break;
		default:
			System.out.println("it is a consonant");
		}
		// finding out if the given character is a vowel or a consonant using if else
		// statement
		char v1 = 'i';
		if (v1 == 'a' || v1 == 'e' || v1 == 'i' || v1 == 'o' || v1 == 'u') {
			System.out.println("it is a vowel");
		} else {
			System.out.println("it is a consonant");
		}
	}

}
