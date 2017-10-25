package less19HW2;

public class Main {

	public static void main(String[] args) {
		MyMap<Integer, String> myMap = new MyMap<>();
		myMap.addToMap(1, "first");
		myMap.addToMap(2, "second");
		myMap.addToMap(3, "third");
//		myMap.addToMap(1, "555");
//		myMap.removeByKey(1);
//		myMap.removeByValue("second");
//		myMap.printKeySet();
//		myMap.printValueList();
		myMap.printMyMap();
	}

}
