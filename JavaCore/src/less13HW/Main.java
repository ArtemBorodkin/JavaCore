package less13HW;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



public class Main{
	
	private static Color color;

	public static void main(String[] args) {

		List<Car> cars = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		Handlebar handlebar = new Handlebar("mersedes", "leather", 17.2, false);
		Body body = new Body(Color.RED, "sedan", 5);
		Wheel wheel = new Wheel(20, Type.SUMMER);
		cars.add(new Car(handlebar, body, wheel));

		handlebar = new Handlebar("maserati", "leather", 16, true);
		body = new Body(Color.BLACK, "cabriolet", 2);
		wheel = new Wheel(18, Type.SUMMER);
		cars.add(new Car(handlebar, body, wheel));

		handlebar = new Handlebar("ferrari", "leather", 18, true);
		body = new Body(Color.RED, "sport", 2);
		wheel = new Wheel(20, Type.SUMMER);
		cars.add(new Car(handlebar, body, wheel));

		handlebar = new Handlebar("bmw", "leather", 16, false);
		body = new Body(Color.WHITE, "sedan", 4);
		wheel = new Wheel(18, Type.SUMMER);
		cars.add(new Car(handlebar, body, wheel));

		handlebar = new Handlebar("lanos", "leather", 18, true);
		body = new Body(Color.GREEN, "universal", 4);
		wheel = new Wheel(19, Type.SUMMER);
		cars.add(new Car(handlebar, body, wheel));

		//1
		searchByCabType(cars, scanner);
		//2
		System.out.print("Input Body color: ");
		Color color = Color.valueOf(scanner.next().toUpperCase());
		removeByBodyColor(cars, color);
		System.out.println(cars);
		//3
		System.out.print("Input min wheel diameter: ");
		double min = scanner.nextDouble();
		System.out.print("Input max wheel diameter:");
		double max = scanner.nextDouble();
		changeWheel(cars, min, max);
		System.out.println(cars);
		//4
		removeCarByCapTypeAndHandlebarSize(cars,scanner, min, max);
		//5
		rememberCarIndex(cars, scanner);
		
		
		
	}	
	
	public static void searchByCabType(List<Car> cars, Scanner scanner){
		
		System.out.print("Input cabType: ");
		String cab = scanner.next();
		Iterator<Car> iterator = cars.iterator(); 
		while (iterator.hasNext()) {
			Car tempCar = iterator.next();
			if (cab.equals(tempCar.getBody().getCabType())) {
				System.out.println(tempCar);
			}

		}
		
	}
	
	public static void removeByBodyColor(List<Car> cars, Color color){
		
		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car tempCar = iterator.next();
			if (color == tempCar.getBody().getColor()) {
				iterator.remove();
			}

		}
		
	}
		
	public static void changeWheel(List<Car> cars, double min, double max){
		
		Iterator<Car> iterator = cars.iterator();
		while(iterator.hasNext()){
			Car tempCar = iterator.next();
			if(tempCar.getWheel().getDiameter()> min && tempCar.getWheel().getDiameter() < max ){
				tempCar.changeWheel();
			}
		}
	}

	public static void removeCarByCapTypeAndHandlebarSize(List<Car> cars, Scanner scanner, double min, double max){
		
		System.out.print("Input cabType: ");
		String cab = scanner.next();
		System.out.print("Input min handlebar size: ");
		min = scanner.nextDouble();
		System.out.print("Input max handlebar size: ");
		max = scanner.nextDouble();
		Iterator<Car> iterator = cars.iterator(); 
		while (iterator.hasNext()) {
			Car tempCar = iterator.next();
			if (cab.equals(tempCar.getBody().getCabType())&&tempCar.getHandlebar().getSize() > min && tempCar.getHandlebar().getSize() < max){
				iterator.remove();
			}
		}
	}

	public static void rememberCarIndex(List<Car> cars, Scanner scanner){
		
		System.out.print("Input cabType: ");
		String cab = scanner.next();
		int index = 0;
		Car tempCar = null;
		
		List<Integer> indexes = new ArrayList<>();
		Iterator<Car> iterator = cars.iterator(); 
		while (iterator.hasNext()) {
			tempCar = iterator.next();
			if (cab.equals(tempCar.getBody().getCabType())) {
				indexes.add(index);
				}
			index++;
			}
		System.out.println(indexes);
		
	}
}


