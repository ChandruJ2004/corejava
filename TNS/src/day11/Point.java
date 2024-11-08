package day11;

public class Point {
	private float x;
	private float y;
	public Point() {
		x=0.0f;
		y=0.0f;
	}
	public Point(float x, float y) {
		this.x=x;
		this.y=x;
	}
	public Point(float f) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

