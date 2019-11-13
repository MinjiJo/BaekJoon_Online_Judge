//���ĺ��� ���ڸ� ���ÿ� ����ϴ� ��Ƽ������ ���α׷�
/*
 * JVM�� �����忡 �Ҵ��ϴ� �ð��� ���� ������ �ϵ������ �����̳� �ý��� ȯ�濡
       ���� �޶� ���� ����� �Ź� �ٸ� ����� ���� �� �ֽ��ϴ�.
 */
package ex17_1_Thread;

public class MultithreadExample1 {
	public static void main(String args[]) {
		Thread thread = new DigitThread();// �����带 ����
		
		//thread�� �����ŵ�ϴ�.
		thread.start();
		
		/*
		 - start() ���� :
		 Causes this thread to begin execution;
		 the Java Virtual Machine calls the run method of this thread. 
		 The result is that two threads are running concurrently:
		 the current thread (which returns from the call to the start method)
		 and the other thread (which executes its run method). 
		 - start()�� ���ؼ� run() �����մϴ�.
		   start method�� java.lang.Thread Ŭ������ �޼ҵ��Դϴ�.
		      ���� ������ Thread�� start�ϸ� Runnable ���°� �˴ϴ�.
		 - thread.run(); �̷��� ȣ�� ���� �ʽ��ϴ�.
		 */
		 for (char ch = 'A'; ch <= 'Z'; ch++)
			 System.out.print(ch);
		 
		 System.out.println("������ �̸� : " +
				 Thread.currentThread().getName());
	}
}
