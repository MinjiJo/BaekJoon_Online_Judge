//obj������ Ÿ���� Account�̱� ������
//Account�� ���� pay�޼ҵ峪 cardNO�ʵ�� ������ ���� �߻�
//Account�� �ִ� �ʵ常 ��� ����
package ex9_3_upcasting;
class RefTypeExample6 {
	public static void main(String args[]) {
		Account obj = new CheckingAccount("111-22-33333333", "ȫ�浿", 100000, "4444-5555-6666-7777");
/*
		try {
			int amount = obj.pay("4444-5555-6666-7777", 47000);
			System.out.println("�����: " + amount);
			System.out.println("ī���ȣ: " + obj.cardNo);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
*/
		try {
			obj.withdraw(1000);
			System.out.println("���¹�ȣ:" + obj.accountNo);
			System.out.println("������ �̸�:" + obj.ownerName);
			System.out.println("�ܾ�:" + obj.balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
