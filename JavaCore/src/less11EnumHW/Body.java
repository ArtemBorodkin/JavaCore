package less11EnumHW;

public class Body {
	
	public String cabType;
    
	public int doors = 4;
	
	public double strength;
	
	public String getCabType() {
		return cabType;
	}
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public double getStrength() {
		return strength;
	}
	public void setStrength(double strength) {
		this.strength = strength;
	}
	
	
	public String toString() {
		return "Body [cabType = " + cabType + ", doors = " + doors + ", strength = " + strength + "]";
	}
	
	public Body(String cabType, int doors, double strength) {
		this.cabType = cabType;
		this.doors = doors;
		this.strength = strength;
	}
	
	public void replacementDoors(){
		doors -= 1; 
		System.out.println(doors);
	}
	
	
	
}
