class Account {
	private long acctNumber;
	private double balance;
	private String name;
	
	public Account(long acctNumber, double balance, String name) {
		this.acctNumber = acctNumber;
		this.balance = balance;
		this.name = name;
	}

	public long get_acctNumber() {
		return acctNumber;
	}

	public void set_acctNumber(long acctNumber) {
		this.acctNumber = acctNumber;
	}

	public double get_balance() {
		return balance;
	}
	
	public void set_balance(double balance) {
		this.balance = balance;
	}

	public String get_name() {
		return name;
	}

	public void set_name(String name) {
		this.name = name;
	}
}

public class Bank {
	private ArrayList<Account> accts;
	int maxActive;

	public boolean addAccount(Account newone) {
		accts.add(newone);
	}

	public boolean removeAccount(long acctnum) {
		Iterator<Account> itr = acct.iterator();
		while (itr.hasNext()) {
			Account curr = itr.next();
			if (curr.get_acctnum() == acctnum)
				accts.remove(curr);
		}
	}

	public double withdraw(long acctnum, double amount) {
		Iterator<Account> itr = acct.iterator();
		while (itr.hasNext()) {
			Account curr = itr.next();
			if (curr.get_acctnum() == acctnum)
				if (curr.get_balance() < amount)
					return -1;
				else {
					curr.set_balance(curr.get_balance() - amount);
					return curr.get_balance();
				}
			return -1;
		}
	}
}
