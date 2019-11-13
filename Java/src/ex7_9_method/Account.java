package ex7_9_method;

public class Account {
	String accountNo; // ���¹�ȣ
	String ownerName; // ������ �̸�
	int balance; // �ܾ�

	Account(String accoutNo, String ownerName, int balance) {
		this.accountNo = accoutNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	// void : ���� ���� ������ ǥ���ϴ� �ڹ� Ű����
	// "�����Ѵ�" ����� �����ϴ� �޼ҵ� ����
	void deposit(int amount) {
		balance += amount;
	}

	// "�����Ѵ�" ����� �����ϴ� �޼ҵ� ����
	int withdraw(int amount) {
		if (balance < amount)
			return 0;

		balance -= amount;
		return amount;
	}
}
