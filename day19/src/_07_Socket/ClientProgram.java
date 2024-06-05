package _07_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {
	public static void main(String[] args) {
		// 서버의 도메인이름
		// 내pc에서 서버도 돌리고, 클라이언트도 돌리고, 도메인없음
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;		
		Socket socket = null;
		try {
			String serverIp = InetAddress.getLocalHost().getHostAddress();
			int port = 9001;
			
			// 1) 서버에 연결 요청 보내는 구문(요청하고자하는 서버의 ip주소와 포트번호를 제시하면서 소켓 생성)
			socket = new Socket(serverIp, port);
			
			// 2) 서버와 입출력 기반스트림 생성
			// 3) 보조스트림 통해서 성능개선
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			
			// 서버의 환영메시지 출력
			System.out.println(br.readLine());
			
			while(true) {
				System.out.print("클라이언트 : ");
				pw.println(sc.nextLine());
				pw.flush();
				
				System.out.println("서버 : " + br.readLine());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}