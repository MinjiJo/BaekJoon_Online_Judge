//clone() �޼ҵ�� ��ü�� �����ϴ� ����� �մϴ�.
//��, �Ȱ��� ���� ���� ��ü�� �� �� �� ����ϴ�.
//���� �����Ѥ� Ŭ������ ���ؼ��� ȣ���� �� �ִ�.
//���� ������ Ŭ������ Cloneable �������̽� ���� �����Դϴ�.

//Cloneable �������̽��� ������ GregorianCalendar Ŭ������ ���ؼ�
//clone()�޼ҵ带 ȣ���ϴ� ����
package ex13_8_clone_0;
import java.util.GregorianCalendar;
class ObjectExample1 {
		
	public static void main(String[] args) {
		//��ü�� �����մϴ�.
		GregorianCalendar obj1 = new GregorianCalendar(2019,8,3);
		
		//clone �޼���� ��ü�� �����մϴ�.
		Object tmp = obj1.clone();
		GregorianCalendar obj2 = (GregorianCalendar)tmp;
		//�� �� ������ �� �������� ǥ���ϸ� ������ �����ϴ�.
		//GregorianCalendar obj2 =
		// (GregorianCalendar)obj1.clone();
		
		//%tF : ���� ���ڴ� ��¥�� YYYY-MM-DD �������� �����ϴ� ������ �Ѵ�.
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		
		obj1.set(2020, 1, 6);
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
	}
}
