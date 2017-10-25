package HwInterface;

public class Employee implements Salary{
	
	private final int hour; 
	
	private final int money;
	
	public Employee(int hour, int money) {
		this.hour = hour;
		this.money = money;
	}


	@Override
	public double salary() {
		return hour*money;
	}

}
