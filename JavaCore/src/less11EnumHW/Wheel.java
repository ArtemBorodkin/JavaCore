package less11EnumHW;

public class Wheel{
	
	public double diameter = 20;
	public double diskSize;
	public double thickness;
	
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double getDiskSize() {
		return diskSize;
	}
	public void setDiskSize(double diskSize) {
		this.diskSize = diskSize;
	}
	public double getThickness() {
		return thickness;
	}
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	
	public String toString() {
		return "Wheel [diameter = " + diameter + ", diskSize = " + diskSize + ", thickness = " + thickness + "]";
	}
	
	public Wheel() {
		this.diameter = diameter;
		this.diskSize = diskSize;
		this.thickness = thickness;
	}

	public void increaseDiameter(){
		diameter += 1;
		System.out.println(diameter);
	}
	
	
	
	
	
	

}
