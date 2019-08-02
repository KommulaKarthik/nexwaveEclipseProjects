
//Using interface we can support the functionality of multiple inheritance

class Animal {

}

interface Pet {

}

interface Mammal {


}

class Dog extends Animal implements Pet, Mammal {

}

class Tiger extends Animal implements Mammal {

}

class Hen extends Animal implements Pet {

}

public class UseOfInterface2 {

	public static void main(String[  ] args) {

		takeAnimal(new Dog( ));
		takePet(new Dog( ));
		takeMammal(new Dog( ));

		takeAnimal(new Tiger( ));
		takeMammal(new Tiger( ));
		
		takeAnimal(new Hen( ));
		takePet(new Hen( ));
	}

	static void takePet(Pet pet) {

	}

	static void takeAnimal(Animal animal) {

	}

	static void takeMammal(Mammal mammal) {

	}
}

