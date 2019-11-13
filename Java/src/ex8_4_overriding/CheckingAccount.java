//���� Ŭ������ �����ڸ� ȣ���ϴ� ���� ���� Ŭ����
package ex8_4_overriding;
public class CheckingAccount extends Account {
	String cardNo;
	
	//�ڹ� �����Ϸ��� ������ �� ���� Ŭ������ ������ ù��° ���ɹ���
	//���� Ŭ������ ������ ȣ�⹮�� �ƴϸ�
	//�ڵ����� ���� Ŭ������ no-arg constructor ȣ�⹮�� �߰��մϴ�.
	//������ ���� Ŭ�������� no-arg constructor�� ��� ������ ���� �߻�
	CheckingAccount(String accountNo, String ownerName,
					int balance, String cardNo) {
		//�Ķ���� 3���� ���� Ŭ���� ������ ȣ�⹮
		//�ݵ�� �������� ù��° ���ɹ��̾�� �մϴ�.
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo)|| (balance < amount))
			throw new Exception("������ �Ұ����մϴ�.");
		return withdraw(amount);
	}
}