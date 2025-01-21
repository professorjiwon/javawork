package _03_enum;

public class T02_enumNews {

	public static void main(String[] args) {
		News news1 = News.EAST;
		News news2 = News.valueOf("WEST");
		News news3 = Enum.valueOf(News.class, "EAST");
		
		System.out.println("news1 = " + news1);
		System.out.println("news2 = " + news2);
		System.out.println("news3 = " + news3);
		
		System.out.println("news1==news2 ? " + (news1==news2));
		System.out.println("news1==news3 ? " + (news1==news3));
		System.out.println("news1.equals(news3) ? " + news1.equals(news3));
		
		// News[] newsArr = News.values();
		for(News n : News.values())
			System.out.println(n);
		
		System.out.println("-------------");
		
		// String name() : 열거형 상수의 이름을 문자열로 리턴
		for(News n : News.values())
			System.out.println(n.name());
	}
}
