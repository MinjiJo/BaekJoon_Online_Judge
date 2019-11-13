/*
Object Ŭ������ ���ǵ� toString()�� �ν��Ͻ��� ���� ������
���ڿ�(String)�� ������ �������� ������ ���Դϴ�.
Ŭ���� �ۼ��� �� toString()�� �������̵� ���� ������ �Ʒ��� ����
���ǵ� ������ �״�� ���� ���Դϴ�.

 	public String toString(){
 		return getClass().getName() + "@"
 			+ Integer.toHexString(hashCode());
 		}
 	
 	- getClass()�޼ҵ�� hashCode()�޼ҵ� ���� ObjectŬ������ �޼ҵ��̹Ƿ�
 		�ν��Ͻ� �������� �ٷ� ȣ���� �� �ֽ��ϴ�.
 		�ؽ� �ڵ�� �ν��Ͻ��� �ּҿ� ���õ� ���Դϴ�.
 		
 	- hashCode()�޼���� �ؽ�(hashing) ����� ���Ǵ�
 		�ؽ��Լ�(hash function)�� ������ ���Դϴ�.
 		�ؽ��� ������ ���� ��� ���� �ϳ��� �ٷ��� �����͸� �����ϰ�
 		�˻��ϴ� �� �����մϴ�.
 		�ؽ��Լ��� ã�����ϴ� ���� �Է��ϸ� �� ���� ����� ��ġ�� �˷��ִ�
 		�ؽ��ڵ带 ��ȯ�մϴ�.
 		
 	- Circle �ν��Ͻ� �� ���� ������ ���� �� �ν��Ͻ��� toString()��
 		ȣ���� ����� ����߽��ϴ�.
 		Circle Ŭ�������� Object Ŭ�����κ��� ��ӹ��� toString()��
 		�������̵� ���� �ʾұ� ������
 		Circle �ν��Ͻ��� toString()�� ȣ���ϸ�
 		Object Ŭ������ toString()�� ȣ��˴ϴ�.
 	
 */
package ex13_1_Object_toString;

class ObjectExample3 {
	public static void main(String args[]) {
		Circle2 obj1 = new Circle2(5);
		Circle2 obj2 = new Circle2(5);
		
		System.out.println(obj1.toString());
		//System.out.print()�� System.out.println()�޼ҵ忡
		//���ڿ��� �ƴ� ��ü�� �Ѱ��ָ� �� �޼ҵ� �ȿ��� ����������
		//toString�޼ҵ尡 ȣ��˴ϴ�.
		System.out.println(obj1);
		
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}
}
