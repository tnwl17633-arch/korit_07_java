package Animal;

import ch13_inheritance.Animal;
import ch15_casting.animals.Dog;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        System.out.println("동물이 소리를 냅니다.");

    }
}


