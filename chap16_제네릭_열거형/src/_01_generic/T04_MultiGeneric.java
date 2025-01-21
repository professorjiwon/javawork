package _01_generic;
class Car {public String toString() {return "Car"; } }
class Tv {public String toString() {return "Tv"; } }
class Product<K, M> {
	private K kind;
	private M model;
	public K getKind() {return kind;}
	public void setKind(K kind) {this.kind = kind;}
	public M getModel() {return model;}
	public void setModel(M model) {this.model = model;}
}
public class T04_MultiGeneric {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("울트라 Full HD");
		
		Tv kind = product1.getKind();
		String model = product1.getModel();
		
		System.out.println("구매 물품 : " + kind);
		System.out.println("제품명 : " + model);
		System.out.println("----------------------------");
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("제네시스");
		
		Car kind2 = product2.getKind();
		
		System.out.println("구매 물품 : " + kind2);
		System.out.println("제품명 : " + product2.getModel());
	}
}