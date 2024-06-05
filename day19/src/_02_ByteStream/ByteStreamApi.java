package _02_ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamApi {
	/*
	 xxxInputStream : xxx매체로 부터 데이터를 입력받는 통로(외부매체로부터 데이터를 읽어온다)
	 xxxOutputStream : xxx매체로 데이터를 출력하는 통로(외부매체로 데이터를 내보낸다. 쓴다)
	 */
	
	// 외부매체 파일에 출력을 한다. 데이터를 파일로 내보내기. 즉 파일로 저장
	void fileSave() {
		// FileOutputSream : 파일과 직접연결해서 1byte단위로 출력하는 스트림
		
		// 순서
		// 1. 스트림 생성(통로만들기)
		// 2. 스트림으로 데이터를 출력(메소드 활용)
		// 3. 다 사용한 후 스트림을 반납
		FileOutputStream fout = null;
		try {
			// 1.
			// 파일이 없으면 만들어주고 있으면 통로 연결
			fout = new FileOutputStream("file_byte.txt");
			
			// 2. 파일에 데이터 출력하고자 할때 write메소드 사용
			// 숫자를 출력하든 문자를 출력하든 파일에 기록되는건 문자로 기록됨(아스키코드)
			fout.write(97);
			fout.write('b');
			
			byte[] arr = {99, 65, 100};
			fout.write(arr);
			
			// write(매개변수 1개) : 매개변수에 있는 문자를 쓰시오
			// write(byte[] b, int offset, int len)
			fout.write(arr, 1, 2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 3. 스트림 반납
		try {
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 외부매체로 부터 파일을 읽어온다(입력 : 파일로부터 데이터 가져오기)
	void fileRead() {
		// FileInputStream : 파일로 부터 1바이트 단위로 입력받는 스트림
		
		// 순서
		// 1. 스트림 생성(통로만들기)
		// 2. 스트림으로 데이터를 입력(메소드 활용)
		// 3. 다 사용한 후 스트림을 반납
		
		FileInputStream fin = null;
		try {
			// 1. 
			fin = new FileInputStream("file_byte.txt");
			
			// 2. read() 메소드 이용
			// 1byte씩 아스키코드로 읽어옴(숫자)
			/*
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			*/
			
			// 하나씩 건너띄어서 나옴
			/*
			while(fin.read() != -1) {
				System.out.println(fin.read());
			}
			*/
			
			// 해결방법 1.무한반복으로 돌면서 매번 조건검사
			/*
			while(true) {
				int value = fin.read();
				if(value == -1)
					break;
				System.out.println(value);
			}
			*/
			
			// 해결방법 2.권장방법
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.println((char)value);
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}







