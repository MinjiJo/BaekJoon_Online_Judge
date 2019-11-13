package ex4_5_rel_logic_op;

//�ܶ� ��(short circuit evaluation)
// &&������ ��� ù ��° �ǿ����ڸ� ���ؼ� false�� ���
// �ι�° �ǿ����ڸ� ������ �ʰ� false�� ��ȯ�մϴ�.
// || ������ ��� ù��° �ǿ����ڸ� ���ؼ� true�� ���
// �ι�° �ǿ����ڸ� ������ �ʰ� true�� ��ȯ�մϴ�.
public class LogicalExample7 {

	public static void main(String[] args) {
		int a = 20, b = 20;
		if (a >= 20 || ++b >= 20) { // a>=20�� ���̹Ƿ� �� ��° �ǿ����ڴ� ������ �ʴ´�.
			System.out.println("��" + b);
		} else {
			System.out.println("����");
		}
		System.out.println(b);
		
		a = 10;
		b = 20;
		if (a >= 20 || ++b >= 20) { // a>=20�� �����̹Ƿ� �� ���� �ǿ����ڸ� ���մϴ�.
			System.out.println("��" + b);
		} else {
			System.out.println("����");
		}
		System.out.println(b);
	}
}
