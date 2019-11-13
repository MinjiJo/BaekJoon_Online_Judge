package ex13_8_clone_����1_shallow;

public class Circle implements Cloneable{
	Point p;
	double r;
	
	Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	//���� ���� - ��ü�� ����� ���� �״�� �����ؼ�
	//��ü�� �����ϰ� �ִ� ��ü���� ���������� �ʽ��ϴ�.
	public Circle clone() {
		Object obj = null;
		try {
			obj = super.clone();//������ clone()�� ȣ��
		}
		catch (CloneNotSupportedException e) {
			System.out.println("���� ���� �߻��߽��ϴ�.");
			return null;
		}
		return (Circle)obj;
	}
	
	public String toString() {
		return "[p=" + p + ", r=" + r + "]";
	}
}
