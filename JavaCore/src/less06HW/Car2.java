package less06HW;

import java.util.*;

public class Car2 {

	String input;
	int km;
	int km1;
	int fuelVolume;
	String brandOfCar = "Audi A6 Avant";
	String color = "Cherry";
	int consumption = 10; // L/100km
	int tankCapacity = 70; // Liters
	int kilometrage = 350000; // km

	Car2() {
		Scanner in = new Scanner(System.in);
		distance();

		do {
			drive(km);
			reFuel(fuelVolume);
			System.out.println("Do you want continue? (Y/N)");
			input = in.next();
		} while (input.equals("Y")||input.equals("y")||input.equals("yes"));
		
	
	}

	void drive(int km1) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your distance:");

		km1 = in.nextInt();
		this.km = this.km + km1;

		float maxDistance = tankCapacity / consumption * 100;
		if (maxDistance > km) {
			System.out.println("We drove the distance " + km + "; now kilometrage is " + (kilometrage + km));
		} else {
			System.out.println(
					"We drove max distance " + maxDistance + "; now kilometrage is " + (kilometrage + maxDistance));
		}
	}

	void reFuel(int fuelVolume) {

		int fuelDistance = km * consumption / 100;
		if (fuelDistance < tankCapacity) {
			fuelVolume = tankCapacity - fuelDistance;
			System.out.println("Fuel volume is " + fuelVolume);

		} else {
			if (fuelDistance > tankCapacity) {
				fuelVolume = fuelDistance - tankCapacity;
				System.out.println("You need further " + fuelVolume + " liters of petrol to finish your ride");

			} else {
				System.out.println("Your tank is empty, you need refueling!");
			}
		}

	}

	void distance() {

		System.out.println("Your car is " + brandOfCar + "  Color " + color);
		System.out.println("consumption = " + consumption + "(L/100km); " + "tank capacity = " + tankCapacity + "(L) ");
		System.out.println("Kilometrage = " + kilometrage + " km ");

	}

	public static void main(String[] args) {
		Car2 car2 = new Car2();

	}

}
