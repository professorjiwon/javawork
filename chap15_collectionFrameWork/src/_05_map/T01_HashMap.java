package _05_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 넣기 : put(key,value)
		map.put("홍길동", 87);
		map.put("동장군", 98);
		map.put("이동지", 67);
		map.put("박하지", 79);
		System.out.println("총 entry 수 : " + map.size());
		
		// 객체 얻어오기 : get(key)
		System.out.println(map.get("이동지"));
		
		System.out.println(map);
		System.out.println();
		
		// 객체 삭제 : remove(key)
		map.remove("박하지");
		System.out.println("박하지 삭제 후 : " + map);
		
		// 동일한 키로 값 넣기(기존의값 변경)
		// 없는 키이면 삽입, 있는 키이면 변경
		map.put("아무개", 100);
		System.out.println(map);
		map.put("홍길동", 0);
		System.out.println(map);
		System.out.println("----------------------------");
		
		// 객체 하나씩 출력 하려면
		Set<String> keySet = map.keySet();
		Iterator<String> keyInter = keySet.iterator();
		while(keyInter.hasNext()) {
			String key = keyInter.next();
			int value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
