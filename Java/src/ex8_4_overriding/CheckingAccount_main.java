package ex8_4_overriding;

public class CheckingAccount_main {
	public static void main(String[] args) {
		CreditLineAccount obj = new CreditLineAccount("111-22-33333333", 
				"ȫ�浿", 10000, 20000000); //������ ȣ��
		
		try {
			int paidAmount = obj.withdraw(50000);
			//int paidAmount = obj.withdraw(5000000);
			System.out.println("�����:" + paidAmount);
			System.out.println("�ܾ�:" + obj.balance);
			System.out.println("���̳ʽ� �ѵ�:" + obj.creditLine);
		} catch(Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
	}
}
