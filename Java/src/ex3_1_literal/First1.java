package ex3_1_literal;

public class First1 {
	public static void main(String args[]) {
		/*
		 * 1. System.out.println() : ��ȣ���� ������ ����� �� �� ���� ���ϴ�. 2. System.out.print() :
		 * ��ȣ���� ������ ����� �� �� ���� ���� �ʰ� �����մϴ�. 3. System.out.printf() : ������ �����ؼ� ����մϴ�. ����)
		 * System.out.printf("���� �����", ������) ������: %�� �����ϴ� ���� ������ �������� ������ ��ġ�ؾ� �մϴ�.
		 */
		// ���ͳ�(literal) - �� ��ü�� ���� �ǹ��ϴ� ��
		System.out.println("��¼���!!"); // ���ڿ�
		System.out.println(30); // ����
		System.out.println(3.14); // �Ǽ�
		System.out.println('A'); // ����
		System.out.println(true); // ��(�Ҹ�)
		System.out.println(false);
		System.out.println("���ڿ� ���"); // ���ڿ�
		System.out.println("====== println() �� ========"); // ���ڿ�

		System.out.print("��¼���!!"); // ���ڿ�
		System.out.print(30); // ����
		System.out.print(3.14); // �Ǽ�
		System.out.print('A'); // ����
		System.out.print(true); // ��(�Ҹ�)
		System.out.print(false);
		System.out.print("���ڿ� ���"); // ���ڿ�
		System.out.println("====== print() �� ========"); // ���ڿ�

		// ���ڿ� "�ڹ����"�� ���ڿ� ����(%s)���� ����ض�
		System.out.printf("%s", "�ڹ����");

		// �Ǽ� 42.195�� �Ǽ� ����(%f)���� ����ض�
		// (�⺻ �Ҽ������� 6�ڸ�)
		System.out.printf("%f", 42.195);
		System.out.println();

		// �Ǽ� 42.195�� �Ǽ� ���� �Ҽ��� ���� 2�ڸ�(%.2f)�� ����ض�
		System.out.printf("%.2f\n", 42.195); // \n �ٹٲ�

		// ���� 42�� ���� ����(%d)���� ����ض�
		System.out.printf("%d", 42);

		// ���� 'A'�� ���� ����(%c)���� ����ض�
		System.out.printf("%c", 'A');

		// ���� - ���� �̸��� ȫ�浿, ���� ���̴� 21��
		System.out.println();
		System.out.println();
		System.out.printf("%s", "���� �̸��� ȫ�浿, ");
		System.out.printf("%s", "���� ���̴� ");
		System.out.printf("%d", 21);
		System.out.printf("%c", '��');
		System.out.printf("\n���� �̸��� %s, ���� ���̴� %d��", "ȫ�浿", 21);

		System.out.println("\nȣȣ����");
		System.out.println("\"ȣȣ����\"");
		System.out.println("ȣȣ����\n");
		System.out.println("ȣȣ\t����");
		System.out.println("ȣȣ\\����");

	}
}
