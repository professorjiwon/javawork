package _06_tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class T03_treeSet {

	public static void main(String[] args) {
		Integer[] score = {100, 87, 45, 68, 95, 70};
		
		TreeSet<Integer> setScores = new TreeSet<>();
		for(Integer i : score) {
			setScores.add(i);
		}
										// false => 88포함 안함, true => 88포함
		NavigableSet<Integer> result1 = setScores.headSet(87, false);
		System.out.println("87점 미만인 점수 검색 : " + result1);
		
		NavigableSet<Integer> result2 = setScores.headSet(87, true);
		System.out.println("87점 이하인 점수 검색 : " + result2);
		
		NavigableSet<Integer> result3 = setScores.tailSet(87, false);
		System.out.println("87점 초과인 점수 검색 : " + result3);
		
		NavigableSet<Integer> result4 = setScores.tailSet(87, true);
		System.out.println("87점 이상인 점수 검색 : " + result4);
		
		NavigableSet<Integer> result5 = setScores.subSet(70, false, 95, true);
		System.out.println("70점 초과 95점 이하인 점수 검색 : " + result5);
	}
}