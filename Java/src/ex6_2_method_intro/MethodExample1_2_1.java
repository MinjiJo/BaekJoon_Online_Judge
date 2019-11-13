package ex6_2_method_intro;

public class MethodExample1_2_1 {

	//접근제어자	객체생성안해도실행가능	반환형		메서드이름(매개변수 목록)
		public		static	 		void		main(String args[]) {
			sum(10);
			sum(100);
			sum(1000);
		}
		
		public static void sum(int num) {
			
			int num2 = 0;
			for(int i = 1; i <= num; i++) {
				num2 += i;
			}
			
			System.out.println("합(1~" + num + ") : " + num2);
			return; //void에서는 return 생략 가능
		}
}
