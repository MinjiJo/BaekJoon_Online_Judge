package ex7_9_method;

public class Account_make {
	public static void main(String[] args) {
		Account obj = new Account("111-222-33333333", "È«±æµ¿", 200);
		printAccount(obj);
		
		obj.deposit(1000);
		printAccount(obj);
		
		obj.withdraw(500);
		printAccount(obj);
			
	}
	
	static void printAccount(Account obj) {
		System.out.println("°èÁÂ¹øÈ£:" + obj.accountNo);
		System.out.println("ÀÌ¸§:" + obj.ownerName);
		System.out.println("ÀÜ¾×:" + obj.balance);
		System.out.println();
	}
	
}
