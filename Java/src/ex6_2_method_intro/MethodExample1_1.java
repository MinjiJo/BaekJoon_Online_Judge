package ex6_2_method_intro;

public class MethodExample1_1 {
	//접근제어자	객체생성안해도실행가능	반환형		메서드이름(매개변수 목록)
	public		static	 		void		main(String args[]) {
		//메서드 호출 방법1 - 클래스명.정적메서드(static이 있는 경우가 정적메서드라는 뜻)
		MethodExample1_1.printCharacter('*', 30);//메서드 호출
		MethodExample1_1.printCharacter('-', 30);//메서드 호출
		System.out.println("Hello, Java");
		MethodExample1_1.printCharacter('-',  30);
		MethodExample1_1.printCharacter('*', 30);
		
		//메서드 호출 방법2
		printCharacter('*', 30);
		printCharacter('-', 30);//인자
		System.out.println("Hello, Java");
		printCharacter('-', 30);
		printCharacter('*', 30);
		return;//반환형이 void인 경우 생략가능합니다.
	}
	
	//메서드 정의
	public static void printCharacter(char ch, int num) {
		for (int cnt = 0; cnt < num; cnt++)
			System.out.print(ch);
		System.out.println();
		return; //반환형이 void인 경우 생략 가능합니다.
	}
}
