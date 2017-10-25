package less14HW2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;



public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Set<Commodity> commodities = new LinkedHashSet<>();

		commodities.add(new Commodity(14, "silk", 25.55));
		commodities.add(new Commodity(15, "nylon", 20.50));
		commodities.add(new Commodity(16, "cotton", 27.70));
		commodities.add(new Commodity(17, "leather", 35));
		boolean isRun = true;
		while (isRun) {
			printMenu();
			String choice = scanner.next();
			System.out.println();
			switch (choice) {
			case "1": {
				addCommodity(commodities, scanner);
				break;
			}
			case "2": {
				removeCommodity(commodities, scanner);
				break;
			}
			case "3": {
				changeCommodity(commodities, scanner);
				break;
			}
			}
		}
	}

	public static void printMenu() {

		System.out.println("_|MENU|_________________________");
		System.out.println("1).Add your commodity in the list");
		System.out.println("2).Remove commodity from list");
		System.out.println("3).Change commodity in list");
		System.out.print("Choose:");

	}

	public static void addCommodity(Set<Commodity> commodities, Scanner scanner) {

		double size;
		String material;
		double price;

		System.out.print("Enter size: ");
		size = scanner.nextDouble();
		System.out.print("Enter material: ");
		material = scanner.next();
		System.out.print("Enter price: ");
		price = scanner.nextDouble();
		commodities.add(new Commodity(size, material, price));

		int i = 0;
		System.out.println("Now your collection of commodities:");
		for (Iterator iterator = commodities.iterator(); iterator.hasNext();) {
			i++;
			Commodity commodity = (Commodity) iterator.next();
			System.out.println(i + ") " + commodity);
		}
		System.out.println();

	}

	public static void removeCommodity(Set<Commodity> commodities, Scanner scanner) {

		String choice;

		System.out.println("A.Remove by size");
		System.out.println("B.Remove by material");
		System.out.println("C.Remove by price");
		System.out.println("D.Remove by all Commodity attributes");
		System.out.print("Choose:");
		choice = scanner.next().toUpperCase();

		if (choice.equals("A")) {
			System.out.print("Enter size: ");
			double yourSize = scanner.nextDouble();
			Iterator<Commodity> iterator = commodities.iterator();
			while (iterator.hasNext()) {
				Commodity tempCom = iterator.next();
				if (yourSize == tempCom.size) {
					iterator.remove();
				}
			}
		}
		if (choice.equals("B")) {
			System.out.print("Enter material: ");
			String yourMaterial = scanner.next();
			Iterator<Commodity> iterator = commodities.iterator();
			while (iterator.hasNext()) {
				Commodity tempCom = iterator.next();
				if (yourMaterial.equals(tempCom.material)) {
					iterator.remove();
				}
			}
		}
		if (choice.equals("C")) {
			System.out.print("Enter price: ");
			double yourPrice = scanner.nextDouble();
			Iterator<Commodity> iterator = commodities.iterator();
			while (iterator.hasNext()) {
				Commodity tempCom = iterator.next();
				if (yourPrice == tempCom.price) {
					iterator.remove();
				}
			}
		}
		if (choice.equals("D")) {
			System.out.print("Enter size: ");
			double yourSize = scanner.nextDouble();
			System.out.print("Enter material: ");
			String yourMaterial = scanner.next();
			System.out.print("Enter price: ");
			double yourPrice = scanner.nextDouble();
			Iterator<Commodity> iterator = commodities.iterator();
			while (iterator.hasNext()) {
				Commodity tempCom = iterator.next();
				if (yourSize == tempCom.size && yourMaterial.equals(tempCom.material) && yourPrice == tempCom.price) {
					iterator.remove();
				}
			}
		}
		int i = 0;
		System.out.println("Now your collection of commodities:");
		for (Iterator iterator = commodities.iterator(); iterator.hasNext();) {
			i++;
			Commodity commodity = (Commodity) iterator.next();
			System.out.println(i + ") " + commodity);
		}
		System.out.println();

	}

	public static void changeCommodity(Set<Commodity> commodities, Scanner scanner) {
		
		double size;
		String material;
		double price;

		int i = 0;
		System.out.println("Your collection of commodities:");
		for (Iterator iterator = commodities.iterator(); iterator.hasNext();) {
			i++;
			Commodity commodity = (Commodity) iterator.next();
			System.out.println(i + ") " + commodity);

		}
		System.out.print("Please enter number of commodity, which you want to change: ");
		int choice = scanner.nextInt();
		
	
		
		
	}
}
