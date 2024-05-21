package _01_polymorphosm;

public class PetRun {

	public static void main(String[] args) {
		Pet pet1 = new Frog("황소개구리","갈색","엄청 잘먹음");
		pet1.info();
		System.out.println(pet1);
		System.out.print("울음소리 : ");
		pet1.sound();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		System.out.println("------------------------------");
		
		pet1 = new Cat();
		pet1.info();
		System.out.println(pet1);
		System.out.print("울음소리 : ");
		pet1.sound();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		System.out.println("------------------------------");
		
		pet1 = new Dog();
		pet1.info();
		System.out.println(pet1);
		System.out.print("울음소리 : ");
		pet1.sound();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
	}
}
