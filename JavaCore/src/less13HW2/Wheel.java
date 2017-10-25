package less13HW2;

public class Wheel{
	
	private double diameter;
	
	private Type type;


	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	

	public Wheel(double diameter, Type type) {
		this.diameter = diameter;
		this.type = type;
	}
	
	

	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", type=" + type + "]";
	}

	public void increaseDiameter(){
		diameter *= 2;
		System.out.println("Wheel diameter = " +diameter);
	}
	
	public void changeWheel(){
		type = type.WINTER;
	}
	
	
	
	
	
	

}
