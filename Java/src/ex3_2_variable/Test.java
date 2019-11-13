package ex3_2_variable;

public class Test {
	public static void main(String[] args) {
		//1. 정수형 변수 age에 자신의 나이를 저장합니다.
		byte age = 20;
		
		//출력문)
		//2. 내 나이는 20입니다.
		System.out.println("내 나이는 " + age + "입니다.");
		
		//3. 일년이 지나 내 나이는 한 살이 증가했습니다.
		//오류 발생-Type mismatch: cannot convert from int to byte
		age = (byte) (age + 1);
		
		//출력문)
		//4. 내 나이는 21입니다.
		System.out.println("내 나이는 " + age + "입니다.");		
	}
}
