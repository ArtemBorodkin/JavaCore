package less18HW;

import less18HW.Collection.InnerIterator1;
import less18HW.Collection.InnerIterator2;
import less18HW.Collection.StaticClass;

public class Main {

	public static void main(String[] args) {
		
		Object [] objects = {10,1,22,3,44,54,66,7,8,9,10,11,12,13,14,15};
		Collection collection = new Collection(objects);
		InnerIterator1 inner1 = collection.new InnerIterator1();
		InnerIterator2 inner2 = collection.new InnerIterator2();
		StaticClass staticClass = new StaticClass(objects);
//		inner1.next();
//		System.out.println();
//		inner2.next();
//		System.out.println();
//		collection.anonymClass(objects).next();
//		System.out.println();
		collection.fromFirstToLast(objects);
//		System.out.println();
//		staticClass.next();
	}

}
