package ex4_5_rel_logic_op;

public class LogicalExample8 {
	public static void main(String[] args) {
		int a = 20, b = 20;
		if (a >= 20 && ++b >= 20) { // a>=20�� ���̱⿡ ++b>=20 ������
			System.out.println("��" + b);
		} else {
			System.out.println("����");
		}
		System.out.println(b);
		System.out.println("=====================");
		
		a = 10;
		b = 20;
		if (a >= 20 && ++b >= 20) { // a>=20 �����̱⿡ ++b>=20 �������
			System.out.println("��" + b);
		} else {
			System.out.println("����");
		}
		System.out.println(b);
	}
}
