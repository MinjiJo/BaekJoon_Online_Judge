package homework;

public class Homework_190819_3_answer {
	public static void main(String[] args) {
		// 첫 for는 줄 수를 돌려야 하고, 안의 for는 별 갯수를 돌려야겠다고 머릿속으로 개념을 잡아 놓고 시작해야 함
		for (int i = 1; i <= 5; i++) {		//i=1		i=2		i=3
			for (int j = 1; j <= i; j++)	//j=1~1		j=1~2	j=1~3
				System.out.print("*");
			System.out.println();
		}
		
		/* 메모장에 쓰면서 생각해보아야 함.
		 * 두 개를 합했을 때 같은 값인지를 보아야 함.
		 * 오! 같은 값이네!
		 * 하면 이를 활용하는 것이 	베이직한 방법!
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
		 * 공백 5		4		3		2		1		6-i
		 */
		
		System.out.println("======");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++)
				System.out.println("*");
			System.out.println();
		}
		
		System.out.println("=========");
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%" + (6-i) + "s", "");	// 문자열이 + 되면 모두 문자열이 되므로 이 형식이 가능
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 이게 더 발전하게 되면 5줄이 될지 몇 줄이 될지를 입력한 값을 산출하도록 나오기도 함. 그러면 5, 6 이 부분이 바꾸어야 함.
	}
}
