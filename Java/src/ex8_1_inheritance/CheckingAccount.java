package ex8_1_inheritance;

//���� ���� Ŭ������ ��ӹ޴� ���� ���� Ŭ����
//���� ���� Ŭ����(Account)			- ���� Ŭ����(����� ���ִ� Ŭ����)
//���� ���� Ŭ����(CheckingAccount)	- ���� Ŭ����(����� �޴� Ŭ����)
public class CheckingAccount extends Account {
	String cardNo; //����ī�� ��ȣ
	/*
	 * �޼��� �̸� : pay
	 * �Ű����� : ī�� ��ȣ(cardNo - ������), �����( amount - ������)
	 * ��ȯ�� : int
	 * ��ȯ�Ǵ� �� : �θ� Ŭ������ ����޼��� ȣ��
	 */
	// balance �ʵ�� withdraw() �޼ҵ�� AccountŬ�����κ��� ��ӹ޾� ��� ����
	// �� Ŭ���� �ȿ� ����Ǿ� �ִ� ��ó�� ����ϰ� �ֽ��ϴ�.
	//���� ī�� ������ �����Ѵٿ� �ش��ϴ� �޼ҵ�
	
	int pay(String cardNo, int amount) throws Exception{
		if(!cardNo.equals(this.cardNo)|| (balance < amount))
			throw new Exception("������ �Ұ����մϴ�.");
		return withdraw(amount);
	}
}
