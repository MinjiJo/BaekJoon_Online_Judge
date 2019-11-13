package ex13_9_Object_getClass_2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/*
 * Class ��ü�� �̿��ϸ� Ŭ������ ������, �ʵ�, �޼��� ������ �� �� �ֽ��ϴ�.
 * �̰��� Reflection�̶�� �մϴ�.
 * ��, ��ü�� ���� Ŭ������ ������ �м��� ���� ���α׷� ����� �ǹ��մϴ�.
 */
class ObjectExample {
	public static void main(String args[]) {
		Rectangle obj = new Rectangle(10, 20);
		//getClass() : ��ü�� ���ϴ� Ŭ������ ������ �˾Ƴ��� �޼ҵ�
		//getClass �޼ҵ�� ��ü�� ���ϴ� Ŭ������ ������
		//Class Ÿ���� ��ü�� ���� ����
		Class cls = obj.getClass();
		
		//getName() : Ŭ������ �̸��� �����ϴ� �޼ҵ�
		String name = cls.getName();
		System.out.println("��Ű�� ������ Ŭ���� �̸� : " + name);
		System.out.println("��Ű�� ������ Ŭ���� �̸� : " + cls.getSimpleName());
		
		//���� Ŭ������ ������ �����ϴ� �޼ҵ�
		Class superCls = cls.getSuperclass();
		
		//���� Ŭ������ �̸��� �����ϴ� �޼ҵ�
		String superName = superCls.getName();
		System.out.println("����Ŭ���� �̸� : " + superName);
		
		//Ŭ������ ����Ǿ� �ִ� �ʵ� ������ �������� �޼ҵ�
		Field field[] = cls.getDeclaredFields();
		System.out.println("�ʵ�: ");
		for (int cnt = 0; cnt < field.length; cnt++)
			System.out.println("	" + field[cnt]);
		
		//Ŭ������ ����Ǿ� �ִ� �޼ҵ� ������ �������� �޼ҵ�
		Method method[] = cls.getDeclaredMethods();
		System.out.println("�޼���: ");
		for (int cnt = 0; cnt < method.length; cnt++)
			System.out.println("	" + method[cnt]);
	}
}
