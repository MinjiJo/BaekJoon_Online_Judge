package ex17_3_Thread_four;

class AlphabetThread extends Thread{
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			 System.out.print(ch);
			 try {
				 Thread.sleep(1000);
				 //sleep �޼ҵ� : ���� �ð��� ����Ǳ⸦ ��ٸ��� �޼ҵ�.
				 //public static void sleep(long millis) throws
			 } catch(InterruptedException e) {
				 System.out.println(e.getMessage());
			 }//catch end
		 }//for end
	}
}
