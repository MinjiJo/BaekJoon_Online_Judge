package ex7_7_field;

public class Circle {
	double radius;
	final double PI = 3.14;
	
	Circle(double radius){		// ������
		this.radius = radius;
	}
	
	double getArea() {		// �޼ҵ�
		double area;
		area = radius * radius * PI;
		return area;
	}
}
