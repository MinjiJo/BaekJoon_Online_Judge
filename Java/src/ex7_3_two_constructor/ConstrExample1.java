package ex7_3_two_constructor;

public class ConstrExample1 {
	public static void main(String args[]) {
		SubscriberInfo obj1 = new SubscriberInfo("�����", "poorman", "zebi");
		System.out.println("�̸�:" + obj1.name);
		System.out.println("���̵�:" + obj1.id);
		System.out.println("�н�����:" + obj1.password);
		System.out.println("��ȭ��ȣ:" + obj1.phoneNo);
		System.out.println("�ּ�:" + obj1.address);
		System.out.println("====================================");
		
		SubscriberInfo obj2 = new SubscriberInfo("�����", "richman", "money", "02-123-4567", "����");
		System.out.println("�̸�:" + obj2.name);
		System.out.println("���̵�:" + obj2.id);
		System.out.println("�н�����:" + obj2.password);
		System.out.println("��ȭ��ȣ:" + obj2.phoneNo);
		System.out.println("�ּ�:" + obj2.address);
	}
}
