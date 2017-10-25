package less19HW3;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyMap<K, V>{
	
	private Set<MyEntry<K, V>> mapEntry = new HashSet<>();

	public void addToMap(K key, V value){
		boolean presentEntry = false;
		MyEntry<K, V> newEntry = new MyEntry<>(key, value);
		for (MyEntry<K, V> myEntry : mapEntry) {
			if(myEntry.getKeys().equals(newEntry.getKeys())){
				presentEntry = true;
			}
			
		}
		if(!presentEntry){
			mapEntry.add(newEntry);
		}
	}
	
	public void removeByKey(K key){
		
		Iterator<MyEntry<K, V>> iterator = mapEntry.iterator();
		while(iterator.hasNext()){
			MyEntry<K, V> temp = iterator.next();
			if(temp.getKeys().equals(key)){
				iterator.remove();
			}
		}
		
	}

	public void removeValue(V value){
		
		Iterator<MyEntry<K, V>> iterator = mapEntry.iterator();
		while(iterator.hasNext()){
			MyEntry<K, V> temp = iterator.next();
			if(temp.getValue().equals(value)){
				temp.setValue(null);
			}
		}
		
	}
	
	public void printKey(){
		for(MyEntry<K, V> myEntry : mapEntry){
			System.out.print(myEntry.getKeys()+ " ");
		}
	}
	
	public void printValue(){
		for(MyEntry<K, V> myEntry : mapEntry){
			System.out.print(myEntry.getValue()+ " ");
		}
	}
	
	public void printMap(){
		for(MyEntry<K, V> myEntry : mapEntry){
			System.out.println(myEntry);
		}
	}
	
}
	
	
	
	
