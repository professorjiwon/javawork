package _01_operation;

public class T02_increase {

	public static void main(String[] args) {
		// ++ 1증가
		int num1 = 10;
		num1 = num1 + 1;
		num1 += 1;
		num1++;
		System.out.println(num1);
		
		// --  1감소
		num1 = 10;
		num1--;
		System.out.println(num1);
		
		// 단항연산자일때는 연산자가 앞이나 뒤나 결과는 똑같음
		++num1;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
		
		// 이항연산자일때는 연산자의 위치에 따라 결과가 달라짐
		int num2 = 10;
		int num3 = 10;
		
		int result = ++num2 + ++num3;
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;
		result = ++num2 + num3++;
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;
		result = num2-- + num3--;
		
		num2 = 10;
		num3 = 10;
		int num4 = 10;
		result = ++num2 + num3-- - num4++;
	}
}
