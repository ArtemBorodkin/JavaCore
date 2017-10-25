package less19HW;

public class Main {

	public static void main(String[] args) {
	
		MyMap<String,String> myMap = new MyMap<>(); 
		myMap.addToMap("third", "example");
		myMap.addToMap("second", "task");
		myMap.addToMap("first", null);
		myMap.removeByKey("third");
		myMap.removeByValue("task");
	    myMap.printMap();
		

	}

}
