package ex5_3_while;

public class WhileExample3 {
	public static void main(String[] args) {
		int cnt = 1;
		System.out.println("======È¦¼ö======");
		while (cnt*2-1 <= 10) {
			System.out.println(cnt++*2-1);
		}

		cnt = 1;
		System.out.println("======Â¦¼ö======");
		while (cnt*2 <=10) {
			System.out.println(cnt++*2);
		}
		
		System.out.println("======È¦¼öÀÇ ÇÕ======");
		int sum = 0;
		int i = 1;
		while (i < 10) {
			sum = sum + i;
			i += 2;
		}
		System.out.println("1~10±îÁöÀÇ È¦¼öÀÇ ÇÕ = " + sum);
		
		System.out.println("======Â¦¼öÀÇ ÇÕ======");
		sum = 0;
		i = 2;
		while (i <= 10) {
			sum = sum + i;
			i += 2;
		}
		System.out.println("1~10±îÁöÀÇ Â¦¼öÀÇ ÇÕ = " + sum);
	}
}
