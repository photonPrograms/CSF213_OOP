/* CS F213 Lab 11
 * decorator design pattern
 */

interface Shape {
	public void draw();
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}

abstract class ShapeDecorator implements Shape {
	Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
}

class RedShapeDecorator extends ShapeDecorator {
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}
}

public class DecoratorPatternDemo {
	public static void main(String args[]) {
		Shape rectangle = new Rectangle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		System.out.println("Simple rectangle:");
		rectangle.draw();
		System.out.println("\nCircle of red border:");
		redCircle.draw();
	}
}
