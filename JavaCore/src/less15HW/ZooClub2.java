package less15HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import java.util.Scanner;

public class ZooClub2 {

	Scanner scanner = new Scanner(System.in);

	List<Pet> pets = new ArrayList<>();
	Map<Person, List<Pet>> map = new HashMap<>();
	Set<Entry<Person, List<Pet>>> entrySet = map.entrySet();
	Iterator<Pet> iterPet = pets.iterator();

	public ZooClub2(Map<Person, List<Pet>> map, List<Pet> pets, Set<Entry<Person, List<Pet>>> entrySet,
			Iterator<Pet> iterPet) {
		this.pets = pets;
		this.map = map;
		this.entrySet = entrySet;
		this.iterPet = iterPet;
	}

	public void addMemeber() {
		Gender gender;
		String yourGender;
		String name;
		int age;

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
		if (!map.containsKey(person)) {
			map.put(person, new ArrayList<>());
		}
	}

	public void addPet() {
		Gender gender;
		String yourGender;
		int agePet;
		String name;
		int age;
		int i = 0;
		boolean memberPresent = false;

		System.out.println("Choose the member");
		name = scanner.next().toUpperCase();

		for (Entry<Person, List<Pet>> entry : entrySet) {
			if (entry.getKey().getName().equals(name)) {
				memberPresent = true;
				System.out.println(entry);
				i++;
			}
		}
		System.out.println(i);
		if (i == 1) {
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
			Pet pet = new Pet(type, nickname, agePet, gender);
			for (Entry<Person, List<Pet>> entry : entrySet) {
				if (entry.getKey().getName().equals(name)) {
					List<Pet> pets = new ArrayList<>();
					pets.add(pet);
					entry.setValue(pets);

				}
			}
		}

		if (i > 2 || i == 2) {
			// System.out.println(entrySet);
			System.out.println("Choose member by age");
			age = scanner.nextInt();
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
			Pet pet = new Pet(type, nickname, agePet, gender);

			for (Entry<Person, List<Pet>> entry : entrySet) {
				if (entry.getKey().getAge() == age && entry.getKey().getName().equals(name)) {
					List<Pet> pets = new ArrayList<>();
					pets.add(pet);
					entry.setValue(pets);
				}
			}
		}
		if (!memberPresent) {
			System.out.println("This member is absent in club!!!");
		}
	}

	public void showAllMembers() {
		for (Person person : map.keySet()) {
			for (Pet pets : map.get(person)) {
				System.out.println(person + " ->" + pets);
			}
			if (map.get(person).isEmpty())
				System.out.println(person);
		}
	}

	public void deleteMember() {
		Gender gender;
		String yourGender;
		String name;
		int age;

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

		for (Iterator<Person> it = map.keySet().iterator(); it.hasNext();) {
			Person entry = it.next();
			if (entry.equals(person)) {
				it.remove();
				System.out.println("Member" + person + "went away!");
			} else {
				System.out.println("This memeber isn't of this club!");
			}
		}
	}

	public void deleteMemeberByName() {
		String name;
		int count = 0;
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
					map.remove(entry.getKey());
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
					map.remove(entry.getKey());
				}
			}
			if (!presentMember) {
				System.out.println("This memeber isn't of this club!");
			}

		}
		}
	}

	public void takePet() {
		String name;
		int count = 0;
		boolean presentMember = false;
		System.out.println("Enter member name of club");
		name = scanner.next().toUpperCase();
		for (Entry<Person, List<Pet>> entry : entrySet) {
			if (entry.getKey().getName().equals(name)) {
				presentMember = true;
				count++;
			}
		}
		if (presentMember) {
			
			switch(count){
			case 1:{
				
				System.out.println("Enter type of pet");
				String type = scanner.next().toLowerCase();

				for (Entry<Person, List<Pet>> entry : entrySet) {
					if (entry.getKey().getName().equals(name)) {
						pets = entry.getValue();
						while (iterPet.hasNext()) {
							Pet tmPet = iterPet.next();
							if (tmPet.getType().equals(type)) {
								iterPet.remove();
								System.out.println("We took" + tmPet + "from " + entry.getKey().getName());
							} else {
								System.out.println("This pet isn't found");
							}}}}
				}
			break;
			default:{
				System.out.println("Enter age of member");
				int age = scanner.nextInt();
				System.out.println("Enter type of pet");
				String type = scanner.next().toLowerCase();

				for (Entry<Person, List<Pet>> entry : entrySet) {
					if (entry.getKey().getName().equals(name)&&entry.getKey().getAge()==age) {
						pets = entry.getValue();
						while (iterPet.hasNext()) {
							Pet tmPet = iterPet.next();
							if (tmPet.getType().equals(type)) {
								iterPet.remove();
								System.out.println("We took" + tmPet + "from " + entry.getKey().getName());
							} else {
								System.out.println("This pet isn't found");
							}}}}
			}
			break;}	
		}else{System.out.println("This memeber isn't of this club!");
		}
	}

	public void takePetFromAllMembers() {

		System.out.println("Enter type of pet");
		String type = scanner.next().toLowerCase();

		for (Entry<Person, List<Pet>> entry : entrySet) {
			pets = entry.getValue();
			while (iterPet.hasNext()) {
				Pet tmPet = iterPet.next();
				if (tmPet.getType().equals(type)) {
					iterPet.remove();
					System.out.println("We took" + tmPet + "from " + entry.getKey().getName());
				} else {
					System.out.println("This pet isn't found");
				}
			}
		}
	}

}
