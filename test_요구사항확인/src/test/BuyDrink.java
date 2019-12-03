package test;

public class BuyDrink {
	private Customer bestCustomer;
	private Drink drinkType;
	
	public BuyDrink(Customer c) {
		//Aggregation
		//���������� Ŭ������ �����ϴ� �����̸�, �����ϴ� Ŭ������ �����Ǵ� Ŭ������ �����ֱⰡ �������� ����
		this.bestCustomer = c;
		
		//Composition(�ռ� ����)
		//���������� Ŭ������ �����ϴ� �����̸�, �����ϴ� Ŭ������ �����Ǵ� Ŭ������ �����ֱⰡ ��ġ�ϴ� ����
		drinkType = new Milk();
	}
}