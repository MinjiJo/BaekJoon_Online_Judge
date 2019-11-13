//�����ڰ� �ִ� Account Ŭ����
//The type BonusPointAccount cannot subclass the final class Account
package ex8_6_final_class;
final class Account {	//�����Ϸ��� extends Object�� �߰��մϴ�.
	String accountNo; // ���¹�ȣ
	String ownerName; // ������ �̸�
	int balance; 	  // �ܾ�
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception{ // �����Ѵ�
		if (balance < amount)
			throw new Exception("�ܾ��� �����մϴ�."); 
		balance -= amount;
		return amount;
	}
}
