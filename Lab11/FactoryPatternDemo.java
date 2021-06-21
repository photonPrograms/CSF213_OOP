/* CS F213 Lab 11
 * factory design pattern
 */

interface Shape {
	public void draw();
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Rectangle draw() method.");
	}
}

class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Square draw() method.");
	}
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Circle draw() method.");
	}
}

class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null)
			return null;
		else if (shapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if (shapeType.equalsIgnoreCase("Square"))
			return new Square();
		else if (shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		return null;
	}
}

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		sf.getShape("Square").draw();
		Shape sp = sf.getShape("Circle");
		sp.draw();
	}
}
