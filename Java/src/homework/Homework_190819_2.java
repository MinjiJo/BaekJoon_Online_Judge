package homework;

public class Homework_190819_2 {
	public static void main(String[] args) {

		int i, sum;
		
		System.out.println("=========1~10���� Ȧ�� ����ϱ�=========");
		i = 1;
		do {
			System.out.println(i);
			i += 2;
		} while(i<=10);
		
		System.out.println("=========1~10���� ¦�� ����ϱ�=========");
		i = 2;
		do {
			System.out.println(i);
			i += 2;
		} while(i<=10);

		System.out.println("=========1~10���� �� ���ϱ�=========");
		i = 1;
		sum = 0;
		do {
			sum += i++;
		} while(i<=10);
		System.out.println(sum);
		
		System.out.println("=========1~10���� Ȧ�� �� ���ϱ�=========");
		i = 1;
		sum = 0;
		do {
			sum = sum + i;
			i += 2;
		} while(i<=10);
		System.out.println(sum);
		
		System.out.println("=========1~10���� ¦�� �� ���ϱ�=========");
		i = 2;
		sum = 0;
		do {
			sum = sum + i;
			i += 2;
		} while(i<=10);
		System.out.println(sum);
	}
}
