package ex13_8_clone_참고1_shallow;

public class Circle implements Cloneable{
	Point p;
	double r;
	
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	//얕은 복사 - 객체에 저장된 값을 그대로 복제해서
	//객체가 참조하고 있는 객체까지 복제하지는 않습니다.
	public Circle clone() {
		Object obj = null;
		try {
			obj = super.clone();//조상의 clone()을 호출
		}
		catch (CloneNotSupportedException e) {
			System.out.println("복제 오류 발생했습니다.");
			return null;
		}
		return (Circle)obj;
	}
	
	public String toString() {
		return "[p=" + p + ", r=" + r + "]";
	}
}
