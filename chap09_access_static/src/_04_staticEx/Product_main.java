package _04_staticEx;
class Product {
	String serialNo;
	static int count;
	
	Product() {
		serialNo = "더조은" + ++count;
	}
}
public class Product_main {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 제품번호 : " + p1.serialNo);
		System.out.println("p2 제품번호 : " + p2.serialNo);
		System.out.println("p3 제품번호 : " + p3.serialNo);
		System.out.println("생산된 총 제품의 수 : " + Product.count);
	}
}