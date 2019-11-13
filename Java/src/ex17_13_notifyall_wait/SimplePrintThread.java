//���̸� ����ϴ� Ŭ����
package ex17_13_notifyall_wait;

class SimplePrintThread extends Thread {
	SharedArea sharedArea;

	public void run() {
		if (sharedArea.isReady != true) {
			synchronized (sharedArea) {
				try {
					sharedArea.wait();// ��ȣ�� ��ٸ��ϴ�.
				} catch (InterruptedException e) { // wait �޼ҵ尡 �߻��ϴ� �ͼ��� ó��
					System.out.println(e.getMessage());
				} // catch end
			} // ����ȭ end
		} // if end
		System.out.printf("SimplePrintThread : %.2f %n", sharedArea.result);
	}// run end
}// class end
