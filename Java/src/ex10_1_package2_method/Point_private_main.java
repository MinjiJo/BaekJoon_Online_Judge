//���� ��Ű���� Ŭ������ ����ϴ� ���α׷�
package ex10_1_package2_method;			// ��Ű�� ����

class Point_private_main {
	public static void main(String args[]) {
		Point_private obj = new Point_private(3, 5);
		System.out.println("x ��ǥ = " + obj.x);
		System.out.println("y ��ǥ = " + obj.y);
		//System.out.println("x ��ǥ = " + obj.getX());	//The method getX() from the type Point_private is not visible
		//System.out.println("y ��ǥ = " + obj.getY());	//The method getY() from the type Point_private is not visible
	}
}
