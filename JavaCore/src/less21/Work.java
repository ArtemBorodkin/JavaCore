package less21;

public class Work implements IWork{

	@Override
	@Wrapper(after = "My After", before = "Before before")
	public void doWork1() {
		System.out.println("work 1");
		
	}

	@Override
	@Wrapper()
	public void doWork2() {
		System.out.println("work 2");
		
		
	}

}
