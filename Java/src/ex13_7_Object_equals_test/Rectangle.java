package ex13_7_Object_equals_test;

public class Rectangle {
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		String result = "���δ�" + width + ", ���δ� " + height;
		return result;
	}
	
	public boolean equals(Object obj) {

		if(obj != null && obj instanceof Rectangle) {
			Rectangle r = (Rectangle) obj;
			return width == r.width && height == r.height;
		}else {
			return false;
		}
		
	   	}
}
