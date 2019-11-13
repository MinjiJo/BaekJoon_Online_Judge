package homework_190924_Thread_sleep_Runnable;

public class Main {
	public static void main(String[] args) {
		Thread thread = new Thread(new Time());
		thread.start();
	}
}
