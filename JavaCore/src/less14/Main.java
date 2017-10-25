package less14;

import java.util.Set;

import less11.Gender;
import less11.Person;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Set<Person> persons = new LinkedHashSet<>();
		System.out.println(persons.add(new Person("Ivan", 18, Gender.MALE)));
		System.out.println(persons.add(new Person("Mykola", 23, Gender.MALE)));
		persons.add(new Person("Antonio", 29, Gender.MALE));
		persons.add(new Person("Afrodita", 22, Gender.FEMALE));
		persons.add(new Person("Petro", 27, Gender.MALE));
		persons.add(new Person("Petro", 27, Gender.MALE));
		System.out.println(persons);
		List<Person> personsList = new ArrayList<>(persons);
		for (Person person : personsList) {
			System.out.println(person);
		}
		System.out.println();
		personsList.sort(null);
		for (Person person : personsList) {
			System.out.println(person);
		}
		System.out.println();
		System.out.println();
		personsList.sort(new PersonComperatorByNameDesc());
		for (Person person : personsList) {
			System.out.println(person);
		}
		System.out.println();

		System.out.println();
		personsList.sort((o1, o2) -> o1.getAge() - o2.getAge()); // sort by age
		for (Person person : personsList) {
			System.out.println(person);
		}
		System.out.println();

		System.out.println();
		personsList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		for (Person person : personsList) {
			System.out.println(person);
		}
		System.out.println();
	}

}