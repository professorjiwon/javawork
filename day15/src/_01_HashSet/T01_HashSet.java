package _01_HashSet;

import java.util.*;

class ClassA {
	String str;

	public ClassA() { }
	public ClassA(String str) {
		this.str = str;
	}
}

public class T01_HashSet {
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		Set set2 = new HashSet();
		
		ClassA ca1 = new ClassA("java");
		set2.add(ca1);
		set2.add(new ClassA("oracle"));
		set2.add(new ClassA("sql"));
		set2.add(new ClassA("react"));
		set2.add(new ClassA("jsp"));
		
		int size = set2.size();
		System.out.println("저장된 객체의 갯수 : " + size);
		/*
		Iterator<ClassA> i = set2.iterator();
		System.out.print("set2 출력 : ");
		while(i.hasNext()) {
			ClassA ca = i.next();
			System.out.print(ca.str + ", ");
		}
		System.out.println();
		*/
		// 출력시 계속 호출이 되도록 메소드로 구현
		iteratorPrint(set2.iterator());
		
		set2.add(new ClassA("AWS"));
		iteratorPrint(set2.iterator());
		
		// 삭제 : oracle
		Iterator<ClassA> i = set2.iterator();
		while(i.hasNext()) {
			ClassA ca = i.next();
			String s = ca.str;
			if(s.equals("oracle"))
				i.remove();
		}
		
		iteratorPrint(set2.iterator());
	}
	
	static void iteratorPrint(Iterator<ClassA> i) {
		while(i.hasNext()) {
			ClassA ca = i.next();
			System.out.print(ca.str + ", ");
		}
		System.out.println();
	}
	
}




