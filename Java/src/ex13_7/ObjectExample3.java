/*
 * Object Ŭ������ equals() �޼ҵ�
 * �Ű������� ��ü�� ���������� �޾Ƽ� ���ϸ� �� ����� boolean ������ �˷� �ִ� ������ �մϴ�.
 * ������ equals �޼ҵ��� ���� �����Դϴ�.
   public boolean equals(Object arg0) {
   	return this == arg0;
   	}
   * �� ��ü�� ���� �ٸ��� ���������� ������ �Ǵ��ϰ� �ֽ��ϴ�.
   * ���� �ٸ� �� ��ü�� equals �޼���� ���ϸ� �׻� false ����� ��� �˴ϴ�.
 */

package ex13_7;

class ObjectExample3 {
	public static void main(String args[]) {
		Circle obj1 = new Circle(5);
		Circle obj2 = new Circle(5);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		//System.out.println(obj1.toString());
		//System.out.println(obj2.toString());
		
		if (obj1.equals(obj2))
			System.out.println("obj1.equals(obj2) : ����");
		else
			System.out.println("obj1.equals(obj2) : �ٸ�");
		
		if (obj1 == obj2)
			System.out.println("obj1.equals(obj2) : ����");
		else
			System.out.println("obj1.equals(obj2) : �ٸ�");
	}
}
