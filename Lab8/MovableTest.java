import java.util.*;

interface Movable {
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
}

class MovablePoint implements Movable {
	int x, y, xSpeed, ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	@Override
	public void moveUp() {
		y += ySpeed;
	}
	
	@Override
	public void moveDown() {
		y -= ySpeed;
	}
	
	@Override
	public void moveRight() {
		x += xSpeed;
	}

	@Override
	public void moveLeft() {
		x -= xSpeed;
	}
}

class MovableCircle implements Movable, Comparable<MovableCircle> {
	private int radius;
	private MovablePoint center;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	@Override
	public int compareTo(MovableCircle mc) {
		return this.radius - mc.radius;
	}

	@Override
	public String toString() {
		return "(" + center.x + ", " + center.y + ")" + " " + radius;
	}
	
	@Override
	public void moveUp() {
		center.y += center.ySpeed;
	}
	
	@Override
	public void moveDown() {
		center.y -= center.ySpeed;
	}
	
	@Override
	public void moveRight() {
		center.x += center.xSpeed;
	}

	@Override
	public void moveLeft() {
		center.x -= center.xSpeed;
	}
}

class Comp1 implements Comparator<MovablePoint> {
	@Override
	public int compare(MovablePoint a, MovablePoint b) {
		return a.xSpeed - b.xSpeed;
	}
}

class Comp2 implements Comparator<MovablePoint> {
	@Override
	public int compare(MovablePoint a, MovablePoint b) {
		return a.ySpeed - b.ySpeed;
	}
}

public class MovableTest {
	public static void main(String args[]) {
		MovableCircle c1 = new MovableCircle(2, 1, 2, 3, 5);
		MovableCircle c2 = new MovableCircle(4, 5, 1, 1, 2);
		System.out.println(c1 + "\n" + c2 + "\n" + c1.compareTo(c2));
		System.out.println((new MovablePoint(2, 3, 4, 5)).toString());
	}
}
