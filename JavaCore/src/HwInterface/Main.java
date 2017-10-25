package HwInterface;

public class Main {

	public static void main(String[] args) {
		Salary salary = new Employee(1, 100);
		Salary salary2 = new Worker(10000);
		Salary.print(salary);
		Salary.print(salary2);

	}

}
