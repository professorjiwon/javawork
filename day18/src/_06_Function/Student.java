package _06_Function;

public class Student {
	private String name;
	private int eng;
	private int com;
	
	public Student(String name, int eng, int com) {
		this.name = name;
		this.eng = eng;
		this.com = com;
	}
	
	public String getName() {
		return name;
	}

	public int getEng() {
		return eng;
	}

	public int getCom() {
		return com;
	}
}
