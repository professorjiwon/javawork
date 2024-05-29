package _03_Tree;

import java.util.Scanner;
import java.util.TreeSet;

public class T02_TreeSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구매할 횟수 입력 : ");
		int count = sc.nextInt();
				
		for(int i=1; i<=count; i++) {
			TreeSet ts = new TreeSet();
			while(ts.size() < 6) {
				ts.add((int)(Math.random()*45) + 1);
			}
			System.out.println(ts);
		}
	}
}
