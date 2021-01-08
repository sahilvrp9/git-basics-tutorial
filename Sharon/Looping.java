package loops;

/**
 * This program shows how for loop works
 * 
 * @author sharo Java version 8, JRE version 14
 */
public class Looping {
	public static void main(String[] args) {
		int i = 10, j = 1;
		int sum = 0;
		while (j <= i) {
			sum += j;
			j++;

		}
		System.out.println(sum);
	}

}
