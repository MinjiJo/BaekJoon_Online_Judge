//���� �Է��ϴ� Scanner Ŭ������ ����� ���ô�.
//Scanner Ŭ������ java.util ��Ű���� �ֽ��ϴ�.
//nextInt() : Ű����κ��� �������� ���� �Է� �޴� �޼����Դϴ�.
package ex4_3_Operator;
import java.io.InputStream;
import java.util.Scanner;

public class Oper2_input {
	public static void main(String[] args) {
		//System.in�� Ű����� �����͸� �Է� ���� �� ����մϴ�.
		InputStream is = System.in;
//		Ŭ������		��ü		������	������ ȣ��		
		Scanner 	sc	 =	 new 	Scanner(is);
		
		System.out.print("������ �Է� �ϼ���>");//���� �Է� �� ����
		int a = sc.nextInt();//������ �о� ���� a�� �����մϴ�.
		
		System.out.println("�Է°��� " + a + "�Դϴ�.");
		
		System.out.print("������ �Է� �ϼ���>");
		int b = sc.nextInt();
		
		System.out.println("�Է°��� " + b + "�Դϴ�.");
		sc.close();
	}
}
