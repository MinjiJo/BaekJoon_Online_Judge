package ex7_9_method;

public class Account_make {
	public static void main(String[] args) {
		Account obj = new Account("111-222-33333333", "ȫ�浿", 200);
		printAccount(obj);
		
		obj.deposit(1000);
		printAccount(obj);
		
		obj.withdraw(500);
		printAccount(obj);
			
	}
	
	static void printAccount(Account obj) {
		System.out.println("���¹�ȣ:" + obj.accountNo);
		System.out.println("�̸�:" + obj.ownerName);
		System.out.println("�ܾ�:" + obj.balance);
		System.out.println();
	}
	
}
