package _07_Predicate;

public class Student {
	private String name;
	private String gender;
	private int com;
	public Student(String name, String gender, int com) {
		super();
		this.name = name;
		this.gender = gender;
		this.com = com;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getCom() {
		return com;
	}
}
