package less20HW;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyThread extends Thread {
	
	public MyThread() {
		start();
	}
	
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		FibanacciNumbers fibClass = new FibanacciNumbers();
		int count = 0;
		do {
			System.out.print("Enter number to output growth digits of Fibanacci: ");
			try {
				count = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Oops!! Please enter only integral numbers");
				System.err.println(" "+scanner.next() + " - was not valid input.");
			}
		} while (count == 0);
		int number = 0;
		System.out.print("Thread: ");
		while (count > number) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			fibClass.fibonacci();
			number++;
		}

	}

}
