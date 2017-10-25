package less20HW;

public class FibanacciNumbers {
	
	 private int n0 = 0, n1 = 1, n2 = 1;

		public void fibonacci() {
			System.out.print(n2 + " ");
			n2 = n0 + n1;
			n0 = n1;
			n1 = n2;
		}
}
