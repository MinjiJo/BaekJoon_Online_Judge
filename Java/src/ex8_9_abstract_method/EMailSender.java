package ex8_9_abstract_method;

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
		System.out.println("������ ���: " + senderName + "\n"
							+ "���� �ּ�: " + senderAddr);
		System.out.println("�޴� ���: " + recipient);
		System.out.println("����: " + emailBody);
	}
}
