package _02_abstractPhone;

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
		System.out.println("----------------------");
		
		FolderPhone fp = new FolderPhone();
		System.out.println(fp.model);
		System.out.println(fp.color);
		
		fp.bell();
		fp.hangUp();
		fp.sendVoice("여보세요 더조은씨 바꿔주세요");
		fp.receveVoice("네 접니다");
		fp.sendVoice("수고하세요");
		fp.receveVoice("네");
		fp.hangOut();		
		System.out.println("----------------------");
	}
}
