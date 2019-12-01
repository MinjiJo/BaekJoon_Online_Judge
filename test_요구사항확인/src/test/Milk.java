package test;

public class Milk extends Drink {
	private int price;
	
	public Status auto() {
		//의존 관계 - 메서드의 매개변수, 지역변수로 사용
		Status s = new Status();
		return s;
	}
	
	protected void specialView() {
		
	}
}
