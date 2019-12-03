package test;

public class BuyDrink {
	private Customer bestCustomer;
	private Drink drinkType;
	
	public BuyDrink(Customer c) {
		//Aggregation
		//전역변수로 클래스를 참조하는 관계이며, 참조하는 클래스와 참조되는 클래스의 생명주기가 독립적인 관계
		this.bestCustomer = c;
		
		//Composition(합성 관계)
		//전역변수로 클래스를 참조하는 관계이며, 참조하는 클래스와 참조되는 클래스의 생명주기가 일치하는 관계
		drinkType = new Milk();
	}
}