package ex8_3_super_constructor;

public class CheckingAccount_main {
	public static void main(String[] args) {
		/* �����߻�
		 * CheckingAccount obj_error = new CheckingAccount();
		 */
		CheckingAccount obj = new CheckingAccount("111-22-33333333", 
				"ȫ�浿", 0, "5555-6666-7777-8888"); //������ ȣ��

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
