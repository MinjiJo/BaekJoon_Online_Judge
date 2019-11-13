//���� ��ü�� �ܾ� �հ� ����� ���ÿ� �ϴ� ��Ƽ������ ���α׷�
/*
   - �̸����� ���¿��� ����� 100������ �������� ���·� �ԱݵǱ� ����
     PrintThread�� ���� ��� �Ѿ ���� �ܾ� �հ� 29000000 ��µǾ����ϴ�.
   - ���� �ذ��
           ����ȭ : ���� ������ ��� �߿� �� ���� �����͸� �ٸ� �����尡 ������� ���ϵ���
           	����� ���� �ǹ��մϴ�.
 */
package ex17_7_syn_problem;

public class MultithreadExample {
	public static void main(String args[]) {
		SharedArea area = new SharedArea();

		area.account1 = new Account("111-111-1111", "�̸���", 20000000);

		area.account2 = new Account("222-222-2222", "������", 10000000);

		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		thread1.start();
		thread2.start();
	}
}