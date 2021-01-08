package loops;
/**
 * this programs shows how the fibonacci series is generated
 * 
 * @author sharo Java version 8 JRE version 14
 */
public class Fibonacci {
public static void main(String[] args) {
	int a=0, b=1, d, count=15;
	System.out.println(a + "\n" + b);
	
	for(int c=2; c<=count; ++c) {
		d=a+b;
		System.out.println("" + d);
		a=b;
		b=d;
	}
}
}
