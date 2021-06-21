import java.util.*;

public class Player implements Runnable {
	private Data d; // shared object
	Random rand = new Random(); // random number generator
	
	public Player(Data d) {
		this.d = d;
	}

	public void run() {
		boolean flag = true;
		while (flag) {
			if (d.get_lock() == null)
				d.set_lock(this);
			if (d.get_lock() == this && d.get_pChance()) {
				d.set_result(rand.nextInt(2));
				d.set_mChance(true);
				d.set_pChance(false);
				d.set_lock(null);
				flag = false;
			}
			try {
				Thread.sleep(1);
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
