package homework_190924_Thread_sleep_Runnable;

import java.text.SimpleDateFormat;
import java.util.*;

public class Time implements Runnable {

	public void run() {
		SimpleDateFormat time = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm�� ss��");
		for (;;) {
			Date d = new Date();
			System.out.println(time.format(d));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
