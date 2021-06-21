public class Item {
	private String itemName;
	private String itemidNo;
	private int itemQuantity;
	private double itemPrice;

	public Item(String itemName, String itemidNo,
			int itemQuantity, double itemPrice) {
		this.itemName = itemName;
		this.itemidNo = itemidNo;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}
	
	public Item(String itemName, String itemidNo, int itemQuantity) {
		this.itemName = itemName;
		this.itemidNo = itemidNo;
		this.itemQuantity = itemQuantity;
		this.itemPrice = 500;
	}
	
	public Item(String itemName, String itemidNo) {
		this.itemName = itemName;
		this.itemidNo = itemidNo;
		this.itemQuantity = 1;
		this.itemPrice = 500;
	}

	public String getitemName() {
		return itemName;
	}

	public void setitemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getitemidNo() {
		return itemidNo;
	}

	public void setitemidNo(String itemidNo) {
		this.itemidNo = itemidNo;
	}
	
	public int getitemQuantity() {
		return itemQuantity;
	}

	public void setitemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	public double getitemPrice() {
		return itemPrice;
	}

	public void setitemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
}
