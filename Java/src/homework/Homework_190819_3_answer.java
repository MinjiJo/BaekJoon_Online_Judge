package homework;

public class Homework_190819_3_answer {
	public static void main(String[] args) {
		// ù for�� �� ���� ������ �ϰ�, ���� for�� �� ������ �����߰ڴٰ� �Ӹ������� ������ ��� ���� �����ؾ� ��
		for (int i = 1; i <= 5; i++) {		//i=1		i=2		i=3
			for (int j = 1; j <= i; j++)	//j=1~1		j=1~2	j=1~3
				System.out.print("*");
			System.out.println();
		}
		
		/* �޸��忡 ���鼭 �����غ��ƾ� ��.
		 * �� ���� ������ �� ���� �������� ���ƾ� ��.
		 * ��! ���� ���̳�!
		 * �ϸ� �̸� Ȱ���ϴ� ���� 	�������� ���!
		 * 
		 * i=1		i=2		i=3		i=4		i=5
		 * j=1~5	j=1~4	j=1~3	j=1~2	j=1~1	j=1~(6-i)
		 * 
		 * i=5		i=4		i=3		i=2		i=1
		 * j=1~5	j=1~4	j=1~3	j=1~2	j=1~1	j=1~i
		 */
		
		/*
		 * i=1		i=2		i=3		i=4		i=5
		 * j=1~1	j=1~3	j=1~5	j=1~7	j=1~9	j=1~(2*i-1)
		 * 
		 * ���� 5		4		3		2		1		6-i
		 */
		
		System.out.println("======");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++)
				System.out.println("*");
			System.out.println();
		}
		
		System.out.println("=========");
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%" + (6-i) + "s", "");	// ���ڿ��� + �Ǹ� ��� ���ڿ��� �ǹǷ� �� ������ ����
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// �̰� �� �����ϰ� �Ǹ� 5���� ���� �� ���� ������ �Է��� ���� �����ϵ��� �����⵵ ��. �׷��� 5, 6 �� �κ��� �ٲپ�� ��.
	}
}
