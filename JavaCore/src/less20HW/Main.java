package less20HW;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new MyThread();
//		Thread thread2 = new Thread(new RunnableThread());
		thread.join();
		System.out.println();
//		thread2.start();
//		thread2.join();
		System.out.println("Done");
//		new Daemon();
//		ExecutorService service = Executors.newFixedThreadPool(2);
//		service.execute(new Thread(new Runnable1()));
//		service.execute(new Thread(new Runnable2()));
//		service.shutdown();
	}

}
