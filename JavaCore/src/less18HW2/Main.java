package less18HW2;

import less18HW2.Collection.InnerClass1;
import less18HW2.Collection.InnerClass2;
import less18HW2.Collection.StaticClass;

public class Main {

	public static void main(String[] args) {

		Object[] objects = { 2, 34, 6, 41, 80, 62, 7, 8, 9, 10, 11, 12, 15, 17, 100, 30, 40,};
		Collection collection = new Collection(objects);
		InnerClass1 innerFirst = collection.new InnerClass1();
		InnerClass2 innerSecond = collection.new InnerClass2();
		StaticClass staticClass = new StaticClass(objects);
		// First inner class to print value of array from first to last.
		// Make to change odd elements to zero and output on display that array;
		 innerFirst.change();
		 System.out.println();
		// Second class deduce from last to first value through one digit
//		 innerSecond.next();
//		 System.out.println();
		// Create anonym class drive trough from last to first element of array.
		// Check every third element from last if that is odd, if yes then
		// output data on console
//		 collection.anonym(objects).next();
//		 System.out.println();
		// Create local class to go from first to last array elements, check every
		// fifth to even, if that will be yes, then from that subtract digit one hundred
		// and deduce the number
//		collection.fromFirstToLast();
//		 System.out.println();
		//Create static class, which must:
		//Go from first to last array element. Check every second on even, if he is even, then
		// will make him odd and output this elements on console
//		staticClass.next();

	}
}
