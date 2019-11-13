package ex13_8_clone_참고2_deep;

public class Circle implements Cloneable{
	Point p;
	double r;
	
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	//깊은 복사 - 원본이 참조하고 있는 객체까지 복제
	public Circle clone() {
		Object obj = null;
		try {
			obj = super.clone();//조상의 clone()을 호출
		}
		catch (CloneNotSupportedException e) {
			System.out.println("복제 오류 발생했습니다.");
			return null;
		}
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x, this.p.y);
		return (Circle)obj;
	}
	
	public String toString() {
		return "[p=" + p + ", r=" + r + "]";
	}
}
