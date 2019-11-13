package ex4_5_rel_logic_op;

//단락 평가(short circuit evaluation)
// &&연산의 경우 첫 번째 피연산자를 평가해서 false인 경우
// 두번째 피연산자를 평가하지 않고 false를 반환합니다.
// || 연산의 경우 첫번째 피연산자를 평가해서 true인 경우
// 두번째 피연산자를 평가하지 않고 true를 반환합니다.
public class LogicalExample7 {

	public static void main(String[] args) {
		int a = 20, b = 20;
		if (a >= 20 || ++b >= 20) { // a>=20이 참이므로 두 번째 피연산자는 평가하지 않는다.
			System.out.println("참" + b);
		} else {
			System.out.println("거짓");
		}
		System.out.println(b);
		
		a = 10;
		b = 20;
		if (a >= 20 || ++b >= 20) { // a>=20이 거짓이므로 두 번재 피연산자를 평가합니다.
			System.out.println("참" + b);
		} else {
			System.out.println("거짓");
		}
		System.out.println(b);
	}
}
