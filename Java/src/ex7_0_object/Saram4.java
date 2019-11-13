package ex7_0_object;

public class Saram4 {
	String name;
	double w;
	double ki;
	int age;

	// 생성자 - 반드시 클래스 이름과 똑같고 리턴 타입이 없어야 합니다.
	Saram4(String name2, int w2) {
		name = name2;
		w = w2;
	}

	// 메서드
	public void eat() {
		System.out.println(name + "이(가) 밥을 먹는다.");
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
