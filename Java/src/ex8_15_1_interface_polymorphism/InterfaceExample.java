//���ົ Ŭ������ �η� CD Ŭ������ ����ϴ� ���α׷�
package ex8_15_1_interface_polymorphism;
class InterfaceExample {
	public static void main(String[] args) {
		Lendable arr0, arr1, arr2;
		//arr0 = new Lendable(); //���� �߻�
		arr0 = new SeparateVolume("883��", "Ǫ���� ����", "����");
		arr1 = new SeparateVolume("609.2", "����̼���", "���긮ġ");
		arr2 = new AppCDInfo("02-17", "XML�� ���� �ڹ� ���α׷���");
		
		//���� ����� ���� ��¥�� ���ົ 2�ǰ� �η� CD�� ������ ����Դϴ�.
		checkOut(arr0, "����", "2019-02-28");
		checkOut(arr1, "����", "2019-02-28");
		checkOut(arr2, "����", "2019-02-28");
	}
	
	//�ڹ� �����Ϸ��� ������ �� �� ������ Ÿ�Ը� ���� �޼ҵ峪
	//�ʵ��� ���� ���θ� üũ�ϱ� ������
	//Lendable �������̽��� checkOut �޼ҵ尡 �־�� ������ ������ �����ϴ�.
	static void checkOut(Lendable arr, String borrower, String date) {
		arr.checkOut(borrower, date);
	}
}
