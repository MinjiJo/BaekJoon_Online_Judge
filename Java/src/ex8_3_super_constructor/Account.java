//�����ڰ� �ִ� Account Ŭ����
//���� ���� Ŭ����
package ex8_3_super_constructor;
class Account {	//�����Ϸ��� extends Object�� �߰��մϴ�.
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