package ex8_11_1_polymorphism;

class EMailSender extends MessageSender {
	String senderAddr;
	String emailBody;

	EMailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	void sendMessage(String recipient) {
		System.out.println("---------------------------");
		System.out.println("����: " + title);
		System.out.println("������ ���: " + senderName + "\n" + "���� �ּ�: " + senderAddr);
		System.out.println("�޴� ���: " + recipient);
		System.out.println("����: " + emailBody);
	}
}