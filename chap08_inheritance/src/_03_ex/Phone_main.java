package _03_ex;

public class Phone_main {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		System.out.println(sp.model);
		System.out.println(sp.color);
		
		sp.bell();
		sp.hangUp();
		sp.sendVoice("여보세요 이순신씨 입니까?");
		sp.receveVoice("네 맞습니다");
		sp.sendVoice("수고하세요");
		sp.receveVoice("네");
		sp.hangOut();
		
		System.out.println("----------------------");
		
		SmartPhone sp1 = new SmartPhone("LG", "검정");
		System.out.println(sp1.model);
		System.out.println(sp1.color);
		
	}

}
