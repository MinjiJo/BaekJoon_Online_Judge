package ex5_5_for;

public class ForExample4_9dan {
	public static void main(String[] args) {
		System.out.println("=== 구구단 ===");

		int i, dan;

		for (i = 1; i <= 9; i++) {
			if (i == 1) {
				for (dan = 2; dan <= 9; dan++) {
					System.out.printf("%c%d%c%c\t", '[', dan, '단', ']');
				}
			}
			System.out.println();
			for (dan = 2; dan <= 9; dan++) {
				System.out.printf("%d%c%d%c%d\t", dan, '*', i, '=', dan * i);
			}//dan end
		}//i end
	}//main end
}//class end