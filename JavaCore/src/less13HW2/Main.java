package less13HW2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import less13Practice.Gender;

public class Main {
	
	private static Color color;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Car> cars = new ArrayList<>();
		boolean isRun = true;
		
		while(isRun){
			printMenu();
			String yourChoice = scanner.nextLine().toUpperCase();
			switch(yourChoice){
			case"A":{
				addCar(cars, scanner, color);
				break;
			}
			case"B":{
				showTheCars(cars);
				break;
			}
			case"C":{
				searchByCabType(cars, scanner);
				break;
			}
			case"D":{
				System.out.print("Input color: ");
				Color color = Color.valueOf(scanner.next().toUpperCase());
				removeByBodyColor(cars, color);
				break;
			}
			case"E":{
				System.out.print("Input min wheel diameter: ");
				double min = scanner.nextDouble();
				System.out.println("Input max wheel diameter: ");
				double max = scanner.nextDouble();
				changeWheel(cars, min, max);
				break;
			}
			case"F":{
				removeCarByCapTypeAndHandlebarSize(cars, scanner);
				break;
			}
			case"G":{
				rememberCarIndex(cars, scanner);
			}
			default:{
				isRun = false;
			}
			}
		}
		

	}
	
	public static void printMenu(){
		System.out.println("A. Add a car");
		System.out.println("B. Show the cars");
		System.out.println("C. Search the car(s) by cab type" );
		System.out.println("D. Remove the car(s) by body color");
		System.out.println("E. Change wheel type to winter in the range wheel diameter");
		System.out.println("F. Remove car by cab type and handlebar size");
		System.out.println("G. Remember index of car by cab type");
		System.out.println("Other: exit");
		System.out.print("Choose: ");
	}
	
	public static void addCar(List<Car> cars, Scanner scanner, Color color){
		
		//handlebar
		String mark;
		String material;
		double size;
		boolean hasButton;
		
		System.out.println("__Handlebar__");
		System.out.print("Input mark: ");
		mark = scanner.next();
		System.out.print("Input material: ");
		material = scanner.next();
		System.out.print("Input size: ");
		size = scanner.nextDouble();
		System.out.print("Availability buttons Y or N: ");
		String button = scanner.next().toUpperCase();
		if(button.equals("Y")||button.equals("YES")){
			hasButton = true;
		}else{
			hasButton = false;
		}
		Handlebar handlebar = new Handlebar(mark, material, size, hasButton);
		
		//body
		String cabType;
		int doors;
		String col;
		
		System.out.println("__Body__");
		
		System.out.print("Input color: ");
		col = scanner.next().toUpperCase();
		if(col.equals("BLACK")||col.equals("BROWN")||col.equals("BURGUNDY")||
				col.equals("BLUE")||col.equals("CHERRY")||col.equals("GREEN")||
				col.equals("GOLD")||col.equals("RED")||col.equals("ORANGE")||
				col.equals("SILVER")||col.equals("WHITE")||col.equals("YELLOW")){
			color = Color.valueOf(col);
		}else{
		do{
			System.out.println("This color not present");
			System.out.println("Available colors");
			System.out.println("WHITE, BLACK, BLUE, GREEN, RED, YELLOW, ORANGE, SILVER, GOLD, CHERRY, BURGUNDY, BROWN");
			System.out.print("Choose color: ");
			col = scanner.next().toUpperCase();
			
		}while(!col.equals("BLACK")&& !col.equals("BROWN")&& !col.equals("BURGUNDY")&&
				!col.equals("BLUE")&& !col.equals("CHERRY")&& !col.equals("GREEN")&&
				!col.equals("GOLD")&& !col.equals("RED")&& !col.equals("ORANGE")&&
				!col.equals("SILVER")&& !col.equals("WHITE")&& !col.equals("YELLOW"));}
		
		

		System.out.print("Input cab type: ");
		cabType = scanner.next();
		System.out.print("Insert numbers doors: ");
		doors = scanner.nextInt();
		Body body = new Body(color, cabType, doors);
		
		//Wheel
		double diameter;
		
		System.out.println("__Wheel__");
		System.out.print("Input Wheel diameter: ");
		diameter = scanner.nextDouble();
		Wheel wheel = new Wheel(diameter, Type.SUMMER);
		
		System.out.println();
		cars.add(new Car(handlebar, body, wheel));
		
	}

	public static void showTheCars(List<Car> cars){
		
		Iterator<Car> iterator = cars.iterator();
		while(iterator.hasNext()){
			Car tempCar = iterator.next();
			System.out.println(tempCar);
		}
		
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
				System.out.println(tempCar.getWheel());
			}
		}
	}

	public static void removeCarByCapTypeAndHandlebarSize(List<Car> cars, Scanner scanner){
		
		System.out.print("Input cabType: ");
		String cab = scanner.next();
		System.out.print("Input min handlebar size: ");
		double min = scanner.nextDouble();
		System.out.print("Input max handlebar size: ");
		double max = scanner.nextDouble();
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
