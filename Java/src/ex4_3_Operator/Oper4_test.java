package ex4_3_Operator;
import java.io.InputStream;
import java.util.Scanner;

public class Oper4_test {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner 	sc = new 	Scanner(is);
//		Ŭ������		��ü	 ������	������ ȣ��
		
		int n1, n2, result;
		
		System.out.print("������ �Է��ϼ���>");
		n1 = sc.nextInt();
		
		System.out.print("������ �� �� �� �Է��ϼ���>");
		n2 = sc.nextInt();
		
		System.out.print("������(+, -, *, /, %) �� �ϳ��� �����Ͽ� �Է��ϼ���");
		String op = sc.next(); //next() : Ű����κ��� ���ڿ��� ���� �Է� �޴� �޼����Դϴ�.
		
		if(op.equals("+")) {
			result = n1+n2;
		} else if(op.equals("-")) {
			result = n1-n2;
		} else if(op.equals("*")) {
			result = n1*n2;
		} else if(op.equals("/")) {
			result = n1/n2;
		} else {
			result = n1%n2;
		}
		
		System.out.println(n1 + op + n2 + "=" + result);
		
		sc.close();
	}
}