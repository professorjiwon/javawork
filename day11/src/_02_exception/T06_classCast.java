package _02_exception;

class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }

public class T06_classCast {
	public static void main(String[] args) {
		try {
			Animal ani = new Animal();
			Dog dog = new Dog();
			Cat cat = new Cat();
			
			Animal aniDog = dog;
			Animal aniCat = cat;
			
			dog = (Dog)aniDog;
			dog = (Dog)ani;   //예외발생
		} catch(ClassCastException e) {
			System.out.println("부모타입을 자식의 타입으로 형변환할 수 없음");
		}
		/*
		// Dog dog = new Dog();				// 변환가능
		Animal animal dog = new Animal();  //변환불가
		if((change(dog)) == null) {
			System.out.println("변환불가");
		} else {
			dog = change(dog);
		}
		*/
	}
	/*public static Dog change(Animal animal) {
		Dog dog = null;
		if(animal instanceof Dog)
			dog = (Dog)animal;
	
		return dog;
	}*/
}





