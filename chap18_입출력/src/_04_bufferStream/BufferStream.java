package _04_bufferStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 보조 스트림 : 기반스트림만으로 부족했던 성능을 보다 향상 시켜주는 스트림
 			  기반스트림에서 제공하지 않는 추가적인 메소드 제공
 	>> 외부매체와 직접적으로 연결되지 않는 스트림
 	   단독사용 불가(반드시 기반스트림과 함께 사용)
 */
public class BufferStream {
	public void fileSave() {
		// 기반스트림 : FileWriter
		// 보조스트림 : BufferedWriter -> 버퍼 공간을 제공해주는 보조스트림 (속도 향상)
		/*
		// 1. 기반스트림 생성
		FileWriter fw = new FileWriter("c_buffer.txt");
		
		// 2. 보조스트림 생성
		BufferedWriter bw = new BufferedWriter(fw);
		*/
		/*
		// 위의 1.2를 한줄로
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine();	// 줄바꿈 : 보조스트림에 있는 메소드 
			bw.write("환영합니다");
			// 버퍼라는 공간에 계속 쌓아놨다가 한번에 출력해줌 => 속도 향상
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		
		
		// try-with-resource 구문으로 자원반납까지 자동으로 해주는 구문
		/*
		  try(try블럭내에서 사용할 스트림객체 생성 구문) {
		  	// 알아서 try가 다 끝나면 해당 스트림 반납까지 자동으로 해줌
		  	   
		  } catch (예외클래스 e) {
		  
		  }
		 */
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine(); 
			bw.write("환영합니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		// 기반스트림 : FileReader
		// 보조스트림 : BufferedReader -> 버퍼 공간을 제공해주는 보조스트림 (속도 향상)
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
			// readLine() : 보조스트림에 있는 메소드 -> 한줄씩 읽어옴
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
