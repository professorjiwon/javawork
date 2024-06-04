package _05_ObjectStream;

import java.io.Serializable;

/*
 * 객체를 입출력하고자 한다면 반드시 직렬화 과정 필수
   - 직렬화(serialization) : 객체를 스트림으로 만드는 작업
   - 반드시 implements Serializable 해줌
 */
public class Phone implements Serializable {
	private String name;
	private int price;
	
	public Phone() {
	}
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
}
