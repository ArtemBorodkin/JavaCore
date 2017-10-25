package less12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("1. Add person");
			System.out.println("2. Show persons");
			System.out.println("3. Filter gender");
			System.out.println("4. Filter age");
			System.out.println("5. Filter by name, age, gender");
			System.out.println("Other: exit");
			System.out.print("Choose: ");
			
			switch(scanner.next()) {
			case "1" : {
				String name;
				int age;
				Gender gender;
				
				System.out.println();
				System.out.print("Input name: ");
				name = scanner.next();
				
				System.out.print("Input age: ");
				age = scanner.nextInt();
				
				System.out.print("Input gender: ");
				gender = Gender.valueOf(scanner.next().toUpperCase());
				
				System.out.println();
				persons.add(new Person(name, age, gender));
				break;
			}
			
			case "2" : {
				System.out.println();
				for (Person person : persons) {
					System.out.println(person);
				}
				System.out.println();
				break;
			}
			
			case "3" : {
				Gender gender = Gender.valueOf(scanner.next().toUpperCase());;
				
				System.out.println();
				System.out.print("Input gender to filter: ");
				
				filterByGender(persons, scanner, gender);
				break;
			}
			
			case "4" : {
				int minAge;
				int maxAge;
				int age;
				
				System.out.println();
				
				System.out.print("Input min age to filter: ");
				minAge = scanner.nextInt();
				
				System.out.print("Input max age to filter: ");
				maxAge = scanner.nextInt();
				
				System.out.println();
				for (Person person : persons) {
					age = person.getAge();
					
					if((age >= minAge) && (age <= maxAge)) {
						System.out.println(person);
					}
				}
				
				System.out.println();
				break;
			}
			
			case "5" : {
				String name;
				Gender gender;
				String nameFilter;
				int minAge;
				int maxAge;
				int age;
				Gender genderFilter;
				
				System.out.println();
				
				System.out.print("Input name: ");
				nameFilter = scanner.next();
				
				System.out.print("Input min age: ");
				minAge = scanner.nextInt();
				
				System.out.print("Input max age: ");
				maxAge = scanner.nextInt();
				
				System.out.print("Input gender: ");
				genderFilter = Gender.valueOf(scanner.next().toUpperCase());
				
				for (Person person : persons) {
					name = person.getName();
					age = person.getAge();
					gender = person.getGender();
					
					if((name.contains(nameFilter)) && (age >= minAge) && 
							(age <= maxAge) && (gender == genderFilter)) {
						System.out.println(person);
					}
				}
			}
			default:{
				isRun = false;
			}
			}
		}
	}
	
	public static void filterByGender(List<Person> persons, Scanner scanner, Gender gender) {
		System.out.println();
		
		for (Person person : persons) {
			if(gender == person.getGender()) {
				System.out.println(person);
			}
		}
		
		System.out.println();
	}
}
