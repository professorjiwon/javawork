package _07_treeMap;

import java.util.Map;
import java.util.TreeMap;

public class T02_treeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> score = new TreeMap<Integer, String>();
		score.put(87, "홍길동");
		score.put(98, "아무개");
		score.put(75, "김삼순");
		score.put(100, "나자바");
		score.put(64, "이고잉");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = score.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.lowerEntry(95);
		System.out.println("95점 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.higherEntry(95);
		System.out.println("95점 바로 위의 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.floorEntry(95);
		System.out.println("95점 이거나 또는 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.ceilingEntry(87);
		System.out.println("87점 이거나 또는 바로 위의 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = score.pollFirstEntry();
		System.out.println("삭제된 객체 : " + entry.getValue());
		System.out.println("남은 객체 수 : " + score.size());
	}
}
