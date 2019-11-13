//대출 가능 인터페이스
package ex8_15_2_interface_polymorphism;

interface Lendable {
	//대출한다.
	public abstract void checkOut(String borrower, String date);
	
	//반납한다.
	public abstract void checkIn();
}
