//다른 패키지에서 사용할 수 있도록 공개된 Rectangle 클래스
package ex10_5.geometry.polygon;

public class Rectangle {
	public int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}
}
