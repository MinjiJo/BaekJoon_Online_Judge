package ex17_9_syn_format2;

public class TransferThread extends Thread {
	SharedArea sharedArea;

	TransferThread(SharedArea area) {
		sharedArea = area;
	}

	public void run() {
		for (int cnt = 0; cnt < 12; cnt++) {
			sharedArea.transfer();
		} // for end
	}// run end
}// class end
