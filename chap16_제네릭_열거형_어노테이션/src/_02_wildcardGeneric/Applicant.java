package _02_wildcardGeneric;

public class Applicant<T> {
	T kind;
	
	Applicant(T kind) {
		this.kind = kind;
	}
}
