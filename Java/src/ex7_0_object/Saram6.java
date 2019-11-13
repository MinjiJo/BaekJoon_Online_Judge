//멤버 변수(필드)와 매개 변수의 이름이 같은 경우 this 사용
package ex7_0_object;

public class Saram6 {
	String name;
	double w;
	double ki;
	int age;

	// 생성자 - 반드시 클래스 이름과 똑같고 리턴 타입이 없어야 합니다.
	Saram6(String name, int w, int ki, int age) {
		this.name = name;
		this.w = w;
		this.ki = ki;
		this.age = age;
	}

	// 메서드
	public void eat() {
		System.out.println(name + "의 키는 " + ki + "이다.");
	}

	// 메서드
	public void walk() {
		System.out.println(name + "이(가) 걷기전 몸무게는 " + w + "입니다.");
	}

	// 메서드
	public void sesu() {
		System.out.println(name + "이(가) 세수한다.");
	}
}
