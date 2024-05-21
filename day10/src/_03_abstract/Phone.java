package _03_abstract;

abstract public class Phone {
	String owner;
	
	Phone(String owner) {
		this.owner = owner;
	}
	
	abstract void turnOn();
	abstract void turnOff();
	
}
