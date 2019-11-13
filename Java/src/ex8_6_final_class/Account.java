//생성자가 있는 Account 클래스
//The type BonusPointAccount cannot subclass the final class Account
package ex8_6_final_class;
final class Account {	//컴파일러가 extends Object를 추가합니다.
	String accountNo; // 계좌번호
	String ownerName; // 예금주 이름
	int balance; 	  // 잔액
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception{ // 인출한다
		if (balance < amount)
			throw new Exception("잔액이 부족합니다."); 
		balance -= amount;
		return amount;
	}
}
