package ex8_4_overriding;

public class CheckingAccount_main {
	public static void main(String[] args) {
		CreditLineAccount obj = new CreditLineAccount("111-22-33333333", 
				"홍길동", 10000, 20000000); //생성자 호출
		
		try {
			int paidAmount = obj.withdraw(50000);
			//int paidAmount = obj.withdraw(5000000);
			System.out.println("인출액:" + paidAmount);
			System.out.println("잔액:" + obj.balance);
			System.out.println("마이너스 한도:" + obj.creditLine);
		} catch(Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
	}
}
