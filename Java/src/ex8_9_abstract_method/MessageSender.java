//�߻� �޼ҵ带 �����ϴ� Ŭ���� - �޽��� ���� Ŭ����
//�߻� �޼ҵ带 �����ϴ� Ŭ������ abstract class �� �Ǿ�� �ϴ� ��
package ex8_9_abstract_method;

abstract class MessageSender { //Ŭ���� ��ü�� �߻� Ŭ������ ����
	String title;		//����
	String senderName;	//�߼��� �̸�
	
	MessageSender(String title, String senderName){
		this.title = title;
		this.senderName = senderName;
	}
	
	//�߻� �޼ҵ� - �޽����� �۽��Ѵ�
	abstract void sendMessage(String recipient);
}