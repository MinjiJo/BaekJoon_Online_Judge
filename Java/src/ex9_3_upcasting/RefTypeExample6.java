//obj변수의 타입이 Account이기 때문에
//Account에 없는 pay메소드나 cardNO필드는 컴파일 에러 발생
//Account에 있는 필드만 사용 가능
package ex9_3_upcasting;
class RefTypeExample6 {
	public static void main(String args[]) {
		Account obj = new CheckingAccount("111-22-33333333", "홍길동", 100000, "4444-5555-6666-7777");
/*
		try {
			int amount = obj.pay("4444-5555-6666-7777", 47000);
			System.out.println("인출액: " + amount);
			System.out.println("카드번호: " + obj.cardNo);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
*/
		try {
			obj.withdraw(1000);
			System.out.println("계좌번호:" + obj.accountNo);
			System.out.println("예금주 이름:" + obj.ownerName);
			System.out.println("잔액:" + obj.balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
