package _02_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class T02_HashMap {

	public static void main(String[] args) {
		// 사용자의 id(키)와 pw(값)을 hashMap에 저장 (데이터 3개)
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("myId", "1234");
		map.put("idKim", "1111");
		map.put("imjiwon", "1124");
		
		// 사용자로부터 id와 pw받아서
		
		// 1. id가 없으면 : '입력한 id는 없습니다' 출력 후 다시 수행
		// 2. pw가 맞지 않으면 : 'pw가 맞지 않습니다' 출력 후 다시 수행
		// 3. id와 pw가 맞으면 '로그인 되었습니다'. 출력 후 종료
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("id 입력 : ");
			String id = sc.nextLine();			
			System.out.print("pw 입력 : ");
			String pw = sc.nextLine();
			if(map.containsKey(id) && map.get(id).equals(pw)) {
				System.out.println("로그인 되었습니다");
				break;
			} else if(map.containsKey(id)){
				System.out.println("id가 없습니다");	
			} else {
				System.out.println("pw틀립니다");
			}
			/*
			if(map.containsKey(id) && map.get(id).equals(pw)) {
				System.out.println("로그인 되었습니다");
				break;
			} else {
				System.out.println("id와 비밀번호가 일치하지 않습니다");	
			} 
			*/
		}
		
		/*
		while(true) {
			System.out.print("id 입력 : ");
			String id = sc.nextLine();
			
			if(map.containsKey(id)) {
				System.out.print("pw 입력 : ");
				String pw = sc.nextLine();
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다");
					break;
				} else {
					System.out.println("비밀번호 일치하지 않습니다. 다시 입력하세요");
				}	
			} else {
				System.out.println("입력한 id는 없습니다");
			}
		}
		*/
	}
}
