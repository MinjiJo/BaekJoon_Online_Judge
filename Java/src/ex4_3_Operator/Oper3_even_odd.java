//��� ������ %�� �̿��� �Է��� ������ ¦���� Ȧ���� ���ϴ� ���α׷�
package ex4_3_Operator;
import java.io.InputStream;
import java.util.Scanner;

public class Oper3_even_odd {

	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner 	sc = new 	Scanner(is);
//		Ŭ������		��ü	 ������	������ ȣ��
		
		System.out.print("������ �Է��ϼ���>");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {			// ¦��
			System.out.println(n + "�� ¦���Դϴ�.");
		} else {				// Ȧ��
			System.out.println(n + "�� Ȧ���Դϴ�.");
		}
		sc.close();
		
		/*
		int data=10;
		int pandan = data % 2;
		System.out.println("data%2�� ���� " + pandan + "�Դϴ�.");
		sc.close();
		*/
		
	}
}
