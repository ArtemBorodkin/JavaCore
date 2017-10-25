package less13HW2;


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
	public String toString() {
		return "Car [ handlebar=" + handlebar + ", body=" + body + ", wheel=" + wheel + "]";
	}

	public void theCar() {
		increaseDiameter();
		replacementDoors();
		increaseSize();
	}

}
