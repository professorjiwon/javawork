package _06_Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class T01_Network {

	public static void main(String[] args) {
		// 서버에 요청하기 위해서는 그 요청하고자 하는 서버의 ip주소(또는 도메인명), port번호를 알아야됨
		try {
			// InetAddress : 네트워크 정보(ip주소 관련)를 확인할 수 있는 클래스
			InetAddress localhost = InetAddress.getLocalHost(); // 내pc에 대한 정보 반환
			System.out.println(localhost);  // 내pc명 / 내ip주소
			
			System.out.println("내 pc명 : " + localhost.getHostName());
			System.out.println("내 ip주소 : " + localhost.getHostAddress());
			System.out.println("-----------------------------");
			
			// 도메인을 통해서 그 서버의 정보를 얻어오기
			InetAddress googleHost = InetAddress.getByName("google.com");
			System.out.println("구글 서버명 : " + googleHost.getHostName());
			System.out.println("구글 ip주소 : " + googleHost.getHostAddress());
			System.out.println("-----------------------------");
			
			// 도메인을 통해서 그 서버에 관련된 것들을 배열로 받을 수 있다
			InetAddress[] naverHost = InetAddress.getAllByName("naver.com");
			System.out.println("네이버 호스트의 갯수 : " + naverHost.length);
			for(InetAddress i : naverHost) {
				System.out.println("네이버 서버명 : " + i.getHostName());
				System.out.println("네이버 ip주소 : " + i.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			// UnknownHostException : 서버의 DNS설정이 안되어 있어 host를 찾지 못할 때
			//						  서버의 설정된 DNS가 해당 도메인을 찾을 수 없을 때 발생되는 예외
			e.printStackTrace();
		} 
	}
}
