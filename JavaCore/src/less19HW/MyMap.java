package less19HW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import less19HW2.MyEntry;

public class MyMap<K, V> {

	private Set<MyEntry<K, V>> mapEntry = new HashSet<>();
	private Set<K> setKeys = new HashSet<>();
	private List<V> listValue = new ArrayList<>();

	// First task:
	public void addToMap(K key, V value) {
		boolean hasEntry = false;
		MyEntry<K, V> newEntry = new MyEntry<>(key, value);
		for (MyEntry<K, V> myEntry : mapEntry) {
			if (myEntry.getKey().equals(newEntry.getKey())) {
				hasEntry = true;
				myEntry.setValue(value);
			}
		}
		if (!hasEntry) {
			mapEntry.add(newEntry);
		}
	}

	// Second task:
	public void removeByKey(K key) {
		Iterator<MyEntry<K, V>> iterator = mapEntry.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> temp = iterator.next();
			if (temp.getKey().equals(key)) {
				iterator.remove();
			}
		}
	}

	// Third task:
	public void removeByValue(V value) {
				Iterator<MyEntry<K, V>> iterator = mapEntry.iterator();
				while (iterator.hasNext()) {
					MyEntry<K, V> temp = iterator.next();
					if(temp.getValue()!=null){
					if (temp.getValue().equals(value)) {
						temp.setValue(null);
					}
					}
				}
			}


	// //Third task(second variant):
	// public void removeValue(V value){
	// listValue.clear();
	// }

	public void printKeys() {
		for (MyEntry<K, V> myEntry : mapEntry) {
			setKeys.add(myEntry.getKey());
		}
		System.out.println(setKeys);

	}

	public void printValue() {
		for (MyEntry<K, V> myEntry : mapEntry) {
			listValue.add(myEntry.getValue());
		}
		System.out.println(listValue);
	}

	public void printMap() {
		for (MyEntry<K, V> myEntry : mapEntry) {
			System.out.println(myEntry);
		}
	}

}
