package less12HW;

public class Wheel{
	
	private double diameter;
	
	

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}


	public Wheel(double diameter) {
		this.diameter = diameter;
	}


	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + "]";
	}



	public void increaseDiameter(){
		diameter *= 2;
		System.out.println("Wheel diameter = " +diameter);
	}
	
	
	
	
	
	

}
