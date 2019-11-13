//�̱���(Singleton)
package ex7_18_singleton;

public class Singleton {
	// �ʵ� s�� �ܺο��� ��� ���մϴ�.
	// �� ������ ó�� Singleton Ŭ������ JVM�� �ε��� �� �� ���� ����˴ϴ�.
	private static Singleton s = new Singleton();

	// private : �ܺο��� �����ڸ� ȣ���� �� ������ �����ϴ�.
	private Singleton() {}

	public static Singleton getInstance() {
		System.out.println("����� getInstance�Դϴ�.");
		return s;
	}
}
