package ex6_2_method_intro;

public class MethodExample1_2_3 {
	//접근제어자	객체생성안해도실행가능	반환형		메서드이름(매개변수 목록)
	public		static	 		void		main(String args[]) {
		int result = sum(1, 10);
		System.out.println("합(1, 10) : " + result);
		
		result = sum(1, 100);
		System.out.println("합(1, 100) : " + result);
		
		result = sum(1, 1000);
		System.out.println("합(1, 1000) : " + result);
		
		System.out.println("합(1, 10) : " + sum(1, 10));
		System.out.println("합(1, 100) : " + sum(1, 100));
		System.out.println("합(1, 1000) : " + sum(1, 1000));
	}
	//			    반환형
	public static int sum(int start, int end) {
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		/*	System.out.println("합("+start+","+end+") : " + sum);
			return;
		*/
		return sum;
	}
}
