package ex8_14_1_interface;

interface Lendable {
	//�����Ѵ�.
	public abstract void checkOut(String borrower, String date);
	
	//�ݳ��Ѵ�.
	public abstract void checkIn();
}
