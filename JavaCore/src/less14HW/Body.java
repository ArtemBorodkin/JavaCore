package less14HW;


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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cabType == null) ? 0 : cabType.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + doors;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Body))
			return false;
		Body other = (Body) obj;
		if (cabType == null) {
			if (other.cabType != null)
				return false;
		} else if (!cabType.equals(other.cabType))
			return false;
		if (color != other.color)
			return false;
		if (doors != other.doors)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Body [Color=" + color + ", cabType=" + cabType + ", doors=" + doors + "]";
	}
	
	
	
}
