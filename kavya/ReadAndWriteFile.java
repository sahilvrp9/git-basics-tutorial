import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteFile {

	public static void main(String[] args) throws IOException {
		FileReader fread = new FileReader("/Users/kavyareddy/eclipse-workspace/Streaming/src/Sample2.java");
		FileWriter fwrite = new FileWriter("/Users/kavyareddy/eclipse-workspace/Streaming/src/Main.java");
		int c;
		try {
			do {
				c = fread.read();
				if (c != -1)
					fwrite.write(c);
				System.out.print((char) c);
			} while (c != -1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fread.close();
			fwrite.close();
		}
	}

}
