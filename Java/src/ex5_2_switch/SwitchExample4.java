//SwitchExample4.java�� �̿��ؼ�
//�� ���� ������ �����ڸ� �Է¹޾� �����ڿ� ���� ��� ����ϴ� ���α׷�
/*
	���� 1�� �Է��ϼ���>10
	���� 2�� �Է��ϼ���>2
	�����ڸ� �Է��ϼ���>+
	10+2=12
	
	��, �����ڰ� "+", "-", "*", "/", "%" �̿��� ���
	"+, -, *, /, % �� �Ѱ��� �Է��ϼ���."�� ����մϴ�.
 */
package ex5_2_switch;

import java.util.Scanner;

public class SwitchExample4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���.>");
		int n1 = sc.nextInt();
		
		System.out.print("������ �� �� �� �Է��ϼ���.>");
		int n2 = sc.nextInt();
		
		System.out.print("������(+, -, *, /, %) �� �ϳ��� �����Ͽ� �Է��ϼ���>");
		String op = sc.next();
		
		int result;
		
		switch(op) {
		case "+" :
			result = n1 + n2;
			System.out.println(n1+op+n2+"="+result);
			break;
			
		case "-" :
			result = n1 - n2;
			System.out.println(n1+op+n2+"="+result);
			break;
			
		case "*" :
			result = n1 * n2;
			System.out.println(n1+op+n2+"="+result);
			break;
			
		case "/" :
			double result2 = (double)n1 / n2;
			System.out.println(n1+op+n2+"="+result2);
			break;
			
		case "%" :
			result = n1 + n2;
			System.out.println(n1+op+n2+"="+result);
			break;
			
		default :
			System.out.println("������(+, -, *, /, %) �� �ϳ��� �����Ͽ� �Է��ϼ���.");
		}
		
		sc.close();
	}
}
