//파이를 출력하는 클래스
package ex17_13_notifyall_wait;

class LuxuryPrintThread extends Thread {
	SharedArea sharedArea;

	public void run() {
		if (sharedArea.isReady != true) {
			synchronized (sharedArea) {
				try {
					sharedArea.wait();// 신호를 기다립니다.
				} catch (InterruptedException e) { // wait 메소드가 발생하는 익셉션 처리
					System.out.println(e.getMessage());
				} // catch end
			} // 동기화 end
		} // if end
		System.out.println("*** π = " + sharedArea.result + " ***");
		//π : ㅎ+한자키
	}// run end
}// class end
