package _07_Socket;

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
	public static void main(String[] args) {
		int port = 9001;
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;	
		PrintWriter pw = null;		
		ServerSocket server = null;
		
		try {
			try() {
				server = new ServerSocket(port);
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
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}









