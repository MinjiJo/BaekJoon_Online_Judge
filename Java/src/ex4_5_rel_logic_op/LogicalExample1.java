//�� ������
package ex4_5_rel_logic_op;

public class LogicalExample1 {
	public static void main(String[] args) {
		boolean a = 4 > 3;
		boolean b = 5 > 7;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		if (a && b) {
			System.out.println("a&&b�� ��");
		}
		
		if (a || b) {
			System.out.println("a||b�� ��");
		}
	}
}
