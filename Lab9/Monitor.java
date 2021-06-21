import java.io.*;

public class Monitor implements Runnable {
	private Data d; // shared object
	private int tails = 0; // count number of tails
	private int heads = 0; // count number of heads
	
	public Monitor(Data d) {
		this.d = d;
	}

	public void run() {
		while (tails + heads < d.get_nop()) {
			if (d.get_mChance()) {
				System.out.println("Monitor is going to read the value...");
				if (d.get_result() == 0)
					tails++;
				else
					heads++;
				d.set_mChance(false);
				d.set_pChance(true);
			}
			try {
				Thread.sleep(1);
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new FileOutputStream("output.txt"));
			writer.println("Number of heads = " + heads + 
					"\nNumber of tails = " + tails);
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			writer.close();
		}
	}
}
