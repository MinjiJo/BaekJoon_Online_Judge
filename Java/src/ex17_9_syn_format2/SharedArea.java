package ex17_9_syn_format2;

public class SharedArea {
	Account account1;
	Account account2;
	
	//동기화 메소드
	synchronized void transfer() {
			account1.withdraw(1000000);
			account2.deposit(1000000);
	}
	
	//동기화 메소드
	synchronized int getTotal() {
			return account1.balance + account2.balance;
	}
}

