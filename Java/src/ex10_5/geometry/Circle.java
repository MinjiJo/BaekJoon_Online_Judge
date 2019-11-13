package ex10_5.geometry;

public class Circle { // 앞에 private, protected는 쓸 수 없음. public과 아무것도 안 붙는 default 가능
//final 앞에 붙으면 상속할 수 없음
	public int radius;
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * 3.14;
	}
}
