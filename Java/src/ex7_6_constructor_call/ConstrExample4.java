package ex7_6_constructor_call;

public class ConstrExample4 {
	public static void main(String args[]) {
		SubscriberInfo obj = new SubscriberInfo("���ӽ� ����", "java", "java", "010-111-2222", "���� ã�� ������~");
		
		printSubscriberInfo(obj);
	}
	
	static void printSubscriberInfo(SubscriberInfo obj) { //static : ��ü �������� �ʾƵ� . ��� ��� ����
		System.out.println("�̸�:" + obj.name);
		System.out.println("���̵�:" + obj.id);
		System.out.println("�н�����:" + obj.password);
		System.out.println("��ȭ��ȣ:" + obj.phoneNo);
		System.out.println("�ּ�:" + obj.address);
		System.out.println("===================================");
	}
}
