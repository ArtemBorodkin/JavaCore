package less12HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import less12.Person;

public class Main2 {

	private static Color color;

	public static void main(String[] args) {

		List<Car> cars = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		Handlebar handlebar = new Handlebar("mersedes", "leather", 17.2, false);
		Body body = new Body(Color.RED, "sedan", 5);
		Wheel wheel = new Wheel(20);
		cars.add(new Car(handlebar, body, wheel));

		handlebar = new Handlebar("maserati", "leather", 16, true);
		body = new Body(Color.BLACK, "cabriolet", 2);
		wheel = new Wheel(18);
		cars.add(new Car(handlebar, body, wheel));

		handlebar = new Handlebar("ferrari", "leather", 18, true);
		body = new Body(Color.RED, "sport", 2);
		wheel = new Wheel(20);
		cars.add(new Car(handlebar, body, wheel));

		handlebar = new Handlebar("bmw", "leather", 16, false);
		body = new Body(Color.WHITE, "sedan", 4);
		wheel = new Wheel(18);
		cars.add(new Car(handlebar, body, wheel));

		handlebar = new Handlebar("lanos", "leather", 18, true);
		body = new Body(Color.GREEN, "universal", 4);
		wheel = new Wheel(19);
		cars.add(new Car(handlebar, body, wheel));

		// 1 - Diameter
		System.out.print("1. ");
		findTheCarByWheelDiameter(cars, scanner);

		// 2 - Diameter and Body color
		System.out.println();
		System.out.print("2. ");
		findTheCarByWheelDiameterAndBodyColor(cars, scanner, color);
		
		// 3 - Body color change handlebar 
		System.out.println();
		System.out.print("3. ");
		changeHandleabrByTheBodyColor(cars, scanner, color);

		// 4 - buttons on handlebar
		System.out.println();
		System.out.print("4. ");
		increaseWheelDiameter (cars);

		// 5 - Filter diameter
		System.out.println();
		System.out.print("5. ");
		changeCar(cars, scanner);

	}


		// A
		public static void addTheCar(List<Car> cars, Scanner scanner, Color color){
				//Handlebar
			    String mark;
			    String material;
			    double size;
			    boolean hasButton;
			    
			    String input; // for boolean hasButton
			    
			    System.out.println();
			    System.out.print("Input mark of handlebar: ");
			    mark = scanner.next();
			    System.out.print("Input material: ");
			    material = scanner.next();
			    System.out.print("Input size: ");
			    size = scanner.nextDouble();
			    System.out.print("Availability buttons - yes(Y) or now(N)");
			    input = scanner.next();
			    if(input.equals(input.equals("Y")||input.equals("y")||input.equals("yes"))){
			    	hasButton = true;
			    }else{
			    	hasButton = false;
			    }
				Handlebar handlebar = new Handlebar(mark, material, size, hasButton);
				
				//Body
				String cabType;
				int doors;
				
				System.out.println();
				System.out.print("Input body color: ");
				color = Color.valueOf(scanner.next().toUpperCase());
				System.out.print("Input care type: ");
				cabType = scanner.next();
				System.out.print("Input number of doors: ");
				doors = scanner.nextInt();
				Body body = new Body(color, cabType, doors);
				
				//Wheel
				double diameter;
				
				System.out.println();
				System.out.print("Input Wheel diameter: ");
				diameter = scanner.nextDouble();
				Wheel wheel = new Wheel(diameter);
				
				System.out.println();
				cars.add(new Car(handlebar, body, wheel));
		}
		// B
		public static void showTheCar(List<Car> cars){
			
			for (Car car : cars) {
				System.out.println(cars);
			}
		}
		// 1
		public static void findTheCarByWheelDiameter(List<Car> cars, Scanner scanner){
			
			System.out.print("Input size of Wheel diameter: ");
			double x = scanner.nextDouble();
			for (Car car : cars) {
				if(car.getWheel().getDiameter() == x){
					System.out.println(car);
				}
			}
		}
		// 2
		public static void findTheCarByWheelDiameterAndBodyColor(List<Car> cars, Scanner scanner, Color color){
			
			System.out.print("Input size of Wheel diameter: ");
			double dia = scanner.nextDouble();
			System.out.print("Input body color: ");
			Color col = Color.valueOf(scanner.next().toUpperCase());
			for (Car car : cars) {
				if(car.getWheel().getDiameter() == dia && car.getBody().getColor() == col){
					System.out.println(car);
				}
			}
			
		}
		// 3
		public static void changeHandleabrByTheBodyColor(List<Car> cars, Scanner scanner, Color color){
			
			System.out.print("Input body color: ");
			Color col = Color.valueOf(scanner.next().toUpperCase());
			for (Car car : cars) {
				if(car.getBody().getColor() == col){
				    String mark;
				    String material;
				    double size;
				    boolean hasButton;
				    
				    String input;
				    
				    System.out.println();
				    System.out.println("Change the handlebar");
				    System.out.print("Input mark of handlebar: ");
				    mark = scanner.next();
				    System.out.print("Input material: ");
				    material = scanner.next();
				    System.out.print("Input size: ");
				    size = scanner.nextDouble();
				    System.out.print("Availability buttons - yes(Y) or now(N)");
				    input = scanner.next().toUpperCase();
				    if(input.equals(input.equals("Y")||input.equals("YES"))){
				    	hasButton = true;
				    }else{
				    	hasButton = false;
				    }
				    car.setHandlebar(new Handlebar(mark, material, size, hasButton));
				    System.out.println(car);
				}
			}
			
		}
		// 4
		public static void increaseWheelDiameter(List<Car> cars){
			
			for (Car car : cars) {
				if(car.getHandlebar().hasButton()){
					car.increaseDiameter();
					System.out.println(car);
				}
			}
		}
		// 5
		public static void changeCar(List<Car> cars, Scanner scanner){
			
			
			System.out.print("Input max diameter: ");
			double input1 = scanner.nextDouble();
			for (Car car : cars) {
				if(car.getWheel().getDiameter() < input1){
					
					//Handlebar
					String mark;
				    String material;
				    double size;
				    boolean hasButton;
				    
				    String input;
				    
				    System.out.println();
				    System.out.print("Input mark of handlebar: ");
				    mark = scanner.next();
				    System.out.print("Input material: ");
				    material = scanner.next();
				    System.out.print("Input size: ");
				    size = scanner.nextDouble();
				    System.out.print("Availability buttons - yes(Y) or now(N)");
				    input = scanner.next();
				    if(input.equals(input.equals("Y")||input.equals("y")||input.equals("yes"))){
				    	hasButton = true;
				    }else{
				    	hasButton = false;
				    }
					car.setHandlebar(new Handlebar(mark, material, size, hasButton));
					
					//Body
					String cabType;
					int doors;
					
					System.out.println();
					System.out.print("Input body color: ");
					color = Color.valueOf(scanner.next().toUpperCase());
					System.out.print("Input care type: ");
					cabType = scanner.next();
					System.out.print("Input number of doors: ");
					doors = scanner.nextInt();
					car.setBody(new Body(color, cabType, doors));
					
					//Wheel
					double diameter;
					
					System.out.println();
					System.out.print("Input Wheel diameter: ");
					diameter = scanner.nextDouble();
					car.setWheel(new Wheel(diameter));
					
					System.out.println(car);
					
					
					
				}
				
			}
			
		
		}
			
	}


