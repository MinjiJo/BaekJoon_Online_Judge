package ex3_3_constant;
//상수 : 값을 한 번만 저장할 수 있는 공간
//상수 만드는 법 : 변수 타입 앞에 키워드 final만 붙여 주기만 하면 됩니다.
//일반적으로 상수의 이름은 대문자로 사용합니다.
public class Const {
	public static void main(String[] args) {
		final double PI = 3.141592;
		System.out.println(PI);
		// final 후에 다른 값을 대입하려 하면 에러 발생
	}
}
