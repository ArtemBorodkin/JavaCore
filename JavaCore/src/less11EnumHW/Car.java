package less11EnumHW;

public class Car {

	private Color color;

	private  CapacityOfEngine capacityOfEngine;
	
	private Handlebar handlebar;

	private Body body;

	private Wheel wheel;

	/**
	 * @param choose the color from collection (after dot)
	 * @param choose capacity of Engine 
	 */


	public Car(Color color, CapacityOfEngine capacityOfEngine, Handlebar handlebar, Body body, Wheel wheel) {
		this.color = color;
		this.capacityOfEngine = capacityOfEngine;
		this.handlebar = handlebar;
		this.body = body;
		this.wheel = wheel;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public CapacityOfEngine getCapacityOfEngine() {
		return capacityOfEngine;
	}

	public void setCapacityOfEngine(CapacityOfEngine capacityOfEngine) {
		this.capacityOfEngine = capacityOfEngine;
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
	
	

	

	@Override
	public String toString() {
		return "Car [color=" + color + ", capacityOfEngine=" + capacityOfEngine + ", handlebar=" + handlebar + ", body="
				+ body + ", wheel=" + wheel + "]";
	}

	public void theCar() {
		
		System.out.println(color);
		System.out.println(capacityOfEngine);
		increaseDiameter();
		replacementDoors();
		increaseSize();
	}

}
