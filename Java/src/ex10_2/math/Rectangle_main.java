//import ����:
//�ٸ� ��Ű���� ���ϴ� Ŭ������ �������̽��� ��Ű�� �̸� ���� ����� �� �ְ� �˴ϴ�.
//��Ű�� ������ ���� ��쿡�� ��Ű�� ���𹮺��� �ڿ� ��� �մϴ�.
package ex10_2.math; //��Ű�� ����

import ex10_2.geometry.polygon.Rectangle; //import ����

public class Rectangle_main {
	public static void main(String[] args) {
		Rectangle obj = new Rectangle(2, 3);
		System.out.println("���� = " + obj.width);
		System.out.println("���� = " + obj.height);
		System.out.println("���� = " + obj.getArea());
	}
}
