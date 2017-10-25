package less14HW;


public class Car {

	private Handlebar handlebar;

	private Body body;

	private Wheel wheel;

	
	public Car(Handlebar handlebar, Body body, Wheel wheel) {

		this.handlebar = handlebar;
		this.body = body;
		this.wheel = wheel;
	}

	public Handlebar getHandlebar() {
		return handlebar;
	}

	public void setHandlebar(Handlebar handlebar) {
		this.handlebar = handlebar;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void increaseDiameter() {

		wheel.increaseDiameter();
	}

	public void replacementDoors() {

		body.replacementDoors();
	}

	public void increaseSize() {

		handlebar.increaseSize();

	}
	
	public void changeWheel(){
		
		wheel.changeWheel();
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((handlebar == null) ? 0 : handlebar.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Car))
			return false;
		Car other = (Car) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (handlebar == null) {
			if (other.handlebar != null)
				return false;
		} else if (!handlebar.equals(other.handlebar))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [ handlebar=" + handlebar + ", body=" + body + ", wheel=" + wheel + "]";
	}

	public void theCar() {
		increaseDiameter();
		replacementDoors();
		increaseSize();
	}

}
