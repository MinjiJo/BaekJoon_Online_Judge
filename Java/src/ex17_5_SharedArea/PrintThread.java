package ex17_5_SharedArea;

class PrintThread extends Thread {
	SharedArea sharedArea;
	public void run() {
		//���� ������ �����͸� ���
		System.out.println("���� ������ ������ = " + sharedArea.result);
	}
}
