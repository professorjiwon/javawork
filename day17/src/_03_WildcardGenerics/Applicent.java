package _03_WildcardGenerics;

public class Applicent<T> {
	T kind;
	
	Applicent(T kind) {
		this.kind = kind;
	}
}
