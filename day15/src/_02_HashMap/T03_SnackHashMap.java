package _02_HashMap;

import java.util.*;
import java.util.Map.Entry;

public class T03_SnackHashMap {

	public static void main(String[] args) {
		Map<String, Snack> map = new HashMap<String, Snack>();
		
		map.put("포테이토칩", new Snack("짠맛", 500));
		map.put("새우깡", new Snack("매운새우맛", 400));
		map.put("치토스", new Snack("바베큐맛", 700));
		map.put("홈런볼", new Snack("단맛", 800));
		System.out.println(map);

		// 키값이 있으면 값을 덮어쓰기, 키값이 없으면 넣기
		map.put("새우깡", new Snack("순한새우맛", 300));
		System.out.println(map);
		
		// replace 키에 해당하는 값 변경(키가 없으면 아무것도 하지 않음)
		map.replace("치토스", new Snack("양념치킨맛", 700));
		System.out.println(map);
		System.out.println("------------------------------");
		
		// 1) Iterator에서 사용하려면 Map => Set => Iterator
			// 1.1. Mapt => Set으로 변경
		Set<String> keySet = map.keySet();
		
			// 1.2. Set => Iterator에 담기 
		Iterator<String> itKey = keySet.iterator();
		
			// 1.3. Iterator를 돌면서 출력
		while(itKey.hasNext()) {
			String key = itKey.next();
			Snack value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("------------------------------");
		
		// 2) EntrySet() 이용하는 방법
		//   제네릭을 안넣고 사용
		Set entrySet = map.entrySet();	// 키+값 세트의 집합
		Iterator itEntry = entrySet.iterator();
		while(itEntry.hasNext()) {
			Entry entry = (Entry)itEntry.next();
			
			// Entry = key+value이 있는 엔트리타입
			String key = (String)entry.getKey(); // Entry중에서 key만 얻어옴. key는 String타입
			Snack value = (Snack)entry.getValue();
			
			System.out.println(key + " / " + value);
		}
		System.out.println("------------------------------");
		
		/*
		 * 제네릭을 넣으려면 매개변수는 1개만 넣어야 됨
		   Set<String, Snack> e = map.entrySet();  // 오류. Set(1개의 매개변수)
		
		 * 아래처럼 사용해야 됨
		   Set<Entry<String, Snack>> e = map.entrySet();
		*/
		// 제네릭을 넣고 사용
		Set<Entry<String, Snack>> entrySet2 = map.entrySet();
		Iterator<Entry<String, Snack>> itEntry2 = entrySet2.iterator();
		while(itEntry2.hasNext()) {
			Entry<String, Snack> entry = itEntry2.next();
			
			String key = entry.getKey();
			Snack value = entry.getValue();
			
			System.out.println(key + " - " + value);
		}
	}
}