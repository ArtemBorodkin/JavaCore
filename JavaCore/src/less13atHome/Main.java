package less13atHome;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("Ivan");
		strings.add("Petro");
		strings.add("Mykola");
		strings.add("Stepan");

//		for (int i = 0; i < strings.size(); i++) {
//			if (strings.get(i).contains("o")) {
//				strings.remove(i);
//				i--;
//			}
//		}
		Iterator<String> iter = strings.iterator();
		while(iter.hasNext()){
			String temp = iter.next();
			if(temp.length()>=2&&temp.contains("o")){
				iter.remove();
			}
		}
		
		System.out.println(strings);
		ListIterator<String> listIterator = strings.listIterator(strings.size());
		while(listIterator.hasPrevious()){
			String temp = listIterator.previous();
			System.out.println(temp + " " + listIterator.nextIndex());
		}
	}
}
