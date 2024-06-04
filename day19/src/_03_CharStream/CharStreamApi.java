package _03_CharStream;

import java.io.*;

public class CharStreamApi {
	// 문자기반 스트리 2byte씩 전송
	/*
	   xxxReader : 입력용 스트림
	   xxxWriter : 출력용 스트림
	 */
	
	// 출력용 스트림
	void fileSave() {
		FileWriter fw = null;	
		try {
			// 1.
			fw = new FileWriter("file_char.txt");
			
			// 2.
			fw.write('김');
			fw.write("와우 점심시간 끝났다");
			fw.write(' ');
			fw.write('A');
			fw.write("\n");
			
			char[] arr = {'t','j','o','e','u','n'};
			fw.write(arr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 입력용 스트림
	void fileRead() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("file_char.txt");
			
			int value=0;
			while((value=fr.read()) != -1) {
				System.out.print((char)value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}









