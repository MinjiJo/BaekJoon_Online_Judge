package ex10_5.geometry;

public class Circle { // �տ� private, protected�� �� �� ����. public�� �ƹ��͵� �� �ٴ� default ����
//final �տ� ������ ����� �� ����
	public int radius;
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * 3.14;
	}
}
