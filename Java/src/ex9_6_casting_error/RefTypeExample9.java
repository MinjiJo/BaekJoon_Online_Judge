package ex9_6_casting_error;
class RefTypeExample9 {
	public static void main(String args[]) {
		Account obj1 = new Account("111-22-33333333", "ȫ�浿", 100000);
		
		CheckingAccount obj2 = (CheckingAccount) obj1;	//���� �߻�
		try {
			int amount = obj2.pay("5555-6666-7777-8888", 47000);
			System.out.println("�����: " + amount);
			System.out.println("ī���ȣ: " + obj2.cardNo);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}