package ex17_7_syn_problem;

public class PrintThread extends Thread {
	SharedArea sharedArea;

	PrintThread(SharedArea area){
		sharedArea = area;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			int total = sharedArea.account1.balance +
						sharedArea.account2.balance;
			System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è : " + total);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}//catch end
		}//for end
	}//run end
}//class end
