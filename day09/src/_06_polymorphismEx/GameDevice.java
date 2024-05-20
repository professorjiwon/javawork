package _06_polymorphismEx;

public class GameDevice extends Product{
	GameDevice() {
		super(80);
	}
	@Override
	public String toString() {
		return "GameDevice";
	}
}
