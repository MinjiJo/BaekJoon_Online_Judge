package ex4_3_Operator;
import java.io.InputStream;
import java.util.Scanner;

public class Jominji {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		double n1, n2, result;
		
		System.out.print("������ �Է��ϼ���>");
		n1 = sc.nextInt();
		
		System.out.print("������ �� �� �� �Է��ϼ���>");
		n2 = sc.nextInt();
		
		System.out.print("������(+, -, *, /) �� �ϳ��� �����Ͽ� �Է��ϼ���>");
		String op = sc.next();
		
		if(op.equals("+")) {
			result = n1+n2;
			System.out.printf("%.0f%s%.0f=%.0f", n1, op, n2, result);
		} 
		
		if(op.equals("-")) {
			result = n1-n2;
			System.out.printf("%.0f%s%.0f=%.0f", n1, op, n2, result);
		}
		
		if(op.equals("*")) {
			result = n1*n2;
			System.out.printf("%.0f%s%.0f=%.0f", n1, op, n2, result);
		}
		
		if(op.equals("/")) {
			result = n1/n2;
			System.out.printf("%.0f%s%.0f=%.1f", n1, op, n2, result);
		} 
		
		/*	����
		 		p or q
		 	����
		 	 =>	~(p or q)
		 	 => ~p && ~q
		 	 
		 	 	p and q
		 	 ����
		 	 => ~(p and q)
		 	 => ~p or ~q
		 */
		
		if(!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))){
			System.out.print("+, -, *, / �� �ϳ��� �����ϼ���");
		}
		
		/*
		if(!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")){
			System.out.print("+, -, *, / �� �ϳ��� �����ϼ���");
		}
		*/
		
		sc.close();
	}
}
