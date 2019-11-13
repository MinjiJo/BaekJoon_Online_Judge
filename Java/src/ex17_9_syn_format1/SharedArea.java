package ex17_9_syn_format1;

public class SharedArea {
	Account account1;
	Account account2;
	
	void transfer() {	//���� ��ü�� �Ѵ�
		synchronized (this) {	//this:����ȭ�� ��ü�� �ڱ� �ڽ��Դϴ�.
			account1.withdraw(1000000);
			account2.deposit(1000000);
		}//����ȭ ��
	}//transfer() end
	
	int getTotal() {	//�ܾ� �հ踦 ���Ѵ�
		synchronized (this) {
			return account1.balance + account2.balance;
		}//����ȭ ��
	}//getTotal() end
}

