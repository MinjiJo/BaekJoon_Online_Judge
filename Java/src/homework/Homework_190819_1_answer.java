package homework;

public class Homework_190819_1_answer {
	public static void main(String[] args) {
		
		// 8�� �޷� ����ϱ�
				// 1~31���� 1�� �����ϰ� �� �ٿ� 7���� ����ϱ�
				int j = -4;
				while (++j <= 31) { // j�� 1������ �� j<=31�� ���մϴ�.
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
