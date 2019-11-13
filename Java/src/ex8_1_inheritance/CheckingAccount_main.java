package ex8_1_inheritance;

public class CheckingAccount_main {
	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount();
		obj.accountNo = "111-22-33333333";		//��ӹ��� �ʵ�
		obj.ownerName = "ȫ�浿";					//��ӹ��� �ʵ�
		obj.cardNo = "5555-6666-7777-8888";		//��� ���� �޼ҵ�
		
		//obj.deposit(10);
		obj.deposit(1000000);
		
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("���Ҿ�:" + paidAmount);
			System.out.println("�ܾ�:" + obj.balance);
		} catch(Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
	}
}
