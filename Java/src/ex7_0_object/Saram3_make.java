package ex7_0_object;

public class Saram3_make {
	public static void main(String[] args) {
		/*
		      다른 클래스에 있는 필드나 메서드(멤버)를 사용하려면 먼저 객체를 생성해야 합니다.
		   생성된 객체 멤버에 접근하려면 마침표(.) 연산자를 사용합니다.
		   예) 객체.필드, 객체.메서드()		
		   
		   같은 패키지 안에 있는 경우 이렇게 끌어올 수 있고,
		   만약 다른 패키지에 있는 것을 쓰기 위함이라면 그 패키지 안의 클래스에서 public을 앞에 붙여 주어야 함
		 */

//				클래스   참조변수	  연산자  생성자호출
				Saram3 s 	= new Saram3("수지");
				
				s.age = 15;
				s.w = 47;
				s.ki = 168;
				s.eat();
				s.sesu();
				s.walk();
				
				Saram3 s2 = new Saram3("박보검");
				
				s2.age = 15;
				s2.w = 70;
				s2.ki = 180;
				s2.eat();
				s2.sesu();
				s2.walk();
						
			}
}
