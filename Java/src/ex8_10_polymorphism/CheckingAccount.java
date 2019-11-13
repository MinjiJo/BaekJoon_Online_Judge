//슈퍼 클래스의 생성자를 호출하는 직불 계좌 클래스
package ex8_10_polymorphism;
public class CheckingAccount extends Account {
	String cardNo;
	
	//자바 컴파일러가 컴파일 시 서브 클래스의 생성자 첫번째 명령문이
	//슈퍼 클래스의 생성자 호출문이 아니면
	//자동으로 슈퍼 클래스의 no-arg constructor 호출문을 추가합니다.
	//하지만 슈퍼 클래스에는 no-arg constructor가 없어서 컴파일 에러 발생
	CheckingAccount(String accountNo, String ownerName,
					int balance, String cardNo) {
		//파라미터 3개의 슈퍼 클래스 생성자 호출문
		//반드시 생성자의 첫번째 명령문이어야 합니다.
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo)|| (balance < amount))
			throw new Exception("지불이 불가능합니다.");
		return withdraw(amount);
	}
}
