/*
 * -java.lang.Thread Ŭ������ �� Ŭ������ ���� Ŭ������
    Thread(������) Ŭ������� �մϴ�.
   -�����尡 �� ���� run �޼ҵ� �ȿ� �ۼ��ؾ� �մϴ�.
   -public void run()�� �������� �ۼ��մϴ�.
 */
package ex17_1_Thread;

class DigitThread extends Thread{
	//�������̵� - �������̵� ���ص� ������ �����
	//start() �޼ҵ忡 ���� ����˴ϴ�.
	public void run() {
		for (int cnt = 0; cnt < 10; cnt++)
			System.out.print(cnt);
		
	//	System.out.print("������ �̸�2 : " +
	//			Thread.currentThread().getName());
	}
}