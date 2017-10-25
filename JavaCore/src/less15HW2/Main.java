package less15HW2;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import less11.Person;

public class Main {

	public static void main(String[] args) {
		List<Pet> pets = new ArrayList<>();
		Map<Person, List<Pet>> mapPets = new HashMap<>();
		Set<Entry<Person, List<Pet>>> entrySet = mapPets.entrySet();
		Iterator<Pet> iterPet = pets.iterator();

		ZooClub zooClub = new ZooClub(pets, mapPets, entrySet, iterPet);
		
		zooClub.zooClubMenu();
	}

}
