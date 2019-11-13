package ex4_1_local_variable;

//local variable - method 안에 정의된 변수
public class SimpleAddr {
	
	public static void main(String[] args) {
		int num; //local variable
		num = 10 + 20;
		// local variable은 반드시 값을 넣어 주어야 사용할 수 있습니다.
		System.out.println(num);
	}
}
