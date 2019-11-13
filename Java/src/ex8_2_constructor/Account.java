//은행 계좌 클래스
package ex8_2_constructor;
class Account {	//컴파일러가 extends Object를 추가합니다.
	String accountNo; // 계좌번호
	String ownerName; // 예금주 이름
	int balance; 	  // 잔액
	
	//기본 생성자를 컴파일러가 자동 추가합니다.
	//Account(){}

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
