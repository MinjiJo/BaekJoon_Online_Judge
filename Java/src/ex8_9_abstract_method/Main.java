package ex8_9_abstract_method;

public class Main {
	public static void main(String[] args) {
		EMailSender obj1 = 
			new EMailSender("������ �����մϴ�", "������",
				"admin@khshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		//�߻� �޼ҵ带 ������ �޼ҵ带 ȣ��
		obj1.sendMessage("hoho@naver.com");
		
		SMSSender obj2 =
				new SMSSender("������ �����մϴ�", "������",
						"02-333-5555", "10% ���������� ����Ǿ����ϴ�.");
		obj2.sendMessage("010-123-1234");
	}
}
