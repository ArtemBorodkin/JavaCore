package less13Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Person> persons = new ArrayList<>();
		boolean isRun = true;
		while (isRun) {
			printMenu();
			String choise = scanner.next();
			switch (choise) {
			case "1": {
				addPerson(persons, scanner);
				break;
			}

			case "2": {
				printPersons(persons);
				break;
			}

			case "3": {
				System.out.print("Input gender: ");
				Gender gender = Gender.valueOf(scanner.next().toUpperCase());
				deletePersonByGender(persons, gender);
				break;
			}
			case "4": {
				System.out.print("Input age min: ");
				int min = scanner.nextInt();
				System.out.println("Input age max: ");
				int max = scanner.nextInt();
				removeByAge(persons, min, max);
			}
			default: {
				isRun = false;
			}
			}
		}

	}

	public static void printMenu() {

		System.out.println("1.Add person");
		System.out.println("2.Print persons");
		System.out.println("3.Delete persons by gender");
		System.out.println("4.Delete persons by diapason of age");
	}

	public static void addPerson(List<Person> persons, Scanner scanner) {

		String name;
		int age;
		Gender gender;

		System.out.print("Input name: ");
		name = scanner.next();

		System.out.print("Input age: ");
		age = scanner.nextInt();

		System.out.print("Input Gender: ");
		gender = Gender.valueOf(scanner.next().toUpperCase());

		persons.add(new Person(name, age, gender));
	}

	public static void printPersons(List<Person> persons) {

		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			Person tempPerson = iterator.next();
			System.out.println(tempPerson);
		}

	}

	public static void deletePersonByGender(List<Person> persons, Gender gender) {

		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			Person tempPerson = iterator.next();
			if (gender == tempPerson.getGender()) {
				iterator.remove();
			}

		}

	}

	public static void removeByAge(List<Person> persons, int max, int min) {

		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			Person tempPerson = iterator.next();
			if (tempPerson.getAge() > min && tempPerson.getAge() < max) {
				iterator.remove();
			}

		}

	}

}
