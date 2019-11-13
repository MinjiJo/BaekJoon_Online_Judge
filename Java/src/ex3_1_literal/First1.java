package ex3_1_literal;

public class First1 {
	public static void main(String args[]) {
		/*
		 * 1. System.out.println() : 괄호안의 내용을 출력한 후 한 행을 띄웁니다. 2. System.out.print() :
		 * 괄호안의 내용을 출력한 후 한 행읠 띄지 않고 유지합니다. 3. System.out.printf() : 서식을 지정해서 출력합니다. 형식)
		 * System.out.printf("포맷 명시자", 데이터) 주의점: %로 시작하는 포맷 갯수와 데이터의 갯수가 일치해야 합니다.
		 */
		// 리터널(literal) - 그 자체로 값을 의미하는 것
		System.out.println("출력성공!!"); // 문자열
		System.out.println(30); // 정수
		System.out.println(3.14); // 실수
		System.out.println('A'); // 문자
		System.out.println(true); // 논리(불린)
		System.out.println(false);
		System.out.println("문자열 출력"); // 문자열
		System.out.println("====== println() 끝 ========"); // 문자열

		System.out.print("출력성공!!"); // 문자열
		System.out.print(30); // 정수
		System.out.print(3.14); // 실수
		System.out.print('A'); // 문자
		System.out.print(true); // 논리(불린)
		System.out.print(false);
		System.out.print("문자열 출력"); // 문자열
		System.out.println("====== print() 끝 ========"); // 문자열

		// 문자열 "자바출력"을 문자열 서식(%s)으로 출력해라
		System.out.printf("%s", "자바출력");

		// 실수 42.195를 실수 서식(%f)으로 출력해라
		// (기본 소수점이하 6자리)
		System.out.printf("%f", 42.195);
		System.out.println();

		// 실수 42.195를 실수 서식 소수점 이하 2자리(%.2f)로 출력해라
		System.out.printf("%.2f\n", 42.195); // \n 줄바꿈

		// 정수 42를 정수 서식(%d)으로 출력해라
		System.out.printf("%d", 42);

		// 문자 'A'를 문자 서식(%c)으로 출력해라
		System.out.printf("%c", 'A');

		// 문제 - 나의 이름은 홍길동, 나의 나이는 21세
		System.out.println();
		System.out.println();
		System.out.printf("%s", "나의 이름은 홍길동, ");
		System.out.printf("%s", "나의 나이는 ");
		System.out.printf("%d", 21);
		System.out.printf("%c", '세');
		System.out.printf("\n나의 이름은 %s, 나의 나이는 %d세", "홍길동", 21);

		System.out.println("\n호호하하");
		System.out.println("\"호호하하\"");
		System.out.println("호호하하\n");
		System.out.println("호호\t하하");
		System.out.println("호호\\하하");

	}
}
