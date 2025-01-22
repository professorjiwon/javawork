package _05_objectStream;

public class T01_ObjectStream_main {

	public static void main(String[] args) {
		PhoneStream ps = new PhoneStream();
		ps.fileSave();
		try {
			ps.fileRead();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
