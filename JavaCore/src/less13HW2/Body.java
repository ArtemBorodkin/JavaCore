package less13HW2;


public class Body {
	
	private Color color;
	
	private String cabType;
    
	private int doors;
	
	
	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


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


	public void replacementDoors(){
		doors -= 1; 
		System.out.println(doors);
	}



	public Body(Color color, String cabType, int doors) {
		this.color = color;
		this.cabType = cabType;
		this.doors = doors;
		
	}



	@Override
	public String toString() {
		return "Body [Color=" + color + ", cabType=" + cabType + ", doors=" + doors + "]";
	}
	
	
	
}
