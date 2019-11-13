package ex13_8_clone_����2_deep;

public class Circle implements Cloneable{
	Point p;
	double r;
	
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	//���� ���� - ������ �����ϰ� �ִ� ��ü���� ����
	public Circle clone() {
		Object obj = null;
		try {
			obj = super.clone();//������ clone()�� ȣ��
		}
		catch (CloneNotSupportedException e) {
			System.out.println("���� ���� �߻��߽��ϴ�.");
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
