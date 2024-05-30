package _02_comparable;

import java.util.*;

class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		if(age < o.age)
			return -1;
		else if(age == o.age)
			return 0;
		else
			return 1;
	}
}

public class T01_comparable {
	public static void main(String[] args) {
		TreeSet<Person> treeset = new TreeSet<Person>();
		
		treeset.add(new Person("홍길동", 45));
		treeset.add(new Person("나자바", 25));
		treeset.add(new Person("채규태", 31));
		
		Iterator<Person> iterator = treeset.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " : " + person.age);
		}
	}
}
