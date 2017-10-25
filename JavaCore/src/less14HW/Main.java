package less14HW;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Set<Car> cars = new LinkedHashSet<>();
		boolean isRun = true;

		Handlebar handlebar = new Handlebar("mersedes", "leather", 17.2, false);
		Body body = new Body(Color.RED, "sedan", 5);
		Wheel wheel = new Wheel(20, Type.WINTER);
		cars.add(new Car(handlebar, body, wheel));

		handlebar = new Handlebar("maserati", "leather", 16, true);
		body = new Body(Color.BLACK, "cabriolet", 2);
		wheel = new Wheel(18, Type.SUMMER);
		cars.add(new Car(handlebar, body, wheel));

		handlebar = new Handlebar("ferrari", "leather", 18, true);
		body = new Body(Color.RED, "sport", 2);
		wheel = new Wheel(22, Type.WINTER);
		cars.add(new Car(handlebar, body, wheel));

		handlebar = new Handlebar("bmw", "leather", 16, false);
		body = new Body(Color.WHITE, "sedan", 4);
		wheel = new Wheel(18, Type.SUMMER);
		cars.add(new Car(handlebar, body, wheel));

		handlebar = new Handlebar("lanos", "leather", 18, true);
		body = new Body(Color.GREEN, "universal", 4);
		wheel = new Wheel(19, Type.SUMMER);
		cars.add(new Car(handlebar, body, wheel));

		while (isRun) {
			System.out.println("1.Change wheel type by body color and wheel diameter");
			System.out.println("2.Remove car(s) by range of wheel diameter");
			System.out.println("3.Search car by type and diameters of wheel");
			System.out.print("Your choice: ");
			String choice = scanner.next();
			switch (choice) {
			case "1": {
				changeWheelTypeByBodyColorAndWheelDiameter(cars, scanner);
				break;
			}
			case "2": {
				removeCarsByRangeOfWheeldiameters(cars, scanner);
				System.out.println(cars);
				break;
			}
			case "3": {
				searchCarByTypeAndDiametersOfWheel(cars, scanner);
			}
			default: {
				isRun = false;
			}
			}
		}

	}

	public static void changeWheelTypeByBodyColorAndWheelDiameter(Set<Car> cars, Scanner scanner) {

		System.out.print("Input Body color: ");
		String col = scanner.next().toUpperCase();
		System.out.print("Input wheel diameter: ");
		double yourDiameter = scanner.nextDouble();
		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car tempCar = iterator.next();
			if (Color.valueOf(col).equals(tempCar.getBody().getColor())
					&& tempCar.getWheel().getDiameter() == yourDiameter) {
				System.out.println("What type of wheels do you need winter or summer?");
				String type = scanner.next().toUpperCase();
				if (type.equals("WINTER") || type.equals("W")) {
					type = "WINTER";
				} else {
					type = "SUMMER";
				}
				tempCar.getWheel().setType(Type.valueOf(type));
				System.out.println(tempCar);
			}
		}

	}

	public static void removeCarsByRangeOfWheeldiameters(Set<Car> cars, Scanner scanner) {

		System.out.print("Enter min diameter of Wheel: ");
		double min = scanner.nextDouble();
		System.out.print("Enter max diameter of Wheel: ");
		double max = scanner.nextDouble();
		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car tempCar = iterator.next();
			if (tempCar.getWheel().getDiameter() > min && tempCar.getWheel().getDiameter() < max) {
				iterator.remove();
			}

		}
	}

	public static void searchCarByTypeAndDiametersOfWheel(Set<Car> cars, Scanner scanner) {

		System.out.print("Enter wheel type (winter or summer): ");
		String type = scanner.next().toUpperCase();
		if (type.equals("WINTER") || type.equals("W")) {
			type = "WINTER";
		} else {
			type = "SUMMER";
		}
		System.out.print("Enter min diameter of Wheel: ");
		double min = scanner.nextDouble();
		System.out.print("Enter max diameter of Wheel: ");
		double max = scanner.nextDouble();
		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car tempCar = iterator.next();
			if (Type.valueOf(type) == tempCar.getWheel().getType() && tempCar.getWheel().getDiameter() > min
					&& tempCar.getWheel().getDiameter() < max) {
				System.out.println(tempCar);
			}
		}

	}

}
