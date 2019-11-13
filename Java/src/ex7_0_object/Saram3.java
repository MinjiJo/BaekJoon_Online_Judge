package ex7_0_object;

public class Saram3 {
	String name;
	double w;
	double ki;
	int age;

	// 생성자 - 반드시 클래스 이름과 똑ㄱ타고 리턴 타입이 없어야 합니다.
	Saram3(String name2) {
		name = name2;
	}

	// 메서드
	public void eat() {
		System.out.println(name + "이(가) 밥을 먹는다.");
	}

	// 메서드
	public void walk() {
		System.out.println(name + "이(가) 걷는다.");
	}

	// 메서드
	public void sesu() {
		System.out.println(name + "이(가) 세수한다.");
	}
}
