package _02_abstractPhone;

public class FolderPhone extends Phone{
	FolderPhone() {
		this("실버폰","검정");	
	}
	
	FolderPhone(String model, String color) {
		super(model, color);
	}
	
	@Override
	void hangUp() {
		System.out.println("뚜껑을 연다");
	}
	
	@Override
	void hangOut() {
		System.out.println("뚜껑을 닫는다");
	}
}
