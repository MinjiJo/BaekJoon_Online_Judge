package ex17_6_SharedArea_Solution;

class PrintThread extends Thread {
	SharedArea sharedArea;
	public void run() {
		//SharedArea ��ü�� isReady �ʵ� ���� true�� �� ���� �ݺ��Ѵ�.
		while(sharedArea.isReady != true) {
			System.out.println("������~");
		}
		//���� ������ �����͸� ���
		System.out.println("���� ������ ������ = " + sharedArea.result);
	}//run end
}//class end
