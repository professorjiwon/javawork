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
		
		try {
			try(ServerSocket server = new ServerSocket(port)) {
				System.out.println("클라이언트의 요청을 기다리고 있음...");
				
				Socket socket = server.accept(); 
				System.out.println(socket.getInetAddress().getHostAddress() + "가 연결요청함!");
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintWriter pw = new PrintWriter(socket.getOutputStream())){
				
					pw.println("환영합니다!!! 🐱‍💻");
					pw.flush();
					
					String msg = null;
					while((msg = br.readLine()) != null) {
						if(msg.equals("exit")) {
							System.out.println("채팅을 종료합니다");
							break;
						}
						System.out.println("클라이언트 : " + msg);
						
						System.out.print("서버 : " );
						pw.println(sc.nextLine());
						pw.flush();
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}