package _01_operation;

public class T04_logical {

	public static void main(String[] args) {
		// 논리곱과 논리합
		/*
		  x  y  논리곱(&&)  논리합(||)
		  0  0  	0		 0	  
		  0  1  	0		 1
		  1  0  	0		 1
		  1  1  	1		 1
		 */
		
		int num1 = 10;
		int num2 = 20;
		boolean re1 = num1 > num2 && num1 <= num2;
		  //    f(0)       f(0)	  &&     t(1) 
		System.out.println(re1);
		
		re1 = num1 > num2 || num1 <= num2;
		System.out.println(re1);
		System.out.println("-----------------");
		
		// ! : not
		re1 = !re1;
		System.out.println(re1);
		boolean b1 = false;
		System.out.println(!b1);
		
		char ch = 'K';  //75
		System.out.println(ch);
		System.out.println("소문자 인가? " + (ch >= 'a' && ch <= 'z')); // 97~122
		System.out.println("대문자 인가? " + (ch >= 'A' && ch <= 'Z')); // 65~90
		/*
		     65, 66, 67, ... 90, ...
		 ... 65, 66, 67, ... 90
		 */                                   
	}
}
