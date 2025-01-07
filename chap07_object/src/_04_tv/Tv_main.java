package _04_tv;

public class Tv_main {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		System.out.println("회사명 : " + tv1.company);
		System.out.println("모델명 : " + tv1.model);
		System.out.println(tv1.inch + "인치");
		
		tv1.power();
		// System.out.println("전원 : " + tv1.power);
		System.out.println("현재 채널 : " + tv1.channelUp());
		System.out.println("현재 채널 : " + tv1.channelUp());
		System.out.println("현재 채널 : " + tv1.channelDown());
		System.out.println("현재 음량 : " + tv1.volume(5));
		System.out.println("현재 음량 : " + tv1.volume(3));
		tv1.power();
		// System.out.println("전원 : " + tv1.power);

	}

}
