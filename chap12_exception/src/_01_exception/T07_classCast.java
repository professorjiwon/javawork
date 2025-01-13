package _01_exception;
// ClassCastException : 다형성에서 부모타입을 자식타입으로 변환시 변환할 수 없을 때
class Animal {  }
class Dog extends Animal {  }
class Cat extends Animal {  }

public class T07_classCast {
	public static void main(String[] args) {
		try {
			Animal animal = new Animal();
			Dog dog = new Dog();
			Cat cat = new Cat();
			
			Animal aniDog = dog;
			Animal aniCat = cat;
			
			dog = (Dog)aniDog;
			System.out.println("1예외");
			
			dog = (Dog)animal;	// 예외발생
			System.out.println("2예외");
			
		} catch(ClassCastException cx) {
			System.out.println("부모타입을 자식타입으로 형변환 불가");
		}

	}

}
