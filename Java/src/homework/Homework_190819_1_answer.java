package homework;

public class Homework_190819_1_answer {
	public static void main(String[] args) {
		
		// 8월 달력 출력하기
				// 1~31까지 1씩 증가하고 한 줄에 7개씩 출력하기
				int j = -4;
				while (++j <= 31) { // j를 1증가한 후 j<=31을 비교합니다.
					if (j >= 1) {
						System.out.printf("%5d", j);
						if (j % 7 == 3)
							System.out.println();
					}else {
						System.out.printf("%5s", "");
					}
				}
	}
}
