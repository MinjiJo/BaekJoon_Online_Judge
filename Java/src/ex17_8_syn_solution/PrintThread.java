package ex17_8_syn_solution;

public class PrintThread extends Thread {
	SharedArea sharedArea;

	PrintThread(SharedArea area){
		sharedArea = area;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			/*
			 synchronized 키워드를 사용해서 블록으로 묶은 부분을 동기화 블럭이라고 합니다.
			 */
			//동기화 시작
			synchronized (sharedArea) {
			int total = sharedArea.account1.balance +
						sharedArea.account2.balance;
			System.out.println("계좌 잔액 합계 : " + total);
			}
			//동기화 끝
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}//catch end
		}//for end
	}//run end
}//class end
