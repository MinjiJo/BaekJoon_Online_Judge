//�ν��Ͻ�ȭ�� �����ϴ� abstract Ű����
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
	
	final int withdraw(int amount) throws Exception{ // �����Ѵ�
		if (balance < amount)
			throw new Exception("�ܾ��� �����մϴ�."); 
		balance -= amount;
		return amount;
	}
}
