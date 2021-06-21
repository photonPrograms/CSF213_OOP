public class Lab10 {
	public static void main(String args[]) {
		Data d = new Data();
		Thread[] players = new Thread[d.get_nop()];
		Thread monitor;

		for (int i = 0; i < d.get_nop(); i++) {
			players[i] = new Thread(new Player(d));
			d.set_lock(players[i]);
			players[i].start();
		}

		monitor = new Thread(new Monitor(d));
		monitor.start();
	}
}
