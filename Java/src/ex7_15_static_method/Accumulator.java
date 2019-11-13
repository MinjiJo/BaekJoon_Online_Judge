//정적 메소드를 포함하는 클래스
package ex7_15_static_method;

public class Accumulator {
	int total = 0;
	static int grandTotal = 0;		//정적 필드를 선언하는 선언문
	
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	/*
	 * 정적 메서드 안에서는 인스턴스 변수, 인스턴스 메서드 사용할 수 없습니다.
	 * 인스턴스 변수와 인스턴스 메서드는 객체 생성시 사용할 수 있는 멤버들이기 때문에
	 * 인스턴스 생성과 관련없는 static 메서드 안에서는 사용할 수 없습니다.
	 * 따라서 this도 사용할 수 없습니다.
	 */
	
	static int getGrandTotal() {	// 정적 메서드 선언
		//total = 5;					// 에러 발생
		//accumulate(200);				// 에러 발생
		return grandTotal;
	}
}
