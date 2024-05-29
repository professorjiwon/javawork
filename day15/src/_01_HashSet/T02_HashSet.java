package _01_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class T02_HashSet {

	public static void main(String[] args) {
		Object[] objArr = {"1", Integer.valueOf(1),"2","2","2","3","3","4","4","4"};
		Set set1 = new HashSet();
		
		for(Object obj : objArr) {
			set1.add(obj);
		}
		System.out.println(set1);
		
		set1.clear();
		System.out.println("set1의 size : " + set1.size());

		// iteratorPrint(set1.iterator());
	}
	
	static void iteratorPrint(Iterator<Object> i) {
		while(i.hasNext()) {
			Object ca = i.next();
			System.out.print(ca + ", ");
		}
		System.out.println();
	}

}
