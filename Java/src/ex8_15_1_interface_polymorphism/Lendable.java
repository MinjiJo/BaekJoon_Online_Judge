//���� ���� �������̽�
package ex8_15_1_interface_polymorphism;

interface Lendable {
	//�����Ѵ�.
	public abstract void checkOut(String borrower, String date);
	
	//�ݳ��Ѵ�.
	public abstract void checkIn();
}
