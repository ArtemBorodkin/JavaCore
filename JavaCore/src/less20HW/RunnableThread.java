package less20HW;

import java.util.Scanner;

public class RunnableThread implements Runnable {

	private int[] fiboElement;
	
	private void fillArray() {
		System.out.print("Enter number to output decrease Fibonacci digits: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		fiboElement = new int[n];
		fiboElement[0] = 1;
		fiboElement[1] = 1;
		for (int i = 2; i < n; i++) {
			fiboElement[i] = fiboElement[i - 1] + fiboElement[i - 2];
		}
		
	}

	@Override
	public void run() {
		fillArray();
		System.out.print("Runnable: ");
		int index = fiboElement.length-1;
		do{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(fiboElement[index]+" ");
		index--;
		}while(index>=0);
		System.out.println();
		
	}

}
