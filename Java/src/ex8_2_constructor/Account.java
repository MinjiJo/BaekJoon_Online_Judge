//���� ���� Ŭ����
package ex8_2_constructor;
class Account {	//�����Ϸ��� extends Object�� �߰��մϴ�.
	String accountNo; // ���¹�ȣ
	String ownerName; // ������ �̸�
	int balance; 	  // �ܾ�
	
	//�⺻ �����ڸ� �����Ϸ��� �ڵ� �߰��մϴ�.
	//Account(){}

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
