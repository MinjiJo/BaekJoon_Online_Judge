package ex10_5.math;

import ex10_5.geometry.Circle;
import ex10_5.geometry.polygon.Rectangle;

//ctrl+shift_o(�ڵ� import ����Ű)
public class PackageExample5 {
	public static void main(String args[]) {
		Circle obj1 = new Circle(5);
		Rectangle obj2 = new Rectangle(8, 9);
		if (obj1.getArea() > obj2.getArea())
			System.out.println("���� ������ �� �н��ϴ�.");
		else 
			System.out.println("���� ������ ���簢���� �������� �۰ų� �����ϴ�.");
	}
}
