package ex5_3_while;

public class WhileExample3 {
	public static void main(String[] args) {
		int cnt = 1;
		System.out.println("======Ȧ��======");
		while (cnt*2-1 <= 10) {
			System.out.println(cnt++*2-1);
		}

		cnt = 1;
		System.out.println("======¦��======");
		while (cnt*2 <=10) {
			System.out.println(cnt++*2);
		}
		
		System.out.println("======Ȧ���� ��======");
		int sum = 0;
		int i = 1;
		while (i < 10) {
			sum = sum + i;
			i += 2;
		}
		System.out.println("1~10������ Ȧ���� �� = " + sum);
		
		System.out.println("======¦���� ��======");
		sum = 0;
		i = 2;
		while (i <= 10) {
			sum = sum + i;
			i += 2;
		}
		System.out.println("1~10������ ¦���� �� = " + sum);
	}
}
