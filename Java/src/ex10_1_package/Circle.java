package ex10_1_package;

class Circle { // 앞에 private, protected는 쓸 수 없음. public과 아무것도 안 붙는 default 가능
//final 앞에 붙으면 상속할 수 없음
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	double getArea() {
		return radius * radius * 3.14;
	}
}
