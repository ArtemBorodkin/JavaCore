package less12HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
	
	private static Color color;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Car> cars = new ArrayList<>();
		boolean isRun = true;
		
		while(isRun){
			System.out.println("A. Add the car");
			System.out.println("B. Show the cars");
			System.out.println("1. Find the car by Wheel diameter");
			System.out.println("2. Find the car by Wheel diameter and body color");
			System.out.println("3. Change handlebar by the body color");
			System.out.println("4. Increase diameter Wheel twice, if helm have buttons");
			System.out.println("5. Change the car until max Wheel diameter");
			System.out.println("Other exit");
			System.out.print("Choose: ");
			
			switch(scanner.next().toUpperCase()){
			case "A":{
				addTheCar(cars, scanner, color);
				break;
			}
			case "B":{
				showTheCar(cars);
				break;
			}
			case"1":{
				findTheCarByWheelDiameter(cars, scanner);
				break;
			}
			case"2":{
				findTheCarByWheelDiameterAndBodyColor(cars, scanner, color);
				break;
			}
			case"3":{
				changeHandleabrByTheBodyColor(cars, scanner, color);
				break;
			}
			case"4":{
				increaseWheelDiameter(cars);
				break;
			}
			case"5":{
				changeCar(cars, scanner);
			}
			default:{
				isRun = false;
			}
			}
		}
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
		
		System.out.println();
		System.out.print("Input max diameter: ");
		for (Car car : cars) {
			if(car.getWheel().getDiameter() < scanner.nextDouble()){
				
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

