//상속 받은 추상 메소드를 구현하라는 에러 발생
package ex8_14_1_interface;

class Dictionary implements Lendable{
	String title;
	Dictionary(String title){
		this.title = title;
	}
	@Override
	public void checkOut(String borrower, String date) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
	}
}
