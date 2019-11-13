//추상 메소드를 포함하는 클래스 - 메시지 전송 클래스
//추상 메소드를 포함하는 클래스가 abstract class 가 되어야 하는 것
package ex8_11_1_polymorphism;

abstract class MessageSender { //클래스 자체도 추상 클래스로 선언
	String title;		//제목
	String senderName;	//발송자 이름
	
	MessageSender(String title, String senderName){
		this.title = title;
		this.senderName = senderName;
	}
	
	//추상 메소드 - 메시지를 송신한다
	abstract void sendMessage(String recipient);
}
