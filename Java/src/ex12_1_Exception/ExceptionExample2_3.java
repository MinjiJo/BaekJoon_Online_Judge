//unchecked exception에 해당 - 컴파일 에러 없음
//실행시 에러 발생 - 예외 발생
package ex12_1_Exception;

class ExceptionExample2_3 {
	public static void main(String args[]) {
		int num1 = 3, num2 = 0;
		try {
			int result = num1 / num2;
			System.out.println(result);
		} catch (java.lang.ArithmeticException e) {
			System.out.println("예외 발생");
		}
	}
}
