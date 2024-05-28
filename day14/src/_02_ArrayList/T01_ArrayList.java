package _02_ArrayList;

import java.util.*;

public class T01_ArrayList {

	public static void main(String[] args) {
		/*
		 <제네릭> : 자료형을 넣어주는 것을 권장함.
		 		   여러 자료형을 받을 시 클래스를 만들어 객체로 넘겨주는 것을 권장함
		 		   
		  배열의 갯수 지정 가능 : 기본값 10개
		  ArrayList<> ??? = new ArrayList<>(배열의 갯수);
		 */
		
		ArrayList<String> alist = new ArrayList<String>(15);
		
		// 자식객체를 부모타입으로 자동형변환하여 사용가능
		List<String> list = new ArrayList<String>();
		list.add("java");		// list[0]
		list.add("Database");	// list[2]
		list.add("HTML");		// list[3]
		list.add(1, "객체 모델링");	//list[1]
		list.add("javascript");
		
		System.out.println("총 저장된 객체 수 : " + list.size());
		// System.out.println(list[3]);	직접 index를 사용할 수 없음
		System.out.println(list.get(3));	// get(index) 메소드를 이용하여 얻어옴
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+1 + ". " + list.get(i));
		}
		System.out.println("------------------------");
		
		int count = 1;
		for(String str : list) {
			System.out.println(count++ + ". " + str);
		}
		System.out.println("------------------------");
		
		list.remove(2);
		list.remove(2);
		list.remove("객체 모델링");
		list.remove(list.get(0));
		System.out.println(list);
		
		list.add("java");
		list.add("Database");
		list.add("HTML");
		System.out.println(list);
		System.out.println("------------------------");
		
		// set() : index자리에 기존것 삭제하고 들어감
		list.set(2, "객체 모델링");
		System.out.println(list);
	}
}
