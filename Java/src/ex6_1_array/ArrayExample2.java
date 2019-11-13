//new에 의해 배열의 자동 초기화 - int형 : 0, double형 : 0.0
package ex6_1_array;

public class ArrayExample2 {
	public static void main(String args[]) {
		int arr[]; // 배열 변수 선언
		arr = new int[10]; // 배열 생성 : 생성과 동시에 자동적으로 자신의 타입에
						   // 해당하는 기본값으로 초기화 됩니다.
		
		for(int i = 0; i <=9; i++)
			System.out.println("arr[" + i + "]" + "=" + arr[i]);
		
		// arr.length:배열의 크기
		for (int i = 0; i < arr.length; i++)
			System.out.println("arr[" + i + "]" + "=" + arr[i]);
		
		/*
		 * 오류 발생 java.lang.ArrayIndexOutOfBoundsException: 10
		 * 
		 * System.out.println(arr[10]);
		 * System.out.println(arr[arr.length]);
		 * 
		 */
		
		System.out.println(arr[10]);
		System.out.println(arr[arr.length]);
	}
}
