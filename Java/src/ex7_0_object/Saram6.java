//��� ����(�ʵ�)�� �Ű� ������ �̸��� ���� ��� this ���
package ex7_0_object;

public class Saram6 {
	String name;
	double w;
	double ki;
	int age;

	// ������ - �ݵ�� Ŭ���� �̸��� �Ȱ��� ���� Ÿ���� ����� �մϴ�.
	Saram6(String name, int w, int ki, int age) {
		this.name = name;
		this.w = w;
		this.ki = ki;
		this.age = age;
	}

	// �޼���
	public void eat() {
		System.out.println(name + "�� Ű�� " + ki + "�̴�.");
	}

	// �޼���
	public void walk() {
		System.out.println(name + "��(��) �ȱ��� �����Դ� " + w + "�Դϴ�.");
	}

	// �޼���
	public void sesu() {
		System.out.println(name + "��(��) �����Ѵ�.");
	}
}
