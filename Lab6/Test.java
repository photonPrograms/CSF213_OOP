class A {
	int a;
	A() {
		a = 1;
	}
	void show() {
		System.out.println("hello");
	}
}
class B extends A {
	@Override
	void show() {
		System.out.println("there");
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.show();
		(new B()).show();
	}
}
