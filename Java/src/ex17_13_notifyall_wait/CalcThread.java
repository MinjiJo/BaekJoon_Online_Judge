//파이를 계산하는 스레드 클래스
package ex17_13_notifyall_wait;
class CalcThread extends Thread {
	SharedArea sharedArea;
	public void run() {
		double total = 0.0;
		//파이를 계산하는 부분
		for (int cnt = 1; cnt < 1000000000; cnt += 2)
			if (cnt / 2 % 2 == 0)
				total += 1.0 / cnt;
			else
				total -= 1.0 / cnt;
			
		sharedArea.result = total * 4;
		sharedArea.isReady = true;//파이 계산 모두 끝났다라는 의미
		
		synchronized (sharedArea) {
			sharedArea.notifyAll(); //기다리고 있는 모든 스레드로 신호를 보내는 메소드
			//sharedArea.notify(); //하나의 스레드만 출력되게 됨. 하나에게만 신호를 보내기 때문.
		}
	}
}
