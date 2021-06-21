public class EmpManTest {
	public static void main(String[] args) {
		Employee e = new Employee("Dan", 10);
		System.out.println(e + "\n" + e.getName() + "\n" + e.getSalary());
		e.setName("Dan Marseli");
		e.setSalary(11);
		System.out.println(e + "\n" + e.getName() + "\n" + e.getSalary());

		Manager m = new Manager("Rob", 23, "Culinary");
		System.out.println(m + "\n" + m.getName() + "\n"
				+ m.getSalary() + "\n" + m.getDept());
		m.setName("Rob Caesar");
		m.setSalary(21);
		m.setDept("Janitor");
		System.out.println(m + "\n" + m.getName() + "\n"
				+ m.getSalary() + "\n" + m.getDept());
	} 
}
