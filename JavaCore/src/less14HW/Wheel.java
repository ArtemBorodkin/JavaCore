package less14HW;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(diameter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Wheel))
			return false;
		Wheel other = (Wheel) obj;
		if (Double.doubleToLongBits(diameter) != Double.doubleToLongBits(other.diameter))
			return false;
		if (type != other.type)
			return false;
		return true;
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
