//Ŭ������ ����� �����ϴ� �޼ҵ� ����
package ex7_9_method;

public class Account2 {
	private String accountNo; // ���¹�ȣ
	private String ownerName; // ������ �̸�
	private int balance; // �ܾ�

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) {
		if (balance < amount)
			return 0;

		balance -= amount;
		return amount;
	}
}
