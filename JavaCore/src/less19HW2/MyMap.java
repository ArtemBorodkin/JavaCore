package less19HW2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyMap<K, V> {
	private Set<MyEntry<K, V>> myEntries = new HashSet<MyEntry<K, V>>();
	private Set<K> keySet = new HashSet<>();
	private List<V> valueList = new ArrayList<>();

	public void addToMap(K key, V value) {
		boolean hasEntry = false;
		MyEntry<K, V> newEntry = new MyEntry<>(key, value);
		for (MyEntry<K, V> myEntry : myEntries) {
			if (myEntry.equals(newEntry)) {
				hasEntry = true;
			}
		}
		if (!hasEntry) {
			myEntries.add(newEntry);
		}
	}

	public void removeByKey(K key) {
		Iterator<MyEntry<K, V>> iterator = myEntries.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> tmp = iterator.next();
			if (tmp.getKey().equals(key)) {
				iterator.remove();
			}
		}
	}

	public void removeByValue(V value) {
		Iterator<MyEntry<K, V>> iterator = myEntries.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> tmp = iterator.next();
			if (tmp.getValue().equals(value)) {
				tmp.setValue(null);
			}
		}
	}

//	public void printKeySet() {
//
//		for (MyEntry<K, V> myEntry : myEntries) {
//			keySet.add(myEntry.getKey());
//		}
//		System.out.println(keySet);
//	}
//
//	public void printValueList() {
//
//		for (MyEntry<K, V> myEntry : myEntries) {
//			valueList.add(myEntry.getValue());
//		}
//		System.out.println(valueList);
//	}

	public void printMyMap() {
		for (MyEntry<K, V> myEntry : myEntries) {
			System.out.println(myEntry);
		}
	}
}
