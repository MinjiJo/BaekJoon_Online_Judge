package ex8_6_final_class;

public class BonusPointAccount //extends Account 
{
	int bonusPoint;		//���� ����Ʈ �ʵ�
	
	BonusPointAccount(String accountNo, String ownerName,
					int balance, int bonusPoint){
		//super(accountNo, ownerName, balance);//�θ� Ŭ������ ������ ȣ��
		this.bonusPoint = bonusPoint;
	}
	
	//�����Ѵ� ����� �ٽ� ����(�޼ҵ� �������̵�)
	//��� ���� �޼ҵ��� ������ �ܼ��� Ȯ��
	//super�� �ڽ� Ŭ�������� �θ� Ŭ������ ��� ���� �ʵ�� �޼��带 �����ϴµ�
	//����մϴ�.
	
	void deposit(int amount){
		//balance += amount;		//super.balance += amount;
								//�̷��� ���� �θ� Ŭ������� ���� �� �� ��Ȯ.
								//�� �̷��� �� �ʿ�� X
								//Ȥ�� �Ʒ��� ���� ����� �� ����
		//super.deposit(amount);	//���� Ŭ���� �޼ҵ� ȣ��
		bonusPoint += (int) (amount * 0.001);
	}
}
