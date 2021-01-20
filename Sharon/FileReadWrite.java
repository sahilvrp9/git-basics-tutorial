package fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {



	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		
		FileReader fr = new FileReader("C:\\Users\\sharo\\Downloads\\Downloads for java\\JFiles\\src\\loops\\Fibonacci.java"); {
		FileWriter fw = new FileWriter("C:\\Users\\sharo\\Downloads\\Downloads for java\\JFiles\\src\\loops\\newFibonacci.java"); 	
	
		
		int i;
			do {
				i = fr.read();
				if(i != -1)
					fw.write(i);
				System.out.print((char)i);
				
			}while(i != -1);
	
			fr.close();
			fw.close();
		}
		


	}

}
