package ex7_7_field;

public class Circle {
	double radius;
	final double PI = 3.14;
	
	Circle(double radius){		// 持失切
		this.radius = radius;
	}
	
	double getArea() {		// 五社球
		double area;
		area = radius * radius * PI;
		return area;
	}
}
