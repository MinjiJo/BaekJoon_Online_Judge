//Numbers 객체의 메소드가 익셉션을 발생하는 예를 보여주는 프로그램
//0으로 나눈 경우 에러 발생 - java.lang.ArithmeticException
package ex7_11_method_exception;

public class Number_main1_error {
	public static void main(String args[]) {
		int arr[] = new int[0];			// 길이가 0인 배열을 생성
		Numbers obj = new Numbers(arr);
		int average = obj.getAverage();	//이 메소드 안에서 익셉션이 발생
		System.out.println("평균 = " + average);
	}
}
