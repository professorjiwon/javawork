package _08_comparable;

import java.util.Comparator;

// Comparable 인터페이스의 compareTo()가 오버라이딩 되어있는 상태에서 사용
class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			// return c1.compareTo(c2) * -1;
			return c2.compareTo(c1);
		}
		return 0;
	}

}
public class T02_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
