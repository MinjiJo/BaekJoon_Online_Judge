//���� �߻�
//�����ڿ� �Ķ���͸� �Ѱ����� �ʰ� ��ü�� �����ϴ� ���α׷�
//����:The constructor SubscriberInfo()
//�ذ� : SubscriberInfo()�� ������ �־�� �մϴ�.

package ex7_5_default_constructor;

public class ConstrExample3 {
	public static void main(String args[]) {
		SubscriberInfo obj;
		obj = new SubscriberInfo();
		obj.address = "����� ������";
		printSubscriberInfo(obj);
		
		obj.setAddress("����� ������");
		printSubscriberInfo(obj);
	}
	
	static void printSubscriberInfo(SubscriberInfo obj) { //static : ��ü �������� �ʾƵ� . ��� ��� ����
		System.out.println("�̸�:" + obj.name);
		System.out.println("���̵�:" + obj.id);
		System.out.println("�н�����:" + obj.password);
		System.out.println("��ȭ��ȣ:" + obj.phoneNo);
		System.out.println("�ּ�:" + obj.address);
		System.out.println();
	}
	
}
