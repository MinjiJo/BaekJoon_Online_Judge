//���ົ Ŭ������ �η� CD Ŭ������ ����ϴ� ���α׷�
package ex8_14_2_interface;
class InterfaceExample {
	public static void main(String[] args) {
		SeparateVolume obj1 = new SeparateVolume("863��774��", "����", "��������");
		obj1.checkOut("����", "2019-02-28");
		obj1.checkIn();
		
		AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");
		obj2.checkOut("����", "2019-02-28");
		obj2.checkIn();
	}
}
