//인스턴스화를 금지하는 abstract 키워드
package ex8_8_abstract_class;
abstract class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	void deposit(int amount) {
		balance += amount;
	}
	
	final int withdraw(int amount) throws Exception{ // 인출한다
		if (balance < amount)
			throw new Exception("잔액이 부족합니다."); 
		balance -= amount;
		return amount;
	}
}
