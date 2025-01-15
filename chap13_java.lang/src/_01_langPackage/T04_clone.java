package _01_langPackage;
/*
 * clone() : 객체 복제
	1. 반드시 clone하고자하는 클래스에 implements Cloneable 반드시 넣어줘야 한다
	   : '이 클래스는 복제할수 있는 클래스이다'라는것을 알려줄 목적
	2. clone()을 오버라이딩하지 않아도 된다. 
		그러나 Object클래스의 clone()메소드는 접근제어자가 protected라서 같은 java.lang패키지에 있어야 됨
		접근못함 오류발생
	3. 2번과 같은 이유로 clone()을 오버라이딩 해야함	  
*/
class A {
	int num = 3;
}

class Point implements Cloneable{       										
	int x;
	int y;
	A a = new A();  // 참조형 변수 
	
	Point() { }
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	// return의 자료형이 Object클래스 사용할 때는 형변환을 계속 해줘야 한다.
	/*
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	*/
	
	// 처음부터 반환형을 자신의 객체 클래스로 해주면 사용시 형변환하지 않아도됨
	@Override
	public Point clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		// 참조형 변수도 새롭게 만들어서 객체의 주소가 다른 주소가 들어가야 된다
		A b = a;
		a = new A();
		a.num = b.num;
		
		return (Point)obj;
	}

	@Override
	public String toString() {
		return "x=" + x + ", y=" + y + ", a.num=" + a.num;
	}
}

public class T04_clone {
	public static void main(String[] args) {
		Point original = new Point(3, 4);
		Point copy = original.clone();
		
		copy.a.num = 100;
		
		System.out.println(original.a.num);
		System.out.println(copy.a.num);
		System.out.println("original 객체 : " + original);
		System.out.println("복제 객체 : " + copy);		
		System.out.println("-------------------------------");	
	}
}
