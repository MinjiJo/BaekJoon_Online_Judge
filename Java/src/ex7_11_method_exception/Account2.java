//Ŭ������ ����� �����ϴ� �޼ҵ� ����
package ex7_11_method_exception;

public class Account2 {
	String accountNo; // ���¹�ȣ
	String ownerName; // ������ �̸�
	int balance; // �ܾ�

	Account2(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception{ // ���� ��ȯ��Ű�� ����
		if (balance < amount)
			throw new Exception("�ܾ��� �����մϴ�."); // ���� �߻���Ű�� ����
		balance -= amount;
		return amount;
	}
}
