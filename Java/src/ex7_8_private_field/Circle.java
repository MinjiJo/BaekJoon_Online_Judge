//private �ʵ带 ���� Ŭ������ ��
/*
       ��ü ���� ���α׷����� �ֿ� Ư¡ �� �ϳ��� ĸ��ȭ�� Ŭ���� ����� Ŭ���� ���ο� ���ߴ� ���Դϴ�.
       Ŭ���� ����� �ܺο��� ������ �� ������ �����ϱ� ���� private�� ����մϴ�.
       ������ �Ϻ� ����� �ܺ� Ŭ������ ����� �� �ֵ��� �����ؾ� �մϴ�.
 * ���� �������� ������ ���� ȸ�θ� ĸ��ȭ�ؼ� ���������� ���� ��ư,
       ���� ���� ��ư ���� �ܺο� �����ؼ� ����� �� �ְ� �մϴ�.
       ��ó�� Ŭ���� ���ο� ������ �ʵ带 �ܺο��� ����� �� �ֵ���
   Getter�� Setter�� �����մϴ�.
       �Ϲ������� Getter�� get, Setter�� set���� �����ϴ� �̸��� ����մϴ�.
   radius �ʵ忡 �����ϱ� ���ؼ� getRadius(), setRadius() �޼��带 ����մϴ�.
 */

package ex7_8_private_field;

class Circle {
	// ���� ������ private�� Ŭ���� ���ο��� ��밡���մϴ�. => ������ ����
	private double radius;
	final double PI = 3.14;

	Circle(double radius) {		 // ������
		this.radius = radius;
	}

	double getArea() {		 // �޼ҵ�
		double area;
		area = radius * radius * PI;
		return area;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
