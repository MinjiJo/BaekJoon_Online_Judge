package ex3_4_casting;

public class CastingEx2 {
	public static void main(String[] args) {
		
		//int -> char(����� ��ȯ)
		int i3 = 97;
		char c1 = 		(char) i3;
		System.out.println("i3 �����ʹ� " + i3 + "�Դϴ�.");
		System.out.println("c1 �����ʹ� " + c1 + "�Դϴ�.");
		
		i3 = 65;
		c1 = (char)i3;
		System.out.println("i3 �����ʹ� " + i3 + "�Դϴ�.");
		System.out.println("c1 �����ʹ� " + c1 + "�Դϴ�.");
		
		//char -> int (�ڵ� ����ȯ)
		i3='A'; //�����ڵ� 'A'�� �ش��ϴ� ���� ������ ���� i3�� �����ض�
		System.out.println("i3='A' �����ʹ� " + i3 + "�Դϴ�.");
		
		i3='��'; //�����ڵ� '��'�� �ش��ϴ� ���� ������ ���� i3�� �����ض�
		System.out.println("i3='��' �����ʹ� " + i3 + "�Դϴ�.");
	}
}
