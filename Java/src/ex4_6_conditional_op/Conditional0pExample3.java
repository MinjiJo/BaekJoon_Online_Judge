//�빮�ڸ� �ҹ��ڷ� ������ ���� ���α׷�
package ex4_6_conditional_op;

public class Conditional0pExample3 {
	public static void main(String[] args) {
		char c = 'A', lower;
		/*
		'A' ~ 'Z' : 65 ~ 90;
		'a' ~ 'z' : 65 + 32(97) ~ 90 + 33(122)
		 */
		lower = ('A' <=c && c<='Z')?(char)(c+32):c;
		System.out.println(c + "=>" + lower);

		/* or
		 char c = 'A';
		 int num;
		 num = (c >= 65 && c <= 90) ? c + 32 : c;
		 
		 System.out.printf("%c => %c, c, num);
		 */
		
		/*
		boolean pandan = 'A' <= a && a <= 'Z';
		if (pandan) {
			System.out.println("�빮���Դϴ�.");
		} else {
			System.out.println("�빮�ڰ� �ƴմϴ�.");
		}
		
		pandan = 65 <= a && a <= 90;
		if (pandan) {
			System.out.println("�빮���Դϴ�.");
		} else {
			System.out.println("�빮�ڰ� �ƴմϴ�.");
		}
		*/
	}
}
