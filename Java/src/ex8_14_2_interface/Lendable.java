//대출 가능 인터페이스
package ex8_14_2_interface;

interface Lendable {
	//대출한다.
	public abstract void checkOut(String borrower, String date);
	
	//반납한다.
	public abstract void checkIn();
}
