//unchecked exception을 던지는 메소드
//throws 절이 없어도 try~catch 문으로 예외 처리 가능
//정수는 0으로 나누는 것이 금지되어 ArithmeticException 발생합니다.
package ex12_1_Exception;

class ExceptionExample4_1 {
	public static void main(String args[]) {
		try {
			int result = devide(3, 0);
			System.out.println(result);
		} catch (java.lang.ArithmeticException e) {
			System.err.println("에러 발생");
			//e.printStackTrace();
		}
	}

	static int devide(int a, int b) {
		int result = a / b;
		return result;
	}
}
