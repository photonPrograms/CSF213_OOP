public class TestStore {
	public static void main(String args[]) {
		Customer c = new Customer("Giridhar", "021");
		c.buyItem(new Item("Saunf", "C222", 2));
		c.buyItem(new Item("Gold", "Z1", 1, 70000));
	} 
}
