package ex5_6_break;

import java.util.Scanner;

public class BreakExample3_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String operator, keep;
		
		System.out.println("�� ���� ������(+, -, *, /, %)�� �Է��ϼ���>");
		
		do {System.out.print("��1>");
			a = sc.nextInt();
			System.out.print("��2>");
			b = sc.nextInt();
			System.out.print("������>");
			operator = sc.next();
			
			switch(operator) {
			case "+":
				System.out.println(a+operator+b+"="+(a+b));
				break;
			case "-":
				System.out.println(a+operator+b+"="+(a-b));
				break;
			case "*":
				System.out.println(a+operator+b+"="+(a*b));
				break;
			case "/":
				double result = (double)(a)/b;
				System.out.println(a+operator+b+"="+result);
				break;
			case "%":
				System.out.println(a+operator+b+"="+(a%b));
				break;
			default:
				System.out.println("+, -, *, /, % �� �� ���� �Է��ϼ���>");
			}
			
			System.out.println("��� �Է��Ͻðڽ��ϱ�?(N(n)�̸� ����. �� �� ���ڴ� ��� �Է�)");
			System.out.println("����Է�>");
			keep = sc.next();
			if ((keep.equals("N"))||(keep.equals("n")))
					break;
			//ä�켼��
		} while (true);
		System.out.println("��.");
		sc.close();
	}
}
