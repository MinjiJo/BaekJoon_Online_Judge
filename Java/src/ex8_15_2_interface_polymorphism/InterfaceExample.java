//���ົ Ŭ������ �η� CD Ŭ������ ����ϴ� ���α׷�
package ex8_15_2_interface_polymorphism;

class InterfaceExample {
	public static void main(String[] args) {
		// int[] a = new int[3];
		// String[] a = new String[3];
		Lendable arr[] = new Lendable[3]; // �������̽� Ÿ���� �迭

		// �迭�� ���� Ÿ���� ��ü �ּ� ����
		arr[0] = new SeparateVolume("883��", "Ǫ���� ����", "����");
		arr[1] = new SeparateVolume("609.2", "����̼���", "���긮ġ");
		arr[2] = new AppCDInfo("02-17", "XML�� ���� �ڹ� ���α׷���", "������");

		checkOutAll(arr, "����", "2019-02-28");
	}

	// �ڹ� �����Ϸ��� ������ �� �� ������ Ÿ�Ը� ���� �޼ҵ峪
	// �ʵ��� ���� ���θ� üũ�ϱ� ������
	// Lendable �������̽��� checkOut �޼ҵ尡 �־�� ������ ������ �����ϴ�.
	static void checkOutAll(Lendable arr[], String borrower, String date) {
		// �迭�� ��� �׸� ���� checkOut �޼ҵ� ȣ��
		arr[0].checkOut(borrower, date);
		arr[1].checkOut(borrower, date);
		arr[2].checkOut(borrower, date);

		/*
		 * for(int cnt = 0; cnt < arr.length; cnt++) arr[cnt].checkOut(borrower, date);
		 */

		/*
		 * for(Lendable a : arr){ a.checkOut(borrower, date); }
		 */
	}
}
