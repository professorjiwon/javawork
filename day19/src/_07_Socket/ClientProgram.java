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
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;		
		Socket socket = null;
		try {
			String serverIp = InetAddress.getLocalHost().getHostAddress();
			int port = 9001;

			socket = new Socket(serverIp, port);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
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