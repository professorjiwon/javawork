package _01_abstract;

public class Pet_main {

	public static void main(String[] args) {
		Pet pet = new Frog("황소개구리","갈색","엄청 먹음");
		pet.info();
		System.out.println(pet);
		System.out.print("울음소리 : ");
		pet.sound();
		System.out.println("종류 : " + pet.getKind());
		System.out.println("색상 : " + pet.getColor());
		System.out.println("특징 : " + pet.getFeature());
		System.out.println("--------------------------------------");
		
		pet = new Cat();
		pet.info();
		System.out.println(pet);
		System.out.print("울음소리 : ");
		pet.sound();
		System.out.println("종류 : " + pet.getKind());
		System.out.println("색상 : " + pet.getColor());
		System.out.println("특징 : " + pet.getFeature());
		System.out.println("--------------------------------------");
		
		pet = new Dog();
		pet.info();
		System.out.println(pet);
		System.out.print("울음소리 : ");
		pet.sound();
		System.out.println("종류 : " + pet.getKind());
		System.out.println("색상 : " + pet.getColor());
		System.out.println("특징 : " + pet.getFeature());
	}
}