package ex10_1_package2_method;

public class Point_private {
	int x, y;
	Point_private(int x, int y) {
		this.x = x;
		this.y = y;
	}
	private int getX() {
		return x;
	}
	private int getY() {
		return y;
	}
}
