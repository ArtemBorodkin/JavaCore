package less15HW;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

	
//		Map<Person, List<Pet>> PersonPets = new HashMap<>();
//		
//
//		ZooClub zooClub = new ZooClub(PersonPets);
//		
//
//		Scanner scanner = new Scanner(System.in);
//		boolean isRun = true;
//		while (isRun) {
//			System.out.println("1)Add member to Zoo club");
//			System.out.println("2)Add pet to member");
//			System.out.println("3)Delete member from Zoo club");
//			System.out.println("4)Delete member by name");
//			System.out.println("5)Take off pet from memeber");
//			System.out.println("6)Take off pet from all memebers");
//			System.out.println("7)Show all members with pets");
//			switch (scanner.next()) {
//			case "1": {
//				zooClub.addMemeber();
//			}
//				break;
//			case "2": {
//				//
//				System.out.println("Enter member name...");
//				String name = scanner.next();
//				System.out.println("Enter member age...");
//				Int age = scanner.next();
//				zooClub.addPet(scanner.next());
//			}
//				break;
//			case "3": {
//				zooClub.deleteMember();
//			}
//				break;
//			case "4": {
//				zooClub.deleteMemeberByName();
//			}
//				break;
//			case"5":{
//				zooClub.takePet();
//			}
//			case"6":{
//				zooClub.takePetFromAllMembers();
//			}
//				break;
//			case "7": {
//				zooClub.showAllMembers();
//			}
//				break;
//			default:
//				System.out.println("Error input! Try again!");
//				break;
//			}
//		}

		Object[] arr = new Object[10];	
		for (Object object : arr) {
			System.out.println(object);
		}
		
	}
	
	Object[] arr = new Object[10];	
	int a =0;
	int size = 10;
	public boolean hasNext() {
		return a < size -1;
	}
	
	public Object next() {
		return arr[a++];
	}

}
