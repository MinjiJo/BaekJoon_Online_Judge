//메소드가 밖으로 던지는 익셉션을 처리하는 프로그램
package ex7_11_method_exception;

public class Number_main2 {
	public static void main(String args[]) {
		int arr[] = new int[0];			// 길이가 0인 배열을 생성
		Numbers obj = new Numbers(arr);
		try {	// 오류가 발생할 수 있는 식을 넣어줌
			int average = obj.getAverage();
			System.out.println("평균 = " + average);
		}
		catch(ArithmeticException e) {
			System.out.println("평균을 계산하는 도중 에러가 발생했습니다.");
		}
		
	}
}
