//���̸� ����ϴ� Ŭ����
package ex17_12_notify_wait;
class PrintThread extends Thread {
	SharedArea sharedArea;
	public void run() {
		if(sharedArea.isReady != true) {//���̰� ����� �ϰ� �ִ� ���� ���
			/* ������ ��� - ���� ����� ���� ������ ��� üũ�ؾ� �߽��ϴ�.
			 * while (sharedArea.isReady != true){
			 		System.out.println("������~");
			 	}
			 */
			try {
				synchronized (sharedArea) {
					sharedArea.wait();//�ٸ� ������κ��� ��ȣ�� ��ٸ��ϴ�.
							//������ ����� ������ �ٸ� �����忡�� ��ȣ�� �����ϴ�.
				}
			}//try end
			catch(InterruptedException e) { //wait �޼ҵ尡 �߻��ϴ� �ͼ��� ó��
				System.out.println(e.getMessage());
			}//catch end
		}//if end
		System.out.println("���� ������ ������ = " + sharedArea.result);
	}//run end
}//class end
