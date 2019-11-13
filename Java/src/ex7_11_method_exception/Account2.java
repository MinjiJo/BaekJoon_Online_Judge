//클래스의 기능을 구현하는 메소드 선언
package ex7_11_method_exception;

public class Account2 {
	String accountNo; // 계좌번호
	String ownerName; // 예금주 이름
	int balance; // 잔액

	Account2(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception{ // 에러 반환시키는 구문
		if (balance < amount)
			throw new Exception("잔액이 부족합니다."); // 에러 발생시키는 구문
		balance -= amount;
		return amount;
	}
}
