package ex8_7_fianl_method;

public class BonusPointAccount_main {
	public static void main(String[] args) {
		BonusPointAccount obj = new BonusPointAccount(
				"333-33-333333", "��̿�", 0, 0); //������ ȣ��
		
		obj.deposit(1000000);
		//System.out.println("�ܾ�:" + obj.balance);
		System.out.println("���� ����Ʈ:" + obj.bonusPoint);
	}
}
