package _02_repetitive;

public class T05_etc_for {

	public static void main(String[] args) {
		// 같은 자료형 일때
		int num1, num2, num3;
		num1= 10;
		num2=10;
		num3=10;
		
		int num4=10, num5=10, num6=10;
		num4 = num5 = num6 = 100;
		
		// for문에서 여러개의 변수 사용가능
		// ** 주의 : 조건식은 반드시 변수가 하나만 들어가야 한다
		for(int i=1, j=30; i<=10; i++, j--) {
			System.out.println("i=" + i + ", j=" + j);
		}
		
		// for(;;) : while(true)와 동일
		int num7 = 10;
		for(;;) {
			System.out.println(num7);
			
			if(num7 == 15)
				break;
			
			num7++;
		}
		System.out.println("--------------------");
		
		// for문에 이름을 달아줄 수 있다
		loop : for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
				if(i==5)
					break loop;
			}
			System.out.println();
		}
		System.out.println("구구단 종료");
		
		
		outer : for(int dan=2; dan<=9; dan++) {
			inner : for(int i=1; i<=9; i++) {
				for(int z=1; z<=5; z++) {
					System.out.println(dan + ", " + i + ", " + z);
					if(z==3)
						break inner;
				}
			}
			System.out.println("inner for문 종료");
		}
		System.out.println("outer for문 종료");
	}
}