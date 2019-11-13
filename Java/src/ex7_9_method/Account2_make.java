package ex7_9_method;

public class Account2_make {
	public static void main(String[] args) {
		Account2 obj = new Account2();
		obj.setAccountNo("111-222-33333333");
		obj.setOwnerName("홍길동");
		obj.setBalance(200);
		
		printAccount(obj);
		
		obj.deposit(1000);
		printAccount(obj);
		
		obj.withdraw(500);
		printAccount(obj);
		
	}
	
	static void printAccount(Account2 obj) {
		System.out.println("계좌번호:" + obj.getAccountNo());
		System.out.println("예금주 이름:" + obj.getOwnerName());
		System.out.println("잔액:" + obj.getBalance());
		System.out.println();
	}
}
