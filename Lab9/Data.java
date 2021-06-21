import java.util.*;
import java.io.*;

public class Data {
	private int result; // stores the result of coin toss
	private boolean pChance; // set if it is player's chance
	private boolean mChance; // set if it is monitor's chance
	private int nop; // number of players
	private Object lock;

	public Data() {
		Scanner scan = null;
		try {
			scan = new Scanner(new FileInputStream("input.txt"));
			result = scan.nextInt();
			scan.nextLine();
			pChance = scan.nextBoolean();
			scan.nextLine();
			mChance = scan.nextBoolean();
			scan.nextLine();
			nop = scan.nextInt();
		}
		catch (FileNotFoundException e) {
			System.out.println("Unable to find/open the file.");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			scan.close();
		}
	}

	public void set_result(int result) {
		// setter for result
		this.result = result;
	}

	public int get_result() {
		// getter for result
		return result;
	}
	
	public void set_pChance(boolean pChance) {
		// setter for pChance
		this.pChance = pChance;
	}

	public boolean get_pChance() {
		// getter for pChance
		return pChance;
	}
	
	public void set_mChance(boolean mChance) {
		// setter for mChance
		this.mChance = mChance;
	}

	public boolean get_mChance() {
		// getter for mChance
		return mChance;
	}
	
	public void set_nop(int nop) {
		// setter for nop
		this.nop = nop;
	}

	public int get_nop() {
		// getter for nop
		return nop;
	}
	
	public Object get_lock() {
		// getter for lock
		return lock;
	}

	public void set_lock(Object lock) {
		// setter for lock
		this.lock = lock;
	}
}
