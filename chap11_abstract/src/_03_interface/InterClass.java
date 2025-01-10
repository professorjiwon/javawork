package _03_interface;

public class InterClass implements Inter{

	@Override
	public void print(int a) {
		System.out.println("받은 값 : " + a);	
	}

	@Override
	public void inMethod() {
		System.out.println("매개변수가 없음");		
	}

	@Override
	public String inStr(String name) {
		return "이름 : " + name;
	}

}
