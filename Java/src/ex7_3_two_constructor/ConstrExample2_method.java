package ex7_3_two_constructor;

public class ConstrExample2_method {
	public static void main(String args[]) {
		SubscriberInfo obj1 = new SubscriberInfo("��ȫ��", "poorman", "zebi");
		print(obj1);

		SubscriberInfo obj2 = new SubscriberInfo("�����", "richman", "money", "02-123-4567", "����");
		print(obj2);
	}

	public static void print(SubscriberInfo obj) { // static : ��ü �������� �ʾƵ� . ��� ��� ����
		System.out.println("�̸�:" + obj.name);
		System.out.println("���̵�:" + obj.id);
		System.out.println("�н�����:" + obj.password);
		System.out.println("��ȭ��ȣ:" + obj.phoneNo);
		System.out.println("�ּ�:" + obj.address);
		System.out.println();
	}
}
