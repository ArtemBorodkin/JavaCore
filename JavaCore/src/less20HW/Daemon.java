package less20HW;

public class Daemon extends Thread{

	public Daemon() {
		setDaemon(true);
		start();
	}

	@Override
	public void run() {
		while(true){
			System.out.println("Loading...");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
		}
	}
	
	

}
