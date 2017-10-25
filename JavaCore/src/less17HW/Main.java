package less17HW;


import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Main  {

	public static void main (String [] args){
		
		Map<Person, List<Pet>> PersonPets = new HashMap<>();
		
		ZooClub zooClub = new ZooClub(PersonPets);
		SerializationZooClub serializationClub = new SerializationZooClub(zooClub);
		
//		zooClub.testZooClub();
		zooClub.zooClubMenu();
		serializationClub.menu();

		
	}
}


