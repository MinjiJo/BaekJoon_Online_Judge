package ex10_1_package;

class Circle { // �տ� private, protected�� �� �� ����. public�� �ƹ��͵� �� �ٴ� default ����
//final �տ� ������ ����� �� ����
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	double getArea() {
		return radius * radius * 3.14;
	}
}
