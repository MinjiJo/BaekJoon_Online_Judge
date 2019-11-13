package ex8_11_1_polymorphism;

public class Main {
	public static void main(String[] args) {
		EMailSender obj1 = 
			new EMailSender("생일을 축하합니다", "고객센터",
				"admin@khshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
		
		SMSSender obj2 =
				new SMSSender("생일을 축하합니다", "고객센터",
						"02-333-5555", "10% 할인쿠폰이 발행되었습니다.");
		
		//서브 클래스 객체 obj1, obj2를 가지고 메소드를 호출
		//MessageSender 클래스에서 sendMessage 메소드를 주석 처리할 경우
		//에러 발생 : 자바 컴파일러는 변수의 타입으로 그 메소드가 있는지 없는지 체크합니다.
		//MessageSender에 sendMessage() 메서드가 존재하지 않아서
		//The method sendMessage(String) is undefined for the type
		//에러 발생했습니다.
		
		//자바 가상 기계(JVM)는 객체의 메소드를 호출할 때 변수의 타입에 상관없이
		//객체가 속하는 클래스의 메소드를 호출합니다.
		send(obj1, "hatman@yeyeye.com");
		send(obj1, "stickman@hahaha.com");
		send(obj2, "010-000-0000");

	}
	
	//MessageSender obj : 슈퍼 클래스 타입의 파라미터
	static void send(MessageSender obj, String recipient) {
		//어느 클래스의 sendMessage 메소드가 호출될까요?
		//EMailSender 또는 SMSSender
		//자바 컴파일러는 객체가 아니라 변수의 타입만 가지고 그 메소드가 있는지 없는지 체크
		//추상 메소드 선언의 두 번째 목적: 슈퍼클래스의 메소드를 호출하는 척하면서
		//컴파일러의 체크를 무사 통과하고 프로그램이 실행될 때는 
		//서브 클래스의 메소드가 호출되도록 하는 것이 추상 메소드의 또 다른 사용 목적
		//추상 메소드의 첫 번째 목적: 서브클래스에서 이 메소드를 반드시 구현하도록 만들기 위해서
		//부모 필드를 가져오지만 실행하면서 자식에 있는(오버라이딩 된) 메서드를 실행함
		//실행 중에 되는 것 -> 동적 바인딩, ex8_10_의 사례 -> 정적 바인딩
		obj.sendMessage(recipient);
	}
}
