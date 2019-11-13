package ex5_3_while;

public class WhileExample1 {
	public static void main(String[] args) {
		int cnt = 0;
		while (cnt < 10) {				// 0<10	1<10 2<10 ..... 9<10 10<10
			System.out.println(cnt);	//  0	 1	  2			 9
			cnt++;						//  1    2	  3			 10
		}
		System.out.println("===== 1 =====");
		
		// cnt++; 를 없애봅시다.
		cnt = 0;
		while (cnt < 10) {
			System.out.println(cnt++);
		}
		System.out.println("===== 2 =====");
		
		cnt = -1;
		while (++cnt < 10) {
			System.out.println(cnt);
			
		}
		System.out.println("===== 3 =====");
		
		cnt = -1;
		while (cnt++ < 9) {
			System.out.println(cnt);
			
		}
		System.out.println("===== 4 =====");
	}
}
