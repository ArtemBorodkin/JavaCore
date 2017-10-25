package less11EnumHW;

public class Main {

	public static void main(String[] args) {
		
		Handlebar handlebar = new Handlebar("Audi","Steel",20,false);
		Wheel wheel = new Wheel();
		Body body = new Body("Sedan",4, 10);
		Car car = new Car(Color.BLUE, CapacityOfEngine.LITERS_1_6, handlebar, body, wheel);
		car.theCar();
		
		

	}

}
