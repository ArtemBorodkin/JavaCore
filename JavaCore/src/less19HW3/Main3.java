package less19HW3;

public class Main3 {

	public static void main(String[] args) {
		
		MyMap<Character, Integer> myMap = new MyMap<>();
		myMap.addToMap('A', 101);
		myMap.addToMap('C', 943);
		myMap.addToMap('B', 99);
		myMap.addToMap('D', 732);
		myMap.removeByKey('A');
		myMap.removeValue(943);
		myMap.printKey();
		System.out.println(" Key");
		myMap.printValue();
		System.out.println(" Value");
		System.out.println("Map");
		myMap.printMap();
		

	}

}
