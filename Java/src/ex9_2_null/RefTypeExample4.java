//obj변수에 null이라는 참조값이 있기 때문에 컴파일 에러는 없지만
//실행시 에러 발생(런타임 에러 발생)
package ex9_2_null;

class RefTypeExample4 {
	public static void main(String args[]) {
		Point obj = null;
		try {
			System.out.println(obj.x);
			System.out.println(obj.y);
		} catch (java.lang.NullPointerException n) { //Exception이 부모이기 때문에 자식을 품어서 Exception n 이라고만 써도 돌아감. 다형성 적용된 것!
			System.out.println("Point는 null 입니다");
		}
	}
}
