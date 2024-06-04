package _06_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {
	/*
	 * 현재 구동중인 서버가 있으면 클라이언트는 그서버로 요청을 보낼수 있음 => 응답결과가 돌아옴
	   - 요청과 응답에 의해서 프로그램이 돌아감("통신"한다라고 표현)
	   - 웹에서는 통신방식 : http 프로토콜 통신(https)
	   
	 * 자바만을 가지고 서버와 클라이언트간에 간단한 통신하기
	   이때 데이터를 입출력하고자 한다면 서버와 클라이언트간에 스트림(연결통로)이 필요
	   
	 * 소켓 : 프로세스간의 통신을 담당. 스트림을 연결하기 위한 문.
	 * 소켓 프로그래밍
	    - TCP : 데이터를 정확하고 안정적으로 전달 가능(신뢰성). 느림(이메일, http)
	    - UDP : 신뢰성이 없는 데이터 전달. 빠름(실시간 동영상 서비스)
	 */
	
	  /*
	   * TCP(Treansmission Control Protocol)
	     - 서버, 클라이언트 1:1소켓통신
	     - 데이터를 교환하기 전에 서버, 클라이언트가 연결되어 있어야됨
	     
	   * Socket
	     - Input/OutputStream을 가지고 소켓통신을 함
	     
	   * ServerSocket
	     - 포트와 연결(Bind)되어 외부의 연결요청을 기다리다 연결요청이 들어오면 수락해줄 용도
	       수락 => 통신할 수 있는 socket생성
	   */
	public static void main(String[] args) {
		// 1) 포트번호 지정
		int port = 9001;
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;	// 입력용 스트림
		PrintWriter pw = null;		// 출력용 스트림
		
		ServerSocket server = null;
		try {
			// 2) ServerSocket 객체 생성시 포트 결합(Bind)
			server = new ServerSocket(port);
			
			// 3) 클라이언트의 요청이 올 때까지 대기 상태
			System.out.println("클라이언트의 요청을 기다리고 있음...");
			
			// 4) 연결 요청이 들어오면 수락 후 해당 클라이언트와 통신할 수 있는 서버측 소켓 객체 생성
			Socket socket = server.accept(); 
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결요청함!");
			/*
			// 5) 클라이언트와 입출력 기반스트림 생성(바이트 스트림밖에 안됨)
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			// 6) 성능향상을 위해 보조스트림 사용
			br = new BufferedReader(new InputStreamReader(is));
			*/
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			// 데이터 출력시 print(), println() 메소드를 가지고 있는 보조스트림
			
			pw.println("환영합니다!!! 🐱‍💻");
			pw.flush();
			
			while(true) {
				// 7) 스트림을 통해 읽고 쓰기
				// 클라이언트측의 메시지 읽기
				System.out.println("클라이언트 : " + br.readLine());
				
				// 클라이언트에게 메시지 보내기
				System.out.print("서버 : " );
				pw.println(sc.nextLine());
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				br.close();
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}









