package ex4_3_Operator;
import java.io.InputStream;
import java.util.Scanner;

public class Oper4_test_answer {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner 	sc = new 	Scanner(is);
		
		int n1, n2, result;
		
		System.out.print("������ �Է� �ϼ���>");
		n1 = sc.nextInt();
		
		System.out.print("������ �� �� �� �Է� �ϼ���>");
		n2 = sc.nextInt();
		
		System.out.print("������(+)�� �Է��ϼ���>");
		String op = sc.next(); //next() : Ű����κ��� ���ڿ��� ������ �Է¹޴� �޼���
		
		if(op.equals("+")) {
			result = n1 + n2;
			System.out.println(n1 + op + n2 + "=" + result);
		}else {
			System.out.println("+�� �Է��ϼ���");
		}
		sc.close();
	}
}
