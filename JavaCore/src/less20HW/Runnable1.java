package less20HW;

public class Runnable1 implements Runnable {

	private int[] fiboElement;

	private void fillArray() {
		fiboElement = new int[20];
		fiboElement[0] = 1;
		fiboElement[1] = 1;
		for (int i = 2; i < 20; i++) {
			fiboElement[i] = fiboElement[i - 1] + fiboElement[i - 2];
		}

	}

	@Override
	public void run() {
		fillArray();
		int index = fiboElement.length-1;
		do{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" "+fiboElement[index]);
		index--;
		}while(index>=0);
		
	}

}
