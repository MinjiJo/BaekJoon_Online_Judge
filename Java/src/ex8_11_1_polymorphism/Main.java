package ex8_11_1_polymorphism;

public class Main {
	public static void main(String[] args) {
		EMailSender obj1 = 
			new EMailSender("������ �����մϴ�", "������",
				"admin@khshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		
		SMSSender obj2 =
				new SMSSender("������ �����մϴ�", "������",
						"02-333-5555", "10% ���������� ����Ǿ����ϴ�.");
		
		//���� Ŭ���� ��ü obj1, obj2�� ������ �޼ҵ带 ȣ��
		//MessageSender Ŭ�������� sendMessage �޼ҵ带 �ּ� ó���� ���
		//���� �߻� : �ڹ� �����Ϸ��� ������ Ÿ������ �� �޼ҵ尡 �ִ��� ������ üũ�մϴ�.
		//MessageSender�� sendMessage() �޼��尡 �������� �ʾƼ�
		//The method sendMessage(String) is undefined for the type
		//���� �߻��߽��ϴ�.
		
		//�ڹ� ���� ���(JVM)�� ��ü�� �޼ҵ带 ȣ���� �� ������ Ÿ�Կ� �������
		//��ü�� ���ϴ� Ŭ������ �޼ҵ带 ȣ���մϴ�.
		send(obj1, "hatman@yeyeye.com");
		send(obj1, "stickman@hahaha.com");
		send(obj2, "010-000-0000");

	}
	
	//MessageSender obj : ���� Ŭ���� Ÿ���� �Ķ����
	static void send(MessageSender obj, String recipient) {
		//��� Ŭ������ sendMessage �޼ҵ尡 ȣ��ɱ��?
		//EMailSender �Ǵ� SMSSender
		//�ڹ� �����Ϸ��� ��ü�� �ƴ϶� ������ Ÿ�Ը� ������ �� �޼ҵ尡 �ִ��� ������ üũ
		//�߻� �޼ҵ� ������ �� ��° ����: ����Ŭ������ �޼ҵ带 ȣ���ϴ� ô�ϸ鼭
		//�����Ϸ��� üũ�� ���� ����ϰ� ���α׷��� ����� ���� 
		//���� Ŭ������ �޼ҵ尡 ȣ��ǵ��� �ϴ� ���� �߻� �޼ҵ��� �� �ٸ� ��� ����
		//�߻� �޼ҵ��� ù ��° ����: ����Ŭ�������� �� �޼ҵ带 �ݵ�� �����ϵ��� ����� ���ؼ�
		//�θ� �ʵ带 ���������� �����ϸ鼭 �ڽĿ� �ִ�(�������̵� ��) �޼��带 ������
		//���� �߿� �Ǵ� �� -> ���� ���ε�, ex8_10_�� ��� -> ���� ���ε�
		obj.sendMessage(recipient);
	}
}
