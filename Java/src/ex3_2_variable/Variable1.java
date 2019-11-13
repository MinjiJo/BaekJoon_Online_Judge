//기본형 변수의 값을 출력해 봅니다.
//변수 : 단 하나의 값을 저장할 수 있는 메모리 공간
package ex3_2_variable;

public class Variable1 {
	public static void main(String[] args) {
		System.out.println("==============정수형 변수==============");
		//정수형변수
		byte b = 10; //1바이트(작은 범위의 값을 저장하기에 유용합니다.
		short s = 100;  //2바이트
		int i = 1000;   //4바이트
		
		//8바이트(l[소문자 엘] 또는 L을 숫자 뒤에 붙입니다.)
		long l = 10000L;
		System.out.println(b);	//변수 b의 값을 출력하라는 의미입니다.
		//문자열 + 변수의 경우 문자열 내용이 출력되고 b의 값이 출력됩니다.
		System.out.println("b=" + b);
		System.out.println("s=" + s);
		System.out.println("i=" + i + " l=" +l);
		
		System.out.println(b + s + i + l);
		System.out.println(" " + b + s + i + l);
		
		System.out.println("==============실수형 변수==============");
		// 실수형 변수
		//f나 F를 숫자 뒤에 붙입니다.
		float ft = 3.14f;
		
		//d나 D를 숫자 뒤에 붙이거나 생략할 수 있습니다.
		double d = 42.195d;
		System.out.println("f=" + ft + " d=" + d);
		
		/* 컴퓨터가 숫자밖에 모르기 때문에 문자가 숫자로 변환되어 저장되는데
		 어떤 기준으로 저장할까요?
		 * 'A'	-> 	65
		   : 문자를 코드로 변환하는 것을 문자 인코딩(encoding)이라고 합니다.
		 * 65	-> 	'A'
		   : 코드를 문자로 변환하는 것을 문자 디코딩(decoding)이라고 합니다.
		 */
		
		System.out.println("==============문자형 변수==============");
		// 문자형 변수 - 하나의 문자를 나타낼 수 있는 자료형으로
		// 16비트의 유니코드를 사용합니다.
		char c1 = 'A';// 2byte
		char c2 = '@';
		char c3 = '가';
		System.out.println("c1=" + c1 + " c2=" + c2 + " c3=" + c3);
		
		//문자형에 정수를 배정하면 정수에 해당하는 유니코드를 찾아서
		//변수에 저장합니다.
		char c4 = 65;		// 영문 'A'를 의미
		char c5 = '\uAC00';	// 한글 유니코드 '가'를 의미
		System.out.println("c4=" + c4 + " c5=" + c5);
		
		char c6 = 0101;			// 0으로 시작하면 8진수를 의미
		char c7 = 0x41;			// 0x로 시작하면 16진수를 의미
		char c8 = 0b00001000001; // 0b로 시작하면 2진수를 의미
		System.out.println("8진수 0101=" + c6 + "\n"
							+ "16진수 0x41=" + c7
							+ "\n 2진수 0b00001000001=" + c8);
		
		System.out.println("==============논리형 변수==============");
		// 논리형 변수
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1은 참인 " + b1);
		System.out.println("b2는 거짓인 " + b2);
	}
}
