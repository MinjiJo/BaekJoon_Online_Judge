//���� ���� �������̽�
package ex8_15_2_interface_polymorphism;

interface Lendable {
	//�����Ѵ�.
	public abstract void checkOut(String borrower, String date);
	
	//�ݳ��Ѵ�.
	public abstract void checkIn();
}
