package less14HW2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Commodity> commodities = new ArrayList<>();
		String endChoice = "";
		boolean isRun = true;

		commodities.add(new Commodity(15.75, "silk", 25.55));
		commodities.add(new Commodity(13.22, "nylon", 20.50));
		commodities.add(new Commodity(16.23, "cotton", 27.70));
		commodities.add(new Commodity(10.21, "nylon", 14.55));
		commodities.add(new Commodity(24.21, "leather", 45.25));
		commodities.add(new Commodity(14.75, "silk", 18.90));

		while (isRun) {
			printMenu();
			String choice = scanner.next().toUpperCase();
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
			case "4": {
				sortList(commodities, scanner);
				break;
			}
			case "5": {
				ShowCommodities(commodities);
				break;
			}
			case "0": {
				System.out.println("Are you sure want to exit? (yes or no)");
				endChoice = scanner.next().toUpperCase();
				if (endChoice.equals("Y") || endChoice.equals("YES")) {
					isRun = false;

				} else if (!endChoice.equals("NO")) {
					System.out.println("This not correct answer,but alright let's continue!");
				}
				break;
			}
			default: {
				endChoice = "";
				if (!endChoice.equals("NO")) {
					System.out.println("This not correct choice");
					System.out.println("Specify the number from list");
				}

			}
			}

		}

	}

	public static void printMenu() {

		System.out.println("_|MENU|_________________________");
		System.out.println("1).Add your commodity in the list");
		System.out.println("2).Remove commodity from list");
		System.out.println("3).Change commodity in list");
		System.out.println("4).Sort list of commodities");
		System.out.println("5).Show all commodities");
		System.out.println("0).Exit from program");
		System.out.print("Choose:");

	}

	public static void addCommodity(List<Commodity> commodities, Scanner scanner) {

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
		for (Iterator<Commodity> iterator = commodities.iterator(); iterator.hasNext();) {
			i++;
			Commodity commodity = (Commodity) iterator.next();
			System.out.println(i + ") " + commodity);
		}
		System.out.println();

	}

	public static void removeCommodity(List<Commodity> commodities, Scanner scanner) {

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
		for (Iterator<Commodity> iterator = commodities.iterator(); iterator.hasNext();) {
			i++;
			Commodity commodity = (Commodity) iterator.next();
			System.out.println(i + ") " + commodity);
		}
		System.out.println();

	}

	public static void changeCommodity(List<Commodity> commodities, Scanner scanner) {

		int i = 0;
		System.out.println("Your collection of commodities:");
		for (Iterator<Commodity> iterator = commodities.iterator(); iterator.hasNext();) {
			i++;
			Commodity commodity = (Commodity) iterator.next();
			System.out.println(i + ") " + commodity);

		}
		System.out.print("Please enter number of commodity, which you want to change: ");
		int choice = scanner.nextInt();

		ListIterator<Commodity> listIter = commodities.listIterator(commodities.size());
		while (listIter.hasPrevious()) {
			Commodity temp = listIter.previous();
			if (listIter.nextIndex() + 1 == choice) {
				System.out.print("Enter size: ");
				temp.size = scanner.nextDouble();
				System.out.print("Enter material: ");
				temp.material = scanner.next();
				System.out.print("Enter price: ");
				temp.price = scanner.nextDouble();

			}

		}
		i = 0;
		System.out.println("Now your collection of commodities:");
		for (Iterator<Commodity> iterator = commodities.iterator(); iterator.hasNext();) {
			i++;
			Commodity commodity = (Commodity) iterator.next();
			System.out.println(i + ") " + commodity);
		}
		System.out.println();

	}

	public static void sortList(List<Commodity> commodities, Scanner scanner) {

		System.out.println("A. Sort by size");
		System.out.println("B. Sort by material");
		System.out.println("C. Sort by price");
		System.out.print("Choose:");
		String choice = scanner.next().toUpperCase();
		if (choice.equals("A") || choice.equals("SIZE")) {
			System.out.println("What way of sort do you want growth or decrease?");
			System.out.print("Choose:");
			choice = scanner.next().toUpperCase();
			if (choice.equals("A") || choice.equals("G") || choice.equals("GROWTH") || choice.equals("1")
					|| choice.equals("GROW")) {
				commodities.sort(null);
			} else {
				commodities.sort(new CommodityComparatorBySizeDecrease());
			}
		}
		if (choice.equals("B") || choice.equals("MATERIAL")) {
			System.out.println("What way of sort do you want growth or decrease?");
			System.out.print("Choose:");
			choice = scanner.next().toUpperCase();
			if (choice.equals("A") || choice.equals("G") || choice.equals("GROWTH") || choice.equals("1")
					|| choice.equals("GROW")) {
				commodities.sort(new CommodityComparatorByMaterialGrowth());
			} else {
				commodities.sort(new CommodityComparatorByMaterialDecrease());
			}
		}
		if (choice.equals("C") || choice.equals("PRICE")) {
			System.out.println("What way of sort do you want growth or decrease?");
			System.out.print("Choose:");
			choice = scanner.next().toUpperCase();
			if (choice.equals("A") || choice.equals("G") || choice.equals("GROWTH") || choice.equals("1")
					|| choice.equals("GROW")) {
				commodities.sort(new CommodityComparatorByPriceGrowth());
			} else {
				commodities.sort(new CommodityComparatorByPriceDecrease());
			}
		}

		int i = 0;
		for (Iterator<Commodity> iterator = commodities.iterator(); iterator.hasNext();) {
			i++;
			Commodity commodity = (Commodity) iterator.next();
			System.out.println(i + ") " + commodity);
		}
		System.out.println();

	}

	public static void ShowCommodities(List<Commodity> commodities) {
		int i = 0;
		for (Iterator<Commodity> iterator = commodities.iterator(); iterator.hasNext();) {
			i++;
			Commodity commodity = (Commodity) iterator.next();
			System.out.println(i + ") " + commodity);
		}
	}
}
