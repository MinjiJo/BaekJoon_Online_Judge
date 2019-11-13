package ex17_8_syn_solution;

public class PrintThread extends Thread {
	SharedArea sharedArea;

	PrintThread(SharedArea area){
		sharedArea = area;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			/*
			 synchronized Ű���带 ����ؼ� ������� ���� �κ��� ����ȭ ���̶�� �մϴ�.
			 */
			//����ȭ ����
			synchronized (sharedArea) {
			int total = sharedArea.account1.balance +
						sharedArea.account2.balance;
			System.out.println("���� �ܾ� �հ� : " + total);
			}
			//����ȭ ��
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}//catch end
		}//for end
	}//run end
}//class end
