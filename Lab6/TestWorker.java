abstract class Worker {
	private String name;
	private double salary_rate;

	Worker(String name, double salary_rate) {
		this.name = name;
		this.salary_rate = salary_rate;
	}

	public String getName() {
		return name;
	}

	public double getSalaryRate() {
		return salary_rate;
	}

	abstract public double computePay();
}

class FullTimeWorker extends Worker {
	private int hours_worked;

	FullTimeWorker(String name, double salary_rate, int hours_worked) {
		super(name, salary_rate);
		this.hours_worked = hours_worked;
	}

	@Override
	public double computePay() {
		return (hours_worked <= 240 ? hours_worked : 240) * getSalaryRate();
	}
}

class HourlyWorker extends Worker {
	private int hours_worked;

	HourlyWorker(String name, double salary_rate, int hours_worked) {
		super(name, salary_rate);
		this.hours_worked = hours_worked <= 60 ? hours_worked : 60;
	}

	@Override
	public double computePay() {
		return hours_worked * getSalaryRate();
	}
}

public class TestWorker {
	public static void main(String[] args) {
		FullTimeWorker w1 = new FullTimeWorker("Mahesh", 100, 180);
		HourlyWorker w2 = new HourlyWorker("Ramesh", 50, 50);
		System.out.println(w1.computePay() + " " + w2.computePay());
	}
}
