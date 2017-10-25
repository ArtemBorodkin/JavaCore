package less17HW;

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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2989956159952927386L;
	Map<Person, List<Pet>> PersonPets;
	 

	public ZooClub(Map<Person, List<Pet>> PersonPets) {
		
		this.PersonPets = new HashMap<>();
	}

	
	public Map<Person, List<Pet>> getPersonPets() {
		return PersonPets;
	}


	public void setPersonPets(Map<Person, List<Pet>> personPets) {
		this.PersonPets = personPets;
	}
	


	public void zooClubMenu(){
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out.println("1)Add member to Zoo club");
			System.out.println("2)Add pet to member");
			System.out.println("3)Delete member from Zoo club");
			System.out.println("4)Delete member by name");
			System.out.println("5)Take off pet from memeber");
			System.out.println("6)Take off pet from all memebers");
			System.out.println("7)Show all members with pets");
			System.out.println("0).Exit");
			switch (scanner.next()) {
			case "1": {
				addMemeber();
			}
				break;
			case "2": {
				addPet();
			}
				break;
			case "3": {
				deleteMember();
			}
				break;
			case "4": {
				deleteMemeberByName();
			}
				break;
			case"5":{
				takePet();
			}
			case"6":{
				takePetFromAllMembers();
			}
				break;
			case "7": {
				showAllMembers();
			}
				break;
			case"0":{
				isRun = false;
			}
			break;
			default:
				System.out.println("Error input! Try again!");
				break;
			}
		}

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

	public void addPet() {
		int agePet;
		String yourGender;
		Gender gender;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name:");
		String inputName = scanner.next().toUpperCase();
		System.out.println("Enter age:");
		int inputAge = scanner.nextInt();
		System.out.println("Enter gender:");
		Gender inputGender = Gender.valueOf(scanner.next().toUpperCase());
		Person person = new Person(inputName, inputAge, inputGender);
		if (PersonPets.containsKey(person)) {
			
			PersonPets.put(person, new ArrayList<>());
            
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
			PersonPets.get(person).add(new Pet(type, nickname, agePet, gender));
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


	@Override
	public String toString() {
		return "ZooClub [PersonPets=" + PersonPets + "]";
	}



}
