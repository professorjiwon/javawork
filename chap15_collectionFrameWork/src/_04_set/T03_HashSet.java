package _04_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// equals()를 오버라이딩 했을 때 hashCode()를 반드시 오버라이딩 해야 됨
class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return m.name.equals(name) && m.age==age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}

public class T03_HashSet {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("오로라", 23));
		set.add(new Member("홍길동", 20));
		set.add(new Member("아무개", 30));
		set.add(new Member("이순신", 60));
		set.add(new Member("아무개", 30));
		
		System.out.println("총 객체 수 : " + set.size());
		
		Iterator<Member> iter = set.iterator();
		iterPrint(iter);

	}
	
	static void iterPrint(Iterator<Member> i) {
		while(i.hasNext()) {
			Member m = i.next();
			System.out.print(m.name + " " + m.age + ", ");
		}
		System.out.println();
	}
}
