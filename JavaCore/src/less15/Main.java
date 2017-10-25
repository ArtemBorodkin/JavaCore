package less15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import less12.Gender;
import less12.Person;

import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// Map<String, Person> map= new HashMap<>();
		// map.put("engeneir", new Person ("Ivan", 18, Gender.MALE));
		// System.out.println(map);
		// System.out.println(map.get("engeneir"));
		// map.put("engeneir", new Person ("Mykola", 20, Gender.MALE));
		// System.out.println(map);

		Map<String, List<Person>> map = new HashMap<>();
		map.put("engeneir", new ArrayList<>());

		map.get("engeneir").add(new Person("Ivan", 18, Gender.MALE));
		map.get("engeneir").add(new Person("Mykola", 20, Gender.MALE));
		System.out.println(map);
		
		Set<Entry<String, List<Person>>> entrySet = map.entrySet();
		for (Entry<String, List<Person>> entry : entrySet) {
			for(Person person : entry.getValue()){
				System.out.println(entry.getKey() + " " + person);
			}
		}
		
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			for(Person person : map.get(key)){
			System.out.println(key + " " + person);
			}
		}
		
		System.out.println(map.remove("engeneir"));
		System.out.println(map.containsKey("engeneir"));
		System.out.println(map);
		map.put("engeneir", null);
		System.out.println(map.containsKey("engeneir"));
	}

}
