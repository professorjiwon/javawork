package _07_ex;

public class Product_main {

	public static void main(String[] args) {
		Game game = new Game();
		
		System.out.print(game);
		game.power();
		
		System.out.println("볼륨 : " + game.volume(5));
		game.changeGame("왕좌의 게임");
		
		System.out.println("-----------------------------------");
		
		Tv tv = new Tv();
		
		System.out.print("Tv의 ");
		tv.power();
		
		System.out.println("볼륨 : " + tv.volume(10));
		System.out.println("채널 : " + tv.channel(9));
		
		System.out.println("-----------------------------------");
		game.search("메이플 스토리");
		Product.aiSpeak("오늘 날씨 어때?");
		
		tv.search("재미있는 얘기");
		Product.aiSpeak("오늘 점심메뉴를 추천해죠!");
	}
}
