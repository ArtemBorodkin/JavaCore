package HwInterface;

public interface Salary {
	
	double salary();
	
	public static void print(Salary salary){
		System.out.println("Payment = "+ salary.salary());
	}

}
