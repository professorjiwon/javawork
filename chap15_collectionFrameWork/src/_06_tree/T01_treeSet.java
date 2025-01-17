package _06_tree;

import java.util.TreeSet;

public class T01_treeSet {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		
		System.out.println("95점 보다 한단계 낮은 점수 : " + scores.lower(95));
		System.out.println("95점 보다 한단계 높은 점수 : " + scores.higher(95));
		
		System.out.println("95점 이거나 혹은 한단계 낮은 점수 : " + scores.floor(95));
		System.out.println("81점 이거나 혹은 한단계 낮은 점수 : " + scores.floor(81));
		
		System.out.println("95점 이거나 혹은 한단계 높은 점수 : " + scores.ceiling(95));
		System.out.println("81점 이거나 혹은 한단계 높은 점수 : " + scores.ceiling(81));
		
		System.out.println("총 객체 수 : " + scores.size());
		
		// int score = scores.pollFirst();
		while(!scores.isEmpty()) {
			System.out.println("첫번 째 노드 삭제 : " + scores.pollFirst());
			System.out.println("총 객체 수 : " + scores.size());
		}
	}
}