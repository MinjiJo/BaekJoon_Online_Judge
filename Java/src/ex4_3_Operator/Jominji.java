package ex4_3_Operator;
import java.io.InputStream;
import java.util.Scanner;

public class Jominji {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		
		double n1, n2, result;
		
		System.out.print("정수를 입력하세요>");
		n1 = sc.nextInt();
		
		System.out.print("정수를 한 번 더 입력하세요>");
		n2 = sc.nextInt();
		
		System.out.print("연산자(+, -, *, /) 중 하나를 선택하여 입력하세요>");
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
		
		/*	명제
		 		p or q
		 	부정
		 	 =>	~(p or q)
		 	 => ~p && ~q
		 	 
		 	 	p and q
		 	 부정
		 	 => ~(p and q)
		 	 => ~p or ~q
		 */
		
		if(!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))){
			System.out.print("+, -, *, / 중 하나를 선택하세요");
		}
		
		/*
		if(!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")){
			System.out.print("+, -, *, / 중 하나를 선택하세요");
		}
		*/
		
		sc.close();
	}
}
