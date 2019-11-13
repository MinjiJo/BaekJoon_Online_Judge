package ex4_5_rel_logic_op;

public class LogicalExample8 {
	public static void main(String[] args) {
		int a = 20, b = 20;
		if (a >= 20 && ++b >= 20) { // a>=20이 참이기에 ++b>=20 연산함
			System.out.println("참" + b);
		} else {
			System.out.println("거짓");
		}
		System.out.println(b);
		System.out.println("=====================");
		
		a = 10;
		b = 20;
		if (a >= 20 && ++b >= 20) { // a>=20 거짓이기에 ++b>=20 연산안함
			System.out.println("참" + b);
		} else {
			System.out.println("거짓");
		}
		System.out.println(b);
	}
}
