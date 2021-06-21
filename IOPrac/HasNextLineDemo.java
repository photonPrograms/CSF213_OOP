import java.util.*;
import java.io.*;

public class HasNextLineDemo {
	public static void main(String args[]) {
		Scanner istream = null;
		PrintWriter ostream = null;

		try {
			istream = new Scanner(new FileInputStream("muffet.txt"));
			ostream = new PrintWriter(new FileOutputStream("nummuffet.txt"));
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

		String line;
		int count = 0;

		while (istream.hasNextLine()) {
			line = istream.nextLine();
			count++;
			ostream.println(count + ". " + line);
		}

		istream.close();
		ostream.close();
	}
}
