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
		try {
			Scanner sc = new Scanner(System.in);
			int port = 9001;
			
			String serverIp = InetAddress.getLocalHost().getHostAddress();

			try(Socket socket = new Socket(serverIp, port);
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream())) {
				
				System.out.println(br.readLine());
				
				while(true) {
					System.out.print("클라이언트 : ");
					String sendMsg = sc.nextLine();
					pw.println(sendMsg);
					pw.flush();

					if(sendMsg.equals("exit"))
						break;
					
					System.out.println("서버 : " + br.readLine());
				}
				System.out.println("서버와 연결 해제함");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}