package ex8_11_1_polymorphism;

class SMSSender extends MessageSender {
	String returnPhoneNo;
	String message;
	
	SMSSender(String title, String senderName, String returnPhoneNo, String message) {
		super(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}
	
	//���� Ŭ������ �޼ҵ带 �������̵��ϴ� �޼ҵ�
	//�ֻ� �޼ҵ带 ����(implement)
	
	void sendMessage(String recipient) {
		System.out.println("---------------------------");
		System.out.println("����: " + title);
		System.out.println("������ ���: " + senderName);
		System.out.println("��ȭ��ȣ: " + recipient);
		System.out.println("ȸ�� ��ȭ��ȣ: " + returnPhoneNo);
		System.out.println("�޽��� ����: " + message);
	}
}