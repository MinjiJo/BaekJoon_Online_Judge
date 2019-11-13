package ex7_0_object;

public class Saram2 {
	//필드(멤버변수)
	String name;
	double w;
	double ki;
	int age;
	
	//생성자 : 클래스와 이름이 똑같음(대문자로 시작하는 것도 같음)
	public Saram2(){
	}
	
	//메서드
	public void eat() {
		System.out.println(name + "이(가) 밥을 먹는다.");
	}
	
	//메서드
	public void walk() {
		System.out.println(name + "이(가) 걷는다.");
	}
	
	//메서드
	public void sesu() {
		System.out.println(name + "이(가) 세수한다.");
	}
}
