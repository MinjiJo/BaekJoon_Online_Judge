//���ົ Ŭ������ �η� CD Ŭ������ ����ϴ� ���α׷�
package ex8_16_interface_constant;

class InterfaceExample {
	public static void main(String[] args) {
		SeparateVolume obj = new SeparateVolume("863��", "����", "��������");
		// ���Ⱑ���� Ȯ���ϰ� ������°� �����ϸ� "���Ⱑ��"�� ����ϰ�
		// �������̸� �������� ������, �������� ����մϴ�.
		printState(obj);
		obj.checkOut("����", "2019-02-28");
		printState(obj);
	}

	static void printState(SeparateVolume obj) {
		// �������̽� Lendable�� �������� ���� Ŭ���������� ����
		// �������̽�.���

		if (obj.state == Lendable.STATE_NORMAL) {
			System.out.println("-----------------------");
			System.out.println("�������: ���Ⱑ��");
			System.out.println("-----------------------");
		}
		if (obj.state == Lendable.STATE_BORROWED) {
			System.out.println("-----------------------");
			System.out.println("�������: ������");
			System.out.println("������: " + obj.borrower);
			System.out.println("������: " + obj.checkOutDate);
			System.out.println("-----------------------");
		}
	}
}
