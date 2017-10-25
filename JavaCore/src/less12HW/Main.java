package less12HW;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		
		Handlebar handlebar = new Handlebar("mersedes", "leather", 17.2, false);
		Body body = new Body(Color.RED,"sedan", 5);
		Wheel wheel = new Wheel(20);
		cars.add(new Car( handlebar, body, wheel));
		
		body = new Body(Color.GREEN,"sedan", 4);
		wheel = new Wheel(10);
		handlebar = new Handlebar("bmw", "wood", 17.2, true);
		cars.add(new Car( handlebar, body, wheel));
		
		for (Car car : cars) {
			if (car.getHandlebar().hasButton()) {
				car.increaseDiameter();
			}
		}
		
		for(Car car : cars) {
			System.out.println(car.getBody());
		}
		System.out.println(cars);
		
		List<Car> carsWithRedColor = filterByColor(cars, Color.RED);
		System.out.println(carsWithRedColor);
		
	}
	
	
	public static List<Car> filterByColor(List<Car> cars,Color color) {
		List<Car> carsWithColor = new ArrayList();
		
		for (Car car : cars) {
				if(car.getBody().getColor() == color) {
					carsWithColor.add(car);
				}
		}
		
		return carsWithColor;
	}
}
