// double -> int �� ��ȯ ����
package ex3_4_casting;

public class CastingEx1 {
	public static void main(String[] args) {
		//������ ���� i1�� 10�� �����մϴ�.
		int i1=10;
		
		double d1=i1;//�Ǽ��� ������ ������ ���� ������ �� �ֽ��ϴ�.
		System.out.println("d1 �����ʹ� " + d1 + "�Դϴ�.");
		
		//	���� �߻� -> �����
		double d2=10.12345;
		//int i2 = d2;//������ ������ �Ǽ��� ���� ������ �� �����ϴ�.
		int i2= (int) d2; //int�� �ڸ��ٴ� ��
		System.out.println("i2 �����ʹ� " + i2 + "�Դϴ�.");
	}
}
