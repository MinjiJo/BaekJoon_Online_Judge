package ex7_9_method;

public class Account2_make {
	public static void main(String[] args) {
		Account2 obj = new Account2();
		obj.setAccountNo("111-222-33333333");
		obj.setOwnerName("ȫ�浿");
		obj.setBalance(200);
		
		printAccount(obj);
		
		obj.deposit(1000);
		printAccount(obj);
		
		obj.withdraw(500);
		printAccount(obj);
		
	}
	
	static void printAccount(Account2 obj) {
		System.out.println("���¹�ȣ:" + obj.getAccountNo());
		System.out.println("������ �̸�:" + obj.getOwnerName());
		System.out.println("�ܾ�:" + obj.getBalance());
		System.out.println();
	}
}
