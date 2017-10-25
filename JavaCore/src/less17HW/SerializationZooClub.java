package less17HW;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SerializationZooClub implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ZooClub zooClub;

	public SerializationZooClub(ZooClub zooClub) {
		this.zooClub = zooClub;
	}

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1).Write ZooClub to file");
		System.out.println("2).OverWrite file");
		System.out.println("3).Print file");
		System.out.println("4).Serialization ZooClub");
		System.out.println("5).Deserialization ZooClub");
		System.out.println("0).Exit");
		boolean isRun = true;
		while (isRun) {
			switch (scanner.next()) {
			case "1": {
				writeZooClubToFile();
			}
				break;
			case "2": {
				overWriteZooClubFile();
			}
				break;
			case "3": {
				printZooClubFile();
			}
				break;
			case "4": {
				serialization();
			}
				break;
			case "5": {
				deserialization();
			}
			break;
			case"0":{
				isRun = false;
			}
			break;
			default:{
				System.out.println("Wrong chooise");
			}
			break;
			}
		}
	}

	public void serialization() {

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File("Club.save")))) {
			os.writeObject(zooClub);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void deserialization() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("Club.save")))) {
			 zooClub = (ZooClub) ois.readObject();
			System.out.println(zooClub);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void writeZooClubToFile() {
		try (FileWriter write = new FileWriter("ZooClub.txt", true)) {
			write.append(zooClub.getPersonPets() + "\n ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void overWriteZooClubFile() {
		try (FileWriter write = new FileWriter("ZooClub.txt")) {
			write.append(zooClub.getPersonPets() + "\n ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void printZooClubFile() {

		try (Scanner scanner = new Scanner(new File("ZooClub.txt"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
