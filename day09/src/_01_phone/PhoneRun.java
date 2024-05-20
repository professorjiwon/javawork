package _01_phone;

public class PhoneRun {

	public static void main(String[] args) {
		SmartPhone sPhone1 = new SmartPhone("note20","white");
		System.out.println("model명 : " + sPhone1.model);
		System.out.println("색상 : " + sPhone1.color);
		
		sPhone1.bell();
		sPhone1.hangUp();
		sPhone1.receveVoice("안녕하세요 홍길동 입니다");
		sPhone1.sendVoice("네 반가워요");
		sPhone1.hangOut();
		sPhone1.search("java");
		
		Phone phone1 = new Phone("apple3","black");
		phone1.bell();
		phone1.hangOut();
		// phone1.search(); 사용못함
	}
}
