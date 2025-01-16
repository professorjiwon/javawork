package _01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T02_ArrayList {

	public static void main(String[] args) {
		// 어떠한 객체도 다 받겠다
		// 권장하지 않음
		List list = new ArrayList<>();
		list.add(1);
		list.add(2.34);
		list.add("5");
		
		System.out.println(list.get(0));
		
		// 반환형인 Object로 받아야 됨
		Object num = list.get(0);
		
		int num1 = (int)list.get(0);
		double dou2 = (double)list.get(1);
		int str = Integer.parseInt((String)list.get(2));
	}

}
