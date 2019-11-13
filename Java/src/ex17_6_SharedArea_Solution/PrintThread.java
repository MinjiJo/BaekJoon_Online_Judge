package ex17_6_SharedArea_Solution;

class PrintThread extends Thread {
	SharedArea sharedArea;
	public void run() {
		//SharedArea 객체의 isReady 필드 값이 true될 때 까지 반복한다.
		while(sharedArea.isReady != true) {
			System.out.println("실행중~");
		}
		//공유 영역의 데이터를 출력
		System.out.println("공유 영역의 데이터 = " + sharedArea.result);
	}//run end
}//class end
