package ex8_6_final_class;

public class BonusPointAccount //extends Account 
{
	int bonusPoint;		//누적 포인트 필드
	
	BonusPointAccount(String accountNo, String ownerName,
					int balance, int bonusPoint){
		//super(accountNo, ownerName, balance);//부모 클래스의 생산자 호출
		this.bonusPoint = bonusPoint;
	}
	
	//예금한다 기능을 다시 구현(메소드 오버라이딩)
	//상속 받은 메소드의 로직을 단순히 확장
	//super는 자식 클래스에서 부모 클래스로 상속 받은 필드와 메서드를 참조하는데
	//사용합니다.
	
	void deposit(int amount){
		//balance += amount;		//super.balance += amount;
								//이렇게 쓰면 부모 클래스라는 것이 좀 더 명확.
								//꼭 이렇게 쓸 필요는 X
								//혹은 아래와 같이 사용할 수 있음
		//super.deposit(amount);	//슈퍼 클래스 메소드 호출
		bonusPoint += (int) (amount * 0.001);
	}
}
