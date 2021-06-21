import java.io.*;

public class TextFileOutputDemo {
	public static void main(String[] args) {
		PrintWriter ostream = null;
		try {
			ostream = new PrintWriter(new FileOutputStream("stuff.txt", true));
		}
		catch (FileNotFoundException e) {
			System.err.println("Error opening the file stuff.txt");
			System.exit(0);
		}

		ostream.print("The quick brown fox ");
		ostream.println("jumped over the lazy dog.");
		
		ostream.close();
	}
}
