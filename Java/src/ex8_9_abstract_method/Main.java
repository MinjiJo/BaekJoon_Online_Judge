package ex8_9_abstract_method;

public class Main {
	public static void main(String[] args) {
		EMailSender obj1 = 
			new EMailSender("생일을 축하합니다", "고객센터",
				"admin@khshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
		//추상 메소드를 구현할 메소드를 호출
		obj1.sendMessage("hoho@naver.com");
		
		SMSSender obj2 =
				new SMSSender("생일을 축하합니다", "고객센터",
						"02-333-5555", "10% 할인쿠폰이 발행되었습니다.");
		obj2.sendMessage("010-123-1234");
	}
}
