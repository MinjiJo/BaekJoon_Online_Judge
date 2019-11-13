package ex6_2_method_intro;

public class MethodExample1_2_2 {

	//접근제어자	객체생성안해도실행가능	반환형		메서드이름(매개변수 목록)
			public		static	 		void		main(String args[]) {
				sum(1, 10);
				sum(1, 100);
				sum(1, 1000);
			}
			
			public static void sum(int start, int end) {
				
				int sum = 0;
				for(int i = start; i <= end; i++) {
					sum += i;
				}
					System.out.println("합("+start+","+end+") : " + sum);
					return;
				
			}
}
