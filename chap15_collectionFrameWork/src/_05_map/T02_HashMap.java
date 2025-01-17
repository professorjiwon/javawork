package _05_map;

import java.util.HashMap;

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

	}

}
