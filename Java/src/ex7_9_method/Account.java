package ex7_9_method;

public class Account {
	String accountNo; // 계좌번호
	String ownerName; // 예금주 이름
	int balance; // 잔액

	Account(String accoutNo, String ownerName, int balance) {
		this.accountNo = accoutNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	// void : 리턴 값이 없음을 표시하는 자바 키워드
	// "예금한다" 기능을 구현하는 메소드 선언
	void deposit(int amount) {
		balance += amount;
	}

	// "인출한다" 기능을 구현하는 메소드 선언
	int withdraw(int amount) {
		if (balance < amount)
			return 0;

		balance -= amount;
		return amount;
	}
}
