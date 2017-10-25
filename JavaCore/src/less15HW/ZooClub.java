package less15HW;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import java.util.Scanner;

public class ZooClub implements Serializable {

	

//	 List<Pet> pets = new ArrayList<>();
	Map<Person, List<Pet>> PersonPets;
	 

	public ZooClub(Map<Person, List<Pet>> PersonPets) {
		
		this.PersonPets = new HashMap<>();
	}

	public void addMemeber() {
		Gender gender;
		String yourGender;
		String name;
		int age;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter member name");
		name = scanner.next().toUpperCase();
		do {
			System.out.println("Enter age from 12 to 100");
			age = scanner.nextInt();
			if ((age < 12) || (age > 100)) {
				System.err.println("Age of memeber must be forom 12 to 100!");
			}
		} while (age < 12 || age > 100);
		do {
			System.out.print("Enter gender (male or female)");
			yourGender = scanner.next().toUpperCase();
			if (yourGender.equals("MALE") || yourGender.equals("FEMALE")) {
			} else {
				System.err.println("This gender doesn't exist");
				System.out.println();
			}
		} while (!yourGender.equals("MALE") && !yourGender.equals("FEMALE"));
		gender = Gender.valueOf(yourGender);
		Person person = new Person(name, age, gender);
		if (!PersonPets.containsKey(person)) {
			PersonPets.put(person, new ArrayList<>());
		}
	}

	public void addPet(Person person) {
		int agePet;
		String yourGender;
		Gender gender;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name please:");

        if(person.getName().equals(scanner.next().toUpperCase())){
			List<Pet> pets = PersonPets.get(person);

			System.out.print("Enter type of pet:");
			String type = scanner.next().toLowerCase();
			System.out.print("Enter nickname:");
			String nickname = scanner.next();
			do {
				System.out.print("Enter age:");
				agePet = scanner.nextInt();
				if ((agePet < 0) || (agePet > 20)) {
					System.err.println("Enter age from 0 to 20");
				}
			} while (agePet < 0 || agePet > 20);

			do {
				System.out.print("Enter gender (male or female)");
				yourGender = scanner.next().toUpperCase();
				if (yourGender.equals("MALE") || yourGender.equals("FEMALE")) {
				} else {
					System.err.println("This gender doesn't exist");
					System.out.println();
				}
			} while (!yourGender.equals("MALE") && !yourGender.equals("FEMALE"));
			gender = Gender.valueOf(yourGender);
			pets.add(new Pet(type, nickname, agePet, gender));
			PersonPets.put(person, pets);
		} else {
			System.out.println("This memeber isn't of this club!");
		}
	}

	public void showAllMembers() {
		for (Person person : PersonPets.keySet()) {
			for (Pet pet : PersonPets.get(person)) {
				System.out.println(person + " ->" + pet);
			}
			if (PersonPets.get(person).isEmpty())
				System.out.println(person);
		}
	}

	public void deleteMember() {
		Gender gender;
		String yourGender;
		String name;
		int age;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter member name");
		name = scanner.next().toUpperCase();
		do {
			System.out.println("Enter age from 12 to 100");
			age = scanner.nextInt();
			if ((age < 12) || (age > 100)) {
				System.err.println("Age of memeber must be forom 12 to 100!");
			}
		} while (age < 12 || age > 100);
		do {
			System.out.print("Enter gender (male or female)");
			yourGender = scanner.next().toUpperCase();
			if (yourGender.equals("MALE") || yourGender.equals("FEMALE")) {
			} else {
				System.err.println("This gender doesn't exist");
				System.out.println();
			}
		} while (!yourGender.equals("MALE") && !yourGender.equals("FEMALE"));
		gender = Gender.valueOf(yourGender);
		Person person = new Person(name, age, gender);

//		for (Iterator<Person> it = PersonPets.keySet().iterator(); it.hasNext();) {
//			Person entry = it.next();
//			if (entry.equals(person)) {
//				it.remove();
//				System.out.println("Member" + person + "went away!");
//			}
//
//		}
		PersonPets.remove(person);
	}

	public void deleteMemeberByName() {
		String name;
		int count = 0;
		Set<Entry<Person, List<Pet>>> entrySet = PersonPets.entrySet();
		Scanner scanner = new Scanner(System.in);
		boolean presentMember = false;
		System.out.println("Enter member name");
		name = scanner.next().toUpperCase();
		for (Entry<Person, List<Pet>> entry : entrySet) {
			if (entry.getKey().getName().equals(name)) {
				presentMember = true;
				System.out.println(entry);
				count++;
			}
		}
		switch (count) {
		case 1: {
			for (Entry<Person, List<Pet>> entry : entrySet) {
				if (entry.getKey().getName().equals(name)) {
					System.out.println("The member " + entry.getKey() + " went away");
					PersonPets.remove(entry.getKey());
				}
			}
		}
			break;
		default: {
			System.out.println("Choose member by age");
			int age = scanner.nextInt();
			for (Entry<Person, List<Pet>> entry : entrySet) {
				if (entry.getKey().getAge() == age && entry.getKey().getName().equals(name)) {
					System.out.println("The member " + entry.getKey() + " went away");
					PersonPets.remove(entry.getKey());
				}
			}
			if (!presentMember) {
				System.out.println("This memeber isn't of this club!");
			}

		}
		}
	}

	public void takePet() {
		Scanner scanner = new Scanner(System.in);
		String name;
		String type;
		boolean presentMember = false;
		System.out.println("Enter type of pet");
		type = scanner.next().toLowerCase();
		System.out.println("Enter member name of club");
		name = scanner.next().toUpperCase();
		System.out.println("Enter age of member");
		int age = scanner.nextInt();
		Set<Entry<Person, List<Pet>>> entrySet = PersonPets.entrySet();
	
		
		for (Entry<Person, List<Pet>> entry : entrySet) {
			if (entry.getKey().getName().equals(name) && entry.getKey().getAge() == age) {
				presentMember = true;
				List<Pet>pets = entry.getValue();
				Iterator<Pet> iterator = pets.iterator();
				while (iterator.hasNext()) {
					Pet tmPet = iterator.next();
					if (tmPet.getType().equals(type)) {
						iterator.remove();
						System.out.println("We took " + tmPet + "from " + entry.getKey().getName());
					}}
			} 
		}
		if(!presentMember){System.out.println("This memeber isn't present in club");}
	}

	public void takePetFromAllMembers() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter type of pet");
		String type = scanner.next().toLowerCase();
		Set<Entry<Person, List<Pet>>> entrySet = PersonPets.entrySet();

		for (Entry<Person, List<Pet>> entry : entrySet) {
			List <Pet> pets = entry.getValue();
			Iterator<Pet> iterator = pets.iterator();
			while (iterator.hasNext()) {
				Pet tmPet = iterator.next();
				if (tmPet.getType().equals(type)) {
					iterator.remove();
					System.out.println("We took" + tmPet + "from " + entry.getKey().getName());
				} 
			}
		}
	}

}
