package less17;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

import javax.imageio.ImageIO;

import less13Practice.Gender;
import less13Practice.Person;

public class Main {

	public static void main(String[] args) throws IOException {
	
//		Person person  = new Person("Ivan", 20, Gender.MALE);
//		OutputStream os = null;
//		ObjectOutputStream oos = null;
//		try{
//			
//			os = new FileOutputStream (new File("save.save"));
//			oos = new ObjectOutputStream(os);	
//			oos.writeObject(person);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			
//			if(oos != null){
//				try {
//					oos.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			if(os != null){
//				try {
//					os.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		try (ObjectInputStream ois = 
//				new ObjectInputStream(
//				new FileInputStream(
//						new File("save.save")))) {
//			Person person = (Person) ois.readObject();
//			System.out.println(person);
//		} catch (IOException | ClassNotFoundException e){
//			e.printStackTrace();
//		}
//		Person person  = new Person("Ivan", 25, Gender.MALE);
//		try(FileWriter writer = new FileWriter("save.txt", true)){
//			writer.append(person.getName() + " "+ person.getAge() + " " + person.getGender()+"\n");
//		}catch (IOException e){
//			e.printStackTrace();
//		}
//		try(Scanner sc = new Scanner(new File("save.txt"))){
//			while(sc.hasNextLine()){
//				String line = sc.nextLine();
//				if (!line.isEmpty()){
//					String[]array = line.split(" ");
//					Person person = new Person(array[0], Integer.valueOf(array[1]), Gender.valueOf(array[2]));
//					System.out.println(person);
//				}
//			}
//		} catch (IOException e){
//			e.printStackTrace();
//		}
		BufferedImage image = ImageIO.read(new File("1.jpg"));
		int offset = (image.getWidth()-image.getHeight())/2;
		BufferedImage crop = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
		for (int y = 0; y < image.getHeight(); y++) {
			for (int x = 0; x < image.getWidth(); x++) {
				crop.setRGB(x, y, image.getRGB(x, y));
			}
		}
		ImageIO.write(crop, "jpg", new File("crop.jpg"));
	}

}
