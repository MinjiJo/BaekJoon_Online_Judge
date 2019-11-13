package ex17_9_syn_format1;

public class PrintThread extends Thread {
	SharedArea sharedArea;

	PrintThread(SharedArea area){
		sharedArea = area;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			int sum = sharedArea.getTotal();
			System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è: " + sum);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}//catch end
		}//for end
	}//run end
}//class end
