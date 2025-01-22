package _05_objectStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PhoneStream {
	public void fileSave() {
		Phone p1 = new Phone("갤럭시12", 2000000);
		Phone p2 = new Phone("아이폰", 1800000);
		Phone p3 = new Phone("갤럭시노트", 1500000);
		
		// 기반 스트림 : FileOutputStream
		// 보조 스트림 : ObjectOutputStream
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead(){
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))) {
			while(true) {
				System.out.println(ois.readObject());
				// 파일의 끝을 만나면 EOFException 예외 발생
			}
		} catch (EOFException e) {
			System.out.println("파일을 다 읽었습니다");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
