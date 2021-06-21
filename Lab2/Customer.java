public class Customer {
	private String name, idNo;
	double balance;
	Item item;

	public Customer(String name, String idNo, double balance) {
		this.name = name;
		this.idNo = idNo;
		this.balance = balance;
	}
	
	public Customer(String name, String idNo) {
		this.name = name;
		this.idNo = idNo;
		this.balance = 5000;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	
	public String getidNo() {
		return idNo;
	}

	public void setidNo(String idNo) {
		this.idNo = idNo;
	}

	public double getbalance() {
		return balance;
	}

	public Item getitem() {
		return item;
	}

	public void print() {
		System.out.println("Item name: " + item.getitemName());
		System.out.println("Item id: " + item.getitemidNo());
		System.out.println("Item quantity: " + item.getitemQuantity());
		System.out.println("Item price: " + item.getitemPrice());
		System.out.println("Balance left: " + balance);
	}

	public void buyItem(Item item) {
		int q = item.getitemQuantity();
		double p = item.getitemPrice();
		if (q >= 1 && balance >= q * p) {
			this.item = item;
			balance -= p * q;
			print();
		}
		else if (balance < q * p)
			System.out.println("Insufficient balance.");
		else
			System.out.println("Order is not valid.");
	}
}
