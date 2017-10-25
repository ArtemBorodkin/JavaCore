package HwInterface;

public class Worker implements Salary{
	
	private final int money;

	public Worker(int money) {
		this.money = money;
	}

	@Override
	public double salary() {
		return money;
	}

}
