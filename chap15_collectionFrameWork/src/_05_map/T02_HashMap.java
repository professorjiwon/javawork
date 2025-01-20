package _05_map;

import java.util.HashMap;
import java.util.Scanner;

public class T02_HashMap {

	public static void main(String[] args) {
		// 키=id, 값=pw  (3개를 hashMap 넣기)
		HashMap<String, String> map = new HashMap();
		map.put("myId", "pw123");
		map.put("idZang", "password7");
		map.put("youId", "678901");
		
		// 사용자로부터 id와 pw를 받아서
		// id가 map에 있나 확인. 없으면 '존재하지 않는 id입니다'
		// id가 있으면 pw를 보고
		// pw일치 하면 '로그인 되었습니다'
		// pw일치 하지 않으면 '비밀번호가 일치하지 않습니다'
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id 입력 : ");
		String id = sc.next();
		
		if(map.containsKey(id)) {
			System.out.print("pw 입력 : ");
			String pw = sc.next();
			
			if(pw.equals(map.get(id))) {
				System.out.println("로그인 되었습니다");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다");
			} 
		} else {
			System.out.println("존재하지 않는 id입니다");
		}
		
		/*
		boolean flag = false;
		while(true) {
			System.out.print("id 입력 : ");
			String id = sc.next();
			
			if(map.containsKey(id)) {
				while(true) {
					System.out.print("pw 입력 : ");
					String pw = sc.next();
					
					if(pw.equals(map.get(id))) {
						System.out.println("로그인 되었습니다");
						flag = true;
						break;
					} else {
						System.out.println("비밀번호가 일치하지 않습니다");
					}
				}
				if(flag)
					break;
			} else {
				System.out.println("존재하지 않는 id입니다");
				continue;
			}	
		}
		*/
	}
}
