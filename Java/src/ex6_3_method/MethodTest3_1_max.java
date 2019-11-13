//오버로딩을 이용한 최대값 구하기
/*
 * 자바는 메서드 시그니처를 사용해 메서드를 구분합니다.
 * 메서드 시그니처(Method Signature)는 메서드 이름과 매개변수 개수,
 * 데이터 타입, 순서를 의미합니다.
 * 매서드 이름이 동일하더라도 매개변수 개수, 데이터 타입, 순서 중
 * 하나라도 다르면 다른 매서드를 정의하는 것을 메서드 오버로딩이라고 합니다.
 * 자바는 변환 타입으로 메서드를 구분하지 않습니다.
 */

package ex6_3_method;

public class MethodTest3_1_max {
	public static void main(String args[]) {
		System.out.println("max(10,20) = " + max(10, 20));
		System.out.println("max(10,20,30) = " + max(10, 20, 30));
		System.out.println("max(10,20,30,40) = " + max(10, 20, 30, 40));
	}

	public static int max(int n1, int n2) {
		return n1>n2?n1:n2;
	}

	public static int max(int n1, int n2, int n3) {
		int max = n1;
		if(max < n2 ) max = n2;
		if(max < n3 ) max = n3;
		return max;
	}

	public static int max(int n1, int n2, int n3, int n4) {
		int max = n1;
		if(max < n2 ) max = n2;
		if(max < n3 ) max = n3;
		if(max < n4 ) max = n4;
		return max;
	}
	
	// 반환형은 메서드 오버로딩 조건과 무관해서 위의 메서드와 동일하게 취급해 에러 발생합니다.
	/* duplicate 에러 메세지가 나옴
	public static String max(int n1, int n2, int n3, int n4) {
		int max = n1;
		if(max < n2 ) max = n2;
		if(max < n3 ) max = n3;
		if(max < n4 ) max = n4;
		return "반환형 String : " + max;
	}
	*/
}
