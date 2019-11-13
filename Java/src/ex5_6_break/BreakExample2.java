package ex5_6_break;

public class BreakExample2 {
	public static void main(String[] args) {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.println("(" + row + ", " + col + ")");
				if ((row == 1) && (col == 3))
					break;	//break를 내포하는 반복문 밖으로 제어가 이동합니다.
			}
		}
		System.out.println("끝.");
	}
}
